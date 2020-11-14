
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        try(Scanner reader = new Scanner(Paths.get(file))){
            while(reader.hasNextLine()){
                
                //if(reader.nextLine().isEmpty()) continue;
                
                String record = reader.nextLine();
                String[] array = record.split(",");
                
                String name = array[0];
                int age = Integer.valueOf(array[1]);
                
                if(age==1) System.out.printf("%s, age: %d year%n",name,age);
                else System.out.printf("%s, age: %d years%n",name,age);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
