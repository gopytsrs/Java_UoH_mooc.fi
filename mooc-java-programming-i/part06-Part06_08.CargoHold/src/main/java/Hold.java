/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author sean2
 */
public class Hold {
    
    private ArrayList<Suitcase> hold;
    private int maxWeight;
    
    public Hold(int maxWeight){
        this.maxWeight = maxWeight;
        this.hold = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase){
        if(totalWeight() + suitcase.totalWeight() > maxWeight){
            return;
        } else {
            this.hold.add(suitcase);
        }
    }
    
    public int totalWeight(){
        int totalWeight = 0;
        for(Suitcase suitcase: hold){
            totalWeight += suitcase.totalWeight();
        }
        
        return totalWeight;
    }
    
    public void printItems(){
        for(Suitcase suitcase: hold){
            suitcase.printItems();
        }
    }
    
    public String toString(){
        int totalWeight = 0;
        
        for(Suitcase suitcase: hold){
            totalWeight += suitcase.totalWeight();
        }
        
        return String.format("%d suitcases (%d kg)",hold.size(),totalWeight);            
    }   
}
