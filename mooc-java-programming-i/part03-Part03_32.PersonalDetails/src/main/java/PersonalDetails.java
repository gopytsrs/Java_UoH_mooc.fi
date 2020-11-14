
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longestName = "";
        int length = 0;
        int sum = 0;
        int count = 0;
        
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")) break;
            
            String[] array = input.split(",");
            sum += Integer.valueOf(array[1]);
            
            if(array[0].length()>length){
                length = array[0].length();
                longestName = array[0];
            }
            count++;
            
        }
        
        System.out.println("Longest name: " + longestName);
        
        double average = 1.0*sum/count;
        System.out.println("Average of the birth years: " + average);
    }
}
