/*Class: CSE 1321L
        Section: J51
        Term: Spring 2024
        Instructor: Vinesh Babu Yaganti
        Name: Samuel Copelan
        Lab#: 2
        */
import java.util.Scanner;
public class Lab2C {
    public static void main (String[] args){
        Integer width, height, perimeter, area;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a width: ");
        width = sc.nextInt();
        System.out.print("Enter a height: ");
        height = sc.nextInt();

        perimeter = 2 * (width + height);
        area = width * height;
        System.out.println("The area is " + area);
        System.out.println("The perimeter is " + perimeter);

    }
}
