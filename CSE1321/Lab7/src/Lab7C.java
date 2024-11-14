/*Class: CSE 1321L
        Section: J51
        Term: Spring 2024
        Instructor: Vinesh Babu Yaganti
        Name: Samuel Copelan
        Lab#: 7
        */
import java.util.Scanner;
public class Lab7C {
    public static void main (String[] args){
        int number = 0, inner = 0, outer = 0, row = 0, empty = 0;
        Scanner sc = new Scanner (System.in);
        System.out.print("Please enter a value for the size: ");
        number = sc.nextInt();
        System.out.print("This is the requested " + number + "x" + number + " right-triangle:");
        for (outer = 0; outer < number; outer++) {
            System.out.println();
            row++;

            for (inner = 0; inner <= row; inner++) {

                for (empty = number; empty > row; empty--) {
                    System.out.print(" ");
                    }
                for (inner = 1; inner <= row; inner++) {
                    System.out.print("*");
                }
                }

            }
        }
    }

