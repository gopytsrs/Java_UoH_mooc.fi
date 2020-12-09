/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sean2
 */
public class Bird {
    private String name;
    private String latinName;
    private int observations;
    
    public Bird(String name, String latinName){
        this.name = name;
        this.latinName = latinName;
        this.observations = 0;
    }
    
    public void observed(){
        this.observations++;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getLatinName(){
        return this.latinName;
    }
    
    public boolean equals(Object compared){
        if(this == compared){
            return true;
        }
        
        if(!(compared instanceof Bird)){
            return false;
        }
        
        Bird comparedBird = (Bird) compared;
        
        if(this.name == comparedBird.name || this.latinName == comparedBird.latinName){
            return true;
        }
        return false;   
    }
    
    public String toString(){
        return String.format("%s (%s): %d observations", this.name, this.latinName, this.observations);
    }
}
