import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
/*         for(int i = 0; i < 10; i++)
        {
            System.out.println("Kaylee");
        }
 */

        Scanner in = new Scanner(System.in);
        
        //read user's guess
        System.out.print("Please enter rock/scissors/paper: ");
        String userGuess = in.nextLine().toLowerCase();

        //generate computer guess
        String[] values = {"rock", "scissors", "paper"};//index:0,1,2
        String computerGuess = values [ (int) (Math.random()*3) ];

        //decide winner
        if(userGuess.equals(computerGuess))//draw
        {
            System.out.println("draw! " + " computer choice: "+ computerGuess);
        }
        else if(   //computer winning combinations
            (computerGuess.equals("scissors") && userGuess.equals("paper"))  
               ||
               (computerGuess.equals("paper") && userGuess.equals("rock"))  
               ||
               (computerGuess.equals("rock") && userGuess.equals("scissors"))  
            )
        {
            System.out.println("computer won! computer choice: "+ computerGuess);
        }
        else{
            System.out.println("user won! computer choice: "+ computerGuess);
        }

        in.close();
    }
}