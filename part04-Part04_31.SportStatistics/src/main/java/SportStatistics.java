
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        ArrayList<Team>match = new ArrayList<>();
        String filePath = scan.nextLine();
        System.out.println("Team:");
        String teamName = scan.nextLine();
        int matchesPlayed =0;
        int gamesWon =0;
        int gamesLost =0;
        try (Scanner sc = new Scanner(Paths.get(filePath))){
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                String [] arr = line.split(",");
                String TeamA = arr[0];
                String TeamB = arr[1];
                int teamAscore = Integer.valueOf(arr[2]);
                int teamBscore = Integer.valueOf(arr[3]);
                if(teamName.equals(TeamA) || teamName.equals(TeamB)){
                     matchesPlayed++;
                }
                if (teamName.equals(TeamA) && (teamAscore > teamBscore)){
                   
                    gamesWon++;
                }if (teamName.equals(TeamB) && (teamAscore < teamBscore)){
                    gamesWon++;
                }
            }
            System.out.println("Games: "+matchesPlayed);
            System.out.println("Wins: "+gamesWon);
            System.out.println("Losses: "+(matchesPlayed-gamesWon));
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("error"+e);
        }
    }

}
