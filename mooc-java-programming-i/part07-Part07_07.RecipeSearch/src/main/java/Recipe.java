/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sean2
 */
public class Recipe {
    private String name;
    private int cookingTime;
    private IngredientList ingredients;
    
    public Recipe(String name, int cookingTime, IngredientList ingredients){
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = ingredients;
    }
    
    public boolean contains(String name){
       return this.name.contains(name);           
    }
    
    public boolean shorterCookingTime(int desiredCookingTime){
        return this.cookingTime <= desiredCookingTime;
    }
    
    public boolean hasIngredient(String ingredient){
        return ingredients.contains(ingredient);
    }
    
    public String toString(){
        return String.format("%s, cooking time: %d",this.name,this.cookingTime);
    }
}
