import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> books = new ArrayList<Book>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("Title:");
            String name = scanner.nextLine();
            if(name.isEmpty()) break;
            
            System.out.println("Pages:");
            int pages = Integer.valueOf(scanner.nextLine());
            
            System.out.println("Publication Year:");
            int year = Integer.valueOf(scanner.nextLine());
            
            Book book = new Book(name,year,pages);
            books.add(book);
        }
        
        System.out.println("What information will be printed?");
        String choice = scanner.nextLine();
        for(Book book: books){
            if(choice.equals("everything")){
                System.out.println(book);
            }
            else if(choice.equals("name")){
                System.out.println(book.getTitle());
            }
        }

    }
}
