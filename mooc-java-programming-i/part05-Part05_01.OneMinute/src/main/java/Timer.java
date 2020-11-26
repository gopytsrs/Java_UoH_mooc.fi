/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sean2
 */
public class Timer {
    private int hundredth;
    private int seconds;
    
    public Timer(){
        this.hundredth = 0;
        this.seconds = 0;
    }
    
    public void advance(){
        hundredth++;
        if(hundredth == 100){
            hundredth = 0;
            seconds++;
        }
        if(seconds == 60){
            seconds = 0;
        }
    }
    
    public String toString(){
        if(seconds < 10 && hundredth < 10){
            return String.format("0%d:0%d",seconds,hundredth);
        } else if (seconds < 10 && hundredth >= 10) {
            return String.format("0%d:%d",seconds,hundredth);
        } else if (seconds >= 10 && hundredth < 10){
            return String.format("%d:0%d",seconds,hundredth);
        } else {
            return String.format("%d:%d",seconds,hundredth);
        }
    }
   
}
