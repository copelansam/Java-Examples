/*Class: CSE 1321L
        Section: J51
        Term: Spring 2024
        Instructor: Vinesh Babu Yaganti
        Name: Samuel Copelan
        Lab#: 6
        */
import java.util.Scanner;
public class Lab6A {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int number = 0, numberBig = 0, counter = 0;
        System.out.println("Please enter 10 numbers and this program will display the largest.");
        for (counter = 1; counter < 11; counter++){
            System.out.print("Please enter number " + counter + ": ");
            number = sc.nextInt();
            if (number > numberBig){
                numberBig = number;
            }
            }
        System.out.println("The largest number was " + numberBig);
        }
    }

