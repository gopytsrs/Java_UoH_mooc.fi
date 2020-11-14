
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = 0;
        int sum = 0;
        int input = 1;
        
        while(input!=0){
            System.out.println("Give a number:");
            input = Integer.valueOf(scanner.nextLine());
            
            if(input!=0){
                numbers++;
                sum += input;
            }
        }
        System.out.println("Number of numbers: " + numbers);
        System.out.println("Sum of the numbers: " + sum);
    }
}
