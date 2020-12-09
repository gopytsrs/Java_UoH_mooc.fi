
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sean2
 */
public class Reader {
    
    public Reader(){
        
    }
    
    public void readFile(String filename, RecipeList recipes){
                 
        try(Scanner scanner = new Scanner(Paths.get(filename))){
            int i = 0;
            String name = "";
            int cookingTime = 0;
            IngredientList ingredients = new IngredientList();
            
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                if(line.isEmpty()){
                    i = 0;
                    Recipe recipe = new Recipe(name,cookingTime,ingredients);
                    recipes.add(recipe);
                    ingredients = new IngredientList();
                    System.out.println("Added");
                    continue;
                }
                if(i == 0) name = line;
                if(i == 1) cookingTime = Integer.valueOf(line);
                
                ingredients.add(line);
                
                i++;
                                               
            }
            
           
            Recipe recipe = new Recipe(name, cookingTime, ingredients);
            recipes.add(recipe);
            System.out.println("Added");
            
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
