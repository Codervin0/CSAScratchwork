import java.util.Scanner;

public class Practice091126 {
      public static void main(String[] args) {
      
         int fbPlayersNum = 40;
         double avgTimePlayed = 12.56;
         boolean winLose = true;
         String teamName = "Ballard Beavers";
         
            System.out.println("please enter team name");
            Scanner scan = new Scanner(System.in);
            teamName = scan.nextLine();
            System.out.println("you entered teamname " + teamName + ",");
            scan.close();
      
      }
}