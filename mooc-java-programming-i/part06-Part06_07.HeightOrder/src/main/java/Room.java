
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
public class Room {
    
    private ArrayList<Person> people;
    
    public Room(){
        this.people = new ArrayList<>();
    }
    
    public void add(Person person){
        this.people.add(person);
    }
    
    public boolean isEmpty(){
        return this.people.size() == 0;
    }
    
    public ArrayList<Person> getPersons(){
        return people;
    }
    
    public Person shortest(){
        if(people.isEmpty()){
            return null;
        }
        
        Person shortest = this.people.get(0);
        
        for(Person person: people){
            if(person.getHeight() < shortest.getHeight()){
                shortest = person;
            }
        }
        
        return shortest;
    }
    
    public Person take(){
        if(isEmpty()){
            return null;
        }
        Person toRemove = shortest();
        this.people.remove(toRemove);
        return toRemove;
    }
    
    
}
