
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int edgeLength = Integer.valueOf(scanner.nextLine());
        
        Cube cube = new Cube(edgeLength);
        
        System.out.println(cube);
        // Experiment with your program here
    }
}
