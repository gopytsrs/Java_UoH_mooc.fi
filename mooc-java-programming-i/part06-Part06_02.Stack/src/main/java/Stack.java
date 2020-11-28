
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
public class Stack {
    ArrayList<String> stack;
    
    public Stack(){
        stack = new ArrayList<>();
    }
    
    public boolean isEmpty(){
        return stack.size() == 0;
    }
    
    public void add(String value){
        stack.add(value);
    }
    
    public ArrayList<String> values(){
        return stack;
    }
    
    public String take(){
        return stack.remove(stack.size()-1);
    }
    
    
}
