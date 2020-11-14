
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldestAge = -1;
        String oldestName = "";
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")) break;
            
            String[] array = input.split(",");
            int age = Integer.valueOf(array[1]);
            if(age>oldestAge){
                oldestAge = age;
                oldestName = array[0];
            }
        }
        System.out.println("Name of the oldest: " + oldestName);

    }
}
