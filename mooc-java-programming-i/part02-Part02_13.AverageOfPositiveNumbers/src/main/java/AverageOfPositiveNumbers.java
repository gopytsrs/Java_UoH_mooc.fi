
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numbers = 0;
        
        int input = 1;
        
        while(input!=0){
            //System.out.println("Give a number:");
            input = Integer.valueOf(scanner.nextLine());
            
            if(input>0){
                sum += input;
                numbers++;
            }
        }
        if(numbers==0){
            System.out.println("Cannot calculate the average");
        } else {
            double average = (double)sum/numbers;
            System.out.println("Average of the numbers: " + average);  
        }

    }
}
