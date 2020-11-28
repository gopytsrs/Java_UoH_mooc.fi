/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author sean2
 */
public class UserInterface {
    
    private JokeManager manager;
    private Scanner scanner;
    
    public UserInterface(JokeManager manager, Scanner scanner){
        this.manager = manager;
        this.scanner = scanner;
    }
    
    public void start(){
        while(true){
            System.out.println("Commands:");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");
            
            String command = scanner.nextLine();
            
            if(command.equals("X")){
                break;
            }
            
            switch(command){
                case "1":
                    add();
                    break;
                case "2":
                    draw();
                    break;
                case "3":
                    list();
                    break;
                default:
                    System.out.println("Invalid input entered");
            }
            
            
        }
    }
    
    public void add(){
        System.out.println("Write the joke to be added:");
        String joke = scanner.nextLine();
        manager.addJoke(joke);
    }
    
    public void draw(){
        String joke = manager.drawJoke();
        System.out.println(joke);
    }
    
    public void list(){
        manager.printJokes();
    }
}
