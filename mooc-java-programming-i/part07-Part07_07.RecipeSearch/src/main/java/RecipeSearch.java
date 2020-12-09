
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RecipeList recipes = new RecipeList();
        Reader reader = new Reader();
        
        System.out.println("File to read:");
        String filename = scanner.nextLine();
        reader.readFile(filename, recipes);
        System.out.println("");
        
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipe by name");
        System.out.println("find cooking time - searches recipe by cooking time");
        System.out.println("find ingredient - searches recipe by ingredient");
        
        while(true){
            System.out.println("Enter command:");
            String command = scanner.nextLine();
            if(command.isEmpty()) continue;
            
            if(command.equals("list")){
                recipes.list();
            } else if (command.equals("stop")){
                break;
            } else if (command.equals("find name")){
                System.out.println("Searched word: ");
                String name = scanner.nextLine();
                recipes.findName(name);
            } else if (command.equals("find cooking time")){
                System.out.println("Max cooking time: ");
                int cookingTime = Integer.valueOf(scanner.nextLine());
                recipes.findCookingTime(cookingTime);
            } else if (command.equals("find ingredient")){
                System.out.println("Ingredient: ");
                String ingredient = scanner.nextLine();
                recipes.findIngredient(ingredient);
            }
        }
        
    }

}
