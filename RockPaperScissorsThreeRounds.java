package rockpaperscissorsthreerounds;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Sherwin
 */
public class RockPaperScissorsThreeRounds {

    public static void main(String[] args) {
        String PlayerChoice;
        String OpponentChoice = "R";
        int OpponentNumber;
        int WinCount = 0;
        Scanner input = new Scanner(System.in);
        Random generate = new Random();
        
        System.out.println("Let's play Rock, Paper, Scissors. Best of 3 games!");
        
        for (int Round = 1; Round < 4; Round++) {
            
            System.out.println("\nWhat is your choice? (Rock = R, Paper = P, Scissors = S)\n");
            PlayerChoice = input.next(); //Receive input from user on what move they pick (R, P, or S)
        
            OpponentNumber = generate.nextInt(3)+1; //Randomly generate 1, 2 or 3 for Opponent
            if (OpponentNumber == 1) 
                OpponentChoice = "R"; // If 1 is generated, set opponent's choice to Rock
            else if (OpponentNumber == 2)
                OpponentChoice = "P"; // If 2 is generated, set opponent's choice to Paper
            else if (OpponentNumber == 3)
                OpponentChoice = "S"; // If 3 is generated, set opponent's choice to Scissors
            
            System.out.println("I picked " + OpponentChoice);            
        
            if (PlayerChoice.equals(OpponentChoice))
                System.out.println("It looks like a tie.");
            else if (PlayerChoice.equals("R")){
                if (OpponentChoice.equals("S")){
                    System.out.println("Nooo! Your Rock crushed my Scissors.");
                    WinCount++;
                }    
                else if (OpponentChoice.equals("P"))
                    System.out.println("My Paper covers your Rock.");
            }
            else if (PlayerChoice.equals("P")){
                if (OpponentChoice.equals("R")){
                    System.out.println("Ahh! Your Paper covers my Rock.");
                    WinCount++;
                }    
                else if (OpponentChoice.equals("S"))
                    System.out.println("My Scissors cuts your paper!");
            }
            else if (PlayerChoice.equals("S")){
                if (OpponentChoice.equals("R"))
                    System.out.println("Sorry! My Rock crushes your Scissors.");
                else if (OpponentChoice.equals("P")){
                    System.out.println("Woah! Your Scissors cut my Paper.");
                    WinCount++;
                }
            }
            
        }
        if (WinCount >= 2)
            System.out.println("\nYou won " + WinCount + " out of 3 rounds. You beat me!");
        else if (WinCount == 1)
            System.out.println("\nYou only won " + WinCount + " out of 3 rounds. Not enough to win!");         
        else
            System.out.println("\nYou didn't win any rounds! Better luck next time.");
    }
}