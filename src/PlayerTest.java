import java.util.*;
public class PlayerTest {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Please provide the following details . . . ");
        System.out.println("Please provide your name : ");
        String name = s.next();
        System.out.println("Please provide your age : ");
        int age = s.nextInt();
        System.out.println("Please provide the name of game : ");
        String game = s.next();

        Player ply = new Player(name, age, game);

        String plyName = ply.GetPlayerName();
        int plyAge = ply.GetPlayerAge();
        String plyGameType = ply.GetGameType();

        System.out.println("\n Player's Details : ");
        System.out.println("\n Player's Name: " + plyName);
        System.out.println("\n Player's Age: " + plyAge);
        System.out.println("\n Player's Gametype: " + plyGameType);

        System.out.println("\n Do you want to log in time for game start ? \n Enter yes to start counting time, no to exit! ");
        String ans1 = s.next();

        // //try {
        //     //int plyAge = ply.GetPlayerAge();
        // } 
        // catch (Exception e) {
        // }

        long start, end;

        if(ans1.equalsIgnoreCase("yes")){
            start = System.currentTimeMillis();

            System.out.println("\n Waiting for game time . . . ");
            System.out.println("\n Please log in the time once you finish the game . . . ");
            System.out.println(
                    "\n Do you want to log in time for game end ? \n Enter yes to start counting time, no to exit! ");

            String ans2 = s.next();

            if(ans2.equalsIgnoreCase("yes")){
                end = System.currentTimeMillis();

                long difference = end - start;
                long minutes = (difference/1000) % 60;
                long seconds = (difference/1000) % 60;

                System.out.println("\n Dear Player! You have played for " + difference + " Milliseconds = " + minutes + " minutes and " + seconds + " seconds.");
            }
            else{
                System.out.println("\n Thanks for your time with us! ");
                System.out.println("\n Do remember us when you play again ! ");
                System.exit(1);
            }
        }
        
        else{
            System.out.println("\n Thanks for your time with us! ");
            System.out.println("\n Do remember us when you play again ! ");
            System.exit(1);
        }

    }
}
