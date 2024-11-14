import java.util.Scanner;
import java.util. Random;
public class Assignment4B {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
       int difficulty, num1 = 0, num2 = 0, cont = 0, question = 1, answer = 0, wrong = 0, correct = 0;
       System.out.println("[Mathletes Game]");
       System.out.print("Choose a game mode (0=Easy, 1=Hard): ");
       difficulty = sc.nextInt();
       Random rand = new Random();

       if (difficulty == 0){
           System.out.println("Playing on easy mode, huh? Okay!");
           while (question <= 3 || answer != (num1 * num2)){
               num1 = rand.nextInt(-255,256);
               num2 = rand.nextInt(-255,256);
               System.out.println("Q" + question + ". " + num1 + " * " + num2 + " = ?");
               answer = sc.nextInt();


               while (answer != (num1 * num2)) {
                   wrong++;
                   System.out.println("Incorrect! Try again.");
                   answer = sc.nextInt();
                   if (answer != (num1 * num2)) {
                       wrong++;
                       System.out.println("Incorrect!");
                       System.out.println("Game over...");

                       if (wrong == 2) {
                           break;
                       }
                   }
               }
               if (wrong == 2){
                   break;
               }

               if (answer == (num1 * num2)){
                   System.out.println("Correct!");
                   question++;
               }





               if (question == 4) {
                   System.out.print("You win!");
               }



           }

       }


       if (difficulty == 1){
           System.out.println("So, you want a challenge? Okay!");
           while (cont == 0 && correct < 6){
               num1 = rand.nextInt(-255,256);
               num2 = rand.nextInt(-255,256);
               System.out.println("Q" + question + ". " + num1 + " * " + num2 + " = ?");
               answer = sc.nextInt();

               if (answer == (num1 * num2)){
                   System.out.println("Correct!");
                   correct++;
                   question++;
               }

               if (answer != (num1 * num2)){
                   System.out.println("Incorrect!");
                   System.out.println("Game over...");
                   cont++;
               }

               if (correct == 6){
                   System.out.println("You win!");
                   break;
               }
           }
       }



    }
}
