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
public class JokeManager {
    
    private ArrayList<String> jokes;
    
    public JokeManager(){
        this.jokes = new ArrayList<>();
    }
    
    public void addJoke(String joke){
        this.jokes.add(joke);
    }
    
    public String drawJoke(){
        
        if(jokes.isEmpty()){
            return "Jokes are in short supply.";
        }
        
        Random rand = new Random();
        int index = rand.nextInt(jokes.size());
        return jokes.get(index);
    }
    
    public void printJokes(){
        for(String joke: jokes){
            System.out.println(joke);
        }
    }
}
