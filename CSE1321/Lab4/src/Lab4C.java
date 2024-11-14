/*Class: CSE 1321L
        Section: J51
        Term: Spring 2024
        Instructor: Vinesh Babu Yaganti
        Name: Samuel Copelan
        Lab#: 4
        */
import java.util.Scanner;
public class Lab4C {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int action;
        float number, number2;
        System.out.println("Welcome!");
        System.out.print("Please input a number: ");
        number = sc.nextFloat();

        System.out.println("What would you like to do to this number:");
        System.out.println("0) Get the additive inverse of the number");
        System.out.println("1) Get the reciprocal of the number");
        System.out.println("2) Square the number");
        System.out.println("3) Cube the number");
        System.out.println("4) Exit the program");

        action = sc.nextInt();

        switch (action){
            case 0: number2 = -number;
            System.out.println("The additive inverse of " + number + " is " + number2);
            break;
            case 1: number2 = 1 / number;
            System.out.println("the reciprocal of " + number + " is " + number2);
            break;
            case 2: number2 = number * number;
            System.out.println("The square of " + number + " is " + number2);
            break;
            case 3: number2 = number * number * number;
            System.out.println("The cube of " + number + " is " + number2);
            break;
            case 4: System.out.println("Thank you, Goodbye!");
            break;
            default: System.out.println("Invalid input, please try again!");
            break;
        }




    }
}
