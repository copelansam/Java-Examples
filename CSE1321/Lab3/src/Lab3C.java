/*Class: CSE 1321L
        Section: J51
        Term: Spring 2024
        Instructor: Vinesh Babu Yaganti
        Name: Samuel Copelan
        Lab#: 3
        */
import java.util.Scanner;
public class Lab3C {
    public static void main(String[] args){
        int quarters, dimes, nickels, pennies, quarterValue, dimeValue, nickelValue, pennyValue, totalValue, totalDollar, totalCents;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of quarters: ");
        quarters = sc.nextInt();
        quarterValue = quarters * 25;

        System.out.print("Enter the number of dimes: ");
        dimes = sc.nextInt();
        dimeValue = dimes * 10;

        System.out.print("Enter the number of nickels: ");
        nickels = sc.nextInt();
        nickelValue = nickels * 5;

        System.out.print("Enter the number of pennies: ");
        pennies = sc.nextInt();
        pennyValue = pennies * 1;

        totalValue = quarterValue + dimeValue + nickelValue + pennyValue;

        System.out.println("You entered " + quarters + " quarters.");
        System.out.println("You entered " + dimes + " dimes.");
        System.out.println("You entered " + nickels + " nickels.");
        System.out.println("You entered " + pennies + " pennies.");
        totalDollar = totalValue / 100;
        totalCents = totalValue % 100;
        System.out.println("Your total is " + totalDollar + " dollars and " + totalCents + " cents.");

    }
}
