
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
public class IngredientList {
    private ArrayList<String> ingredientList;
    
    public IngredientList(){
        this.ingredientList = new ArrayList<String>();
    }
    
    public void add(String ingredient){
        this.ingredientList.add(ingredient);
    }
    
    public boolean contains(String ingredient){
        return this.ingredientList.contains(ingredient);
    }
}
