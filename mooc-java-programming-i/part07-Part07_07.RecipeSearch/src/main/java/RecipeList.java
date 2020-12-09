
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sean2
 */
public class RecipeList {
    private ArrayList<Recipe> recipes;
    
    public RecipeList(){
        this.recipes = new ArrayList<Recipe>();
    }
    
    public void add(Recipe recipe){
        this.recipes.add(recipe);
    }
    
    public void list(){
        System.out.println("Recipes:");
        for(Recipe recipe: this.recipes){
            System.out.println(recipe);
        }
        System.out.println("");
    }
    
    public void findName(String name){
        System.out.println("");
        System.out.println("Recipes:");
        for(Recipe recipe: this.recipes){
            if(recipe.contains(name)){
                System.out.println(recipe);
            }
        }
        System.out.println("");
    }
    
    public void findCookingTime(int cookingTime){
        System.out.println("");
        System.out.println("Recipes:");
        for(Recipe recipe: recipes){
            if(recipe.shorterCookingTime(cookingTime)){
                System.out.println(recipe);
            }
        }
        System.out.println("");
    }
    
    public void findIngredient(String ingredient){
        System.out.println("");
        System.out.println("Recipes:");
        for(Recipe recipe: recipes){
            if(recipe.hasIngredient(ingredient)){
                System.out.println(recipe);
            }
        }
        System.out.println("");
    }
    
    
}
