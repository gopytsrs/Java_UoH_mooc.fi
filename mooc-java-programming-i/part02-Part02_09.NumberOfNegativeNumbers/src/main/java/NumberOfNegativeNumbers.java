
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numNegative = 0;
        int input = 1;
        while(input!=0){
            System.out.println("Give a number:");
            input = Integer.valueOf(scanner.nextLine());
            
            if(input<0){
                numNegative++;
            }
        }
        System.out.println("Number of negative numbers: " + numNegative);
    }
}
