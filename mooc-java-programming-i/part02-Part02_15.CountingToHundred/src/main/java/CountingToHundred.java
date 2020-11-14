
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        for(int i=Integer.valueOf(scanner.nextLine());i<=100;i++){
            System.out.println(i);
        }

    }
}
