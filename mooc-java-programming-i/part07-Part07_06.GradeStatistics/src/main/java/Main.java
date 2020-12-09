
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        
        Grades grades = new Grades();
        
        System.out.println("Enter point totals, -1 stops:");
        while(true){
            String input = scanner.nextLine();
            
            if(input.isEmpty()) continue;
            if(input.equals("-1")) break;
            
            int grade = Integer.valueOf(input);
            grades.add(grade);
            
        }
        
        grades.average();
        grades.averagePassing();
        grades.passPercentage();
        grades.gradeDistribution();
    }
}
