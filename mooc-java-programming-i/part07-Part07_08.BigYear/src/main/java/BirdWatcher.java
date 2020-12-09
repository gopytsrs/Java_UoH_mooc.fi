
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
public class BirdWatcher {
    private ArrayList<Bird> birds;
    private Scanner scanner;
    
    public BirdWatcher(Scanner scanner){
        this.birds = new ArrayList<Bird>();
        this.scanner = scanner;
    }
    
    public void add(){
        System.out.println("Name:");
        String name = scanner.nextLine();
        System.out.println("Name in Latin:");
        String latinName = scanner.nextLine();
        Bird birdToAdd = new Bird(name,latinName);
        
        for(Bird bird: birds){
            if(bird.equals(birdToAdd)){
                System.out.println("Already exits!");
                return;
            }
        }
        
        birds.add(birdToAdd);
    }
    
    public void observed(){
        if(birds.size() == 0){
            System.out.println("No birds yet!");
            return;
        }
        System.out.println("Bird?");
        String birdName = scanner.nextLine();
        
        
        for(Bird bird: birds){
            if(bird.getName().equals(birdName)){
                bird.observed();
                return;
            }
        }              
        System.out.println("Not a bird!");
    }
    
    public void printOne(){
        if(birds.size() == 0){
            System.out.println("No birds yet!");
            return;
        }
        System.out.println("Bird?");
        String birdName = scanner.nextLine();
        
        for(Bird bird: birds){
            if(bird.getName().equals(birdName)){
                System.out.println(bird);
                return;
            }
        }
        System.out.println("Not a bird!");
    }
    
    public void printAll(){
        if(birds.size() == 0){
            System.out.println("No birds yet!");
            return;
        }
        
        for(Bird bird: birds){
            System.out.println(bird);
        }
    }
    
}
