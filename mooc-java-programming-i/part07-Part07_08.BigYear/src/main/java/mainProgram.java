
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        BirdWatcher birds = new BirdWatcher(scan);
        
        while(true){
            System.out.println("?");
            
            String command = scan.nextLine();
            
            if(command.equals("Quit")){
                break;
            } else if (command.equals("Add")){
                birds.add();
            } else if (command.equals("Observation")){
                birds.observed();
            } else if (command.equals("One")){
                birds.printOne();
            } else if (command.equals("All")){
                birds.printAll();
            }
            
        }

    }

}
