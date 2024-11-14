/*Class: CSE 1321L
        Section: J51
        Term: Spring 2024
        Instructor: Vinesh Babu Yaganti
        Name: Samuel Copelan
        Lab#: 6
        */
import java.util.Scanner;
public class Lab6C {
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);
        int current = 1000, deposit = 0, withdrawal = 0, selection = 0;
        char menu;
        System.out.println("Welcome!");
        System.out.println("You have $" + current + " in your account.");
        do{
            System.out.println("Menu");
            System.out.println("0) Make a deposit");
            System.out.println("1) Make a withdrawal");
            System.out.println("2) Display account value");
            System.out.println();
            System.out.print("Please make a selection: ");
            selection = scan.nextInt();

            if (selection == 0){
                System.out.print("How much would you like to deposit? : ");
                deposit = scan.nextInt();
                current += deposit;
                System.out.println("Your current balance is $" + current);
                System.out.print("Would you like to return to the main menu (Y/N)? :");
                menu = scan.next().charAt(0);
            }

            else if (selection == 1){
                System.out.print("How much would you like to withdraw? : ");
                withdrawal = scan.nextInt();
                current -= withdrawal;
                System.out.println("Your current balance is $" + current);
                System.out.print("Would you like to return to the main menu (Y/N)? :");
                menu = scan.next().charAt(0);
            }

            else if (selection == 2){
                System.out.println("Your current balance is $" + current);
                System.out.print("Would you like to return to the main menu (Y/N)? :");
                menu = scan.next().charAt(0);
            }

            else {
                System.out.println("Invalid entry, please try again.");
                System.out.print("Would you like to return to the main menu (Y/N)? : ");
                menu = scan.next().charAt(0);
            }
        }while (menu == 'y' || menu == 'Y');
        System.out.println("Thank you for banking with us!");

    }
}
