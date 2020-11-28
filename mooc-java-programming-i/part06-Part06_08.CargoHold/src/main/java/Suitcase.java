
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
public class Suitcase {
    
    private ArrayList<Item> items;
    private int maxWeight;
    
    public Suitcase(int maxWeight){
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }
    
    public void addItem(Item item){
        if(totalWeight()+item.getWeight() > maxWeight){
            return;
        } else {
            this.items.add(item);
        }
    }
    
    public void printItems(){
        for(Item item: items){
            System.out.println(item);
        }
    }
    
    public int totalWeight(){
        int totalWeight = 0;
        
        for(Item item: items){
            totalWeight += item.getWeight();
        }
        
        return totalWeight;
    }
    
    public Item heaviestItem(){
        if(items.isEmpty()){
            return null;
        }
        
        Item heaviest = items.get(0);
        
        for(Item item: items){
            if(item.getWeight() > heaviest.getWeight()){
                heaviest = item;
            }
        }
        
        return heaviest;
    }
    
    public String toString(){
        int totalWeight = 0;
        
        if(items.isEmpty()){
            return "no items (0 kg)";
        }
        
        
        for(Item item: items){
            totalWeight += item.getWeight();
        }
        
        if(items.size() == 1){
            return String.format("1 item (%d kg)",totalWeight);
        }
        return String.format("%d items (%d kg)",items.size(),totalWeight);
    }
}
