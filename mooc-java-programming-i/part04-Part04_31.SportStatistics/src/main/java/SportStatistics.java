
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        
        System.out.println("Team:");
        String team = scan.nextLine();
        int games = 0;
        int wins = 0;
        int losses = 0;
        
        try(Scanner reader = new Scanner(Paths.get(file))){
            while(reader.hasNextLine()){
                String record = reader.nextLine();
                String[] parts = record.split(",");
                
                String team1 = parts[0];
                String team2 = parts[1];
                int team1Score = Integer.valueOf(parts[2]);
                int team2Score = Integer.valueOf(parts[3]);
                
                if(team1.equals(team)){
                    if(team1Score>team2Score){
                        wins++;
                    } else {
                        losses++;
                    }
                    games++;
                } else if (team2.equals(team)){
                    if(team2Score>team1Score){
                        wins++;
                    } else {
                        losses++;
                    }
                    games++;
                }
                
                
            }
            System.out.println("Games: " + games);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);
        } catch (Exception e) {
            System.out.println("Error message, file can't be read.");
        }

    }

}
