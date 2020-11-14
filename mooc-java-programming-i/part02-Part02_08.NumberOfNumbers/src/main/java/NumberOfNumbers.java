
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfValues = 0;
        
        int input = 1;
        while(input!=0){
            System.out.println("Give a number:");
            input = Integer.valueOf(scanner.nextLine());
            if(input!=0){
                numOfValues++;
            }
            
        }
        System.out.println("Number of numbers: " + numOfValues);

    }
}
