/*Class: CSE 1321L
        Section: J51
        Term: Spring 2024
        Instructor: Vinesh Babu Yaganti
        Name: Samuel Copelan
        Lab#: 11
        */
import java.util.Scanner;
public class Lab11A {

    public static boolean restart (String rerun){

        if (rerun.equalsIgnoreCase("YES")){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main (String args[]){

        int selection;
        boolean resume = true;
        String rerun;

        while (resume) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Menu");
            System.out.println("0) Hello World");
            System.out.println("1) Goodbye Moon");
            System.out.println("2) Walking on Sunshine");
            System.out.println();
            System.out.print("What would you like to do: ");
            selection = sc.nextInt();
            System.out.println();

            if (selection == 0){
                System.out.println("Hello!");
            }

            else if (selection == 1){
                System.out.println("Ok, bye.");
            }

            else if (selection == 2){
                System.out.println("WHOA!");
            }

            System.out.println();
            Scanner scan = new Scanner(System.in);

            System.out.print("Type YES to rerun. ");
            rerun = scan.nextLine();
            System.out.println();
            resume = restart(rerun);

        }
        System.out.println("\nProgram Ends");
    }
}
