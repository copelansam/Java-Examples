/*Class: CSE 1321L
        Section: J51
        Term: Spring 2024
        Instructor: Vinesh Babu Yaganti
        Name: Samuel Copelan
        Lab#: 6
        */
import java.util.Scanner;
import java.util.Random;
public class Lab6B {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int user, tries = 0 ;
        float random = -1;
        System.out.print("Enter a number between 1 and 1000: ");
        user = sc.nextInt();
        while (user >= 1 && user <= 1000 && random != user) {
            while (random != user) {
                Random rand = new Random();
                random = rand.nextInt(1000);
                tries++;
                System.out.println("My guess was " + random);
            }

        }
        System.out.println("I guessed the number was " + random + " and it only took me " + tries + " guesses");
    }
}
