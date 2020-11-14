
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")) break;
            String[] array = input.split(" ");
            for(String string: array){
                if(string.contains("av")){
                    System.out.println(string);
                }
            }
        }


    }
}
