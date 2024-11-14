import java.util.Random;
import java.util.Scanner;
public class Assignment5A {
    static public void main (String[] args){
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int games;
        String myMove, computer;
        System.out.print("How many game do you want to play?: ");
        games = sc.nextInt();
        String[] moves = new String [games];
        String[] victors = new String [games];
        String[] computerMove = {"Rock", "Paper", "Scissors"};

        for (int i = 0; i < games; i++){
            Scanner scan = new Scanner (System.in);
            System.out.print("Round " + (i + 1) + ": What do you want to throw?: ");
            myMove = scan.nextLine();

            computer = computerMove[rand.nextInt(3)];
            System.out.println("Computer threw " + computer.toUpperCase() +"!");


            if (myMove.equalsIgnoreCase(computer)){
                victors[i] = "Tied on";
                moves[i] = computer;

            }

            else if ((myMove.equalsIgnoreCase(computerMove[0]) && computer.equals(computerMove[2])) || (myMove.equalsIgnoreCase(computerMove[2]) && computer.equals(computerMove[1])) || (myMove.equalsIgnoreCase(computerMove[1]) && computer.equals(computerMove[0]))){
                victors[i] = "Player won";
                moves[i] = myMove;
            }

            else if ((myMove.equalsIgnoreCase(computerMove[0]) && computer.equals(computerMove[1])) || (myMove.equalsIgnoreCase(computerMove[2]) && computer.equals(computerMove[0])) || (myMove.equalsIgnoreCase(computerMove[1]) && computer.equals(computerMove[2]))){
                victors[i] = "Computer won";
                moves[i] = computer;
            }
        }
        System.out.println("Game Over...");
        System.out.println();
        System.out.println("Here's the recap:");
        for (int i = 0; i < games; i++){
            System.out.println(victors[i] + " Round " + (i + 1) + " with " + moves[i]);

        }


    }
}
