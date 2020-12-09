
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
public class Grades {
    private ArrayList<Integer> allGrades;
    private ArrayList<Integer> passingGrades;
    private ArrayList<Integer> grade0;
    private ArrayList<Integer> grade1;
    private ArrayList<Integer> grade2;
    private ArrayList<Integer> grade3;
    private ArrayList<Integer> grade4;
    private ArrayList<Integer> grade5;
    
    public Grades(){
        this.allGrades = new ArrayList<Integer>();
        this.passingGrades = new ArrayList<Integer>();
        this.grade0 = new ArrayList<Integer>();
        this.grade1 = new ArrayList<Integer>();
        this.grade2 = new ArrayList<Integer>();
        this.grade3 = new ArrayList<Integer>();
        this.grade4 = new ArrayList<Integer>();
        this.grade5 = new ArrayList<Integer>();
    }
    
    public void add(int grade){
        if(grade < 0 || grade >= 100){
            return;
        }
        
        if(grade >= 50){
            passingGrades.add(grade);
        }
        
        if(grade < 50){
            grade0.add(grade);
        } else if (grade < 60){
            grade1.add(grade);
        } else if (grade < 70){
            grade2.add(grade);
        } else if (grade < 80){
            grade3.add(grade);
        } else if (grade < 90){
            grade4.add(grade);
        } else if (grade >= 90){
            grade5.add(grade);
        }
        
        allGrades.add(grade);
    }
    
    public void average(){
        int sum = 0;
        for(int grade: allGrades){
            sum += grade;
        }
        
        double average = (double) sum / allGrades.size();
        System.out.println("Point average (all): " + average);
    }
    
    public void averagePassing(){
        
        if(passingGrades.size() == 0){
            System.out.println("Point average (passing): -");
            return;
        }
        
        int sum = 0;
        for(int grade: passingGrades){
            sum += grade;
        }
        
        double average = (double) sum / passingGrades.size();
        System.out.println("Point average (passing): " + average);
    }
    
    public void passPercentage(){
        if(passingGrades.size() == 0){
            System.out.println("Pass percentage: 0.0");
            return;
        }
        
        double passingPercentage = (100.0) * passingGrades.size() / allGrades.size();
        System.out.println("Pass percentage: " + passingPercentage);
        
    }
    
    public void gradeDistribution(){
        System.out.println("Grade distribution:");
        System.out.print("5: ");
        printStars(grade5.size());
        System.out.print("4: ");
        printStars(grade4.size());
        System.out.print("3: ");
        printStars(grade3.size());
        System.out.print("2: ");
        printStars(grade2.size());
        System.out.print("1: ");
        printStars(grade1.size());
        System.out.print("0: ");
        printStars(grade0.size());
        
    }
    
    private static void printStars(int number){
        for(int i=0; i<number; i++){
            System.out.print("*");
        }
        System.out.println("");
    }
    
}
