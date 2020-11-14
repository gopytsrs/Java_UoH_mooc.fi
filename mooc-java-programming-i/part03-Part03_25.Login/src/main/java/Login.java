
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[]usernames = {"alex","emma"};
        String[]passwords = {"sunshine","haskell"};
        
        System.out.println("Enter username:");
        String username = scanner.nextLine();
        System.out.println("Enter password:");
        String password = scanner.nextLine();
        
        boolean loggedIn = false;
        for(int i = 0; i < usernames.length; i++){
            if(usernames[i].equals(username) && passwords[i].equals(password)){
                System.out.println("You have successfully logged in");
                loggedIn = true;
            }
        }
        if(!loggedIn) System.out.println("Incorrect username or password!");

    }
}
