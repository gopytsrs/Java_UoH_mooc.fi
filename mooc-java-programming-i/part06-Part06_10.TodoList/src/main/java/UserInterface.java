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
    
    private TodoList list;
    private Scanner scanner;
    
    public UserInterface(TodoList list, Scanner scanner){
        this.list = list;
        this.scanner = scanner;
    }
    
    public void start(){
        
        
        while(true){
            System.out.println("Command:");
            String command = scanner.nextLine();
            
            if(command.equals("stop")){
                break;
            }
            
            parseCommand(command);
            
        }
    }
    
    public void parseCommand(String command){
  
        if (command.equals("add")){
            add();
        } else if (command.equals("list")){
            list();
        } else if (command.equals("remove")){
            remove();
        }
    }
    
    public void add(){
        System.out.println("To add:");
        String task = scanner.nextLine();
        list.add(task);
    }
    
    public void list(){
        list.print();
    }
    
    public void remove(){
        System.out.println("Which one is removed?");
        int toRemove = Integer.valueOf(scanner.nextLine());
        list.remove(toRemove);
    }
}
