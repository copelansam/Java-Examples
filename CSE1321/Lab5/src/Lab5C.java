
/*Class: CSE 1321L
        Section: J51
        Term: Spring 2024
        Instructor: Vinesh Babu Yaganti
        Name: Samuel Copelan
        Lab#: 5
        */
import java.util.Scanner;
public class Lab5C {
    public static void main (String[] args){
        int x, y;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter x: ");
        x = sc.nextInt();
        System.out.print("Enter y: ");
        y = sc.nextInt();

        if (x == 0 && y == 0){
            System.out.println("This point is the origin.");
        }
        else if (x == 0 && y != 0 ){
            System.out.println("This point is on the y axis.");
        }
        else if (x != 0 && y == 0){
            System.out.println("This point is on the x axis.");
        }
        else if (x > 0 && y > 0){
            System.out.println("This point is in the first quadrant.");
        }
        else if (x < 0 && y > 0){
            System.out.println("This point is in the second quadrant.");
        }
        else if (x < 0 && y < 0){
            System.out.println("This point is in the third quadrant.");
        }
        else if (x > 0 && y < 0){
            System.out.println("This point is in the fourth quadrant.");
        }
    }


}