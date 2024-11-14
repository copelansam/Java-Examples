/*Class: CSE 1321L
        Section: J51
        Term: Spring 2024
        Instructor: Vinesh Babu Yaganti
        Name: Samuel Copelan
        Lab#: 7
        */
import java.util.Scanner;
public class Lab7A {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int inner = 0, outer = 0, number =0;
        System.out.print("Please enter a value for the size: ");
        number = sc.nextInt();
        System.out.print("This is the requested " + number + "x" + number + " box:");
        for (outer = 0; outer < number; outer++){
            System.out.println();
            for (inner = 0; inner < number; inner++){
                System.out.print("*");
            }
        }
    }
}
