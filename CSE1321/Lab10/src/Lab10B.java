/*Class: CSE 1321L
        Section: J51
        Term: Spring 2024
        Instructor: Vinesh Babu Yaganti
        Name: Samuel Copelan
        Lab#: 10
        */
import java.util.Scanner;
public class Lab10B {

    public static boolean isValid (double width, double height){
    boolean valid = true;
    if (width + height >= 30){
        valid = true;
    }
    else if (width + height < 30){
        valid = false;
    }
    return valid;
}

    public static double area (double width, double height){
        double area;
        area = width * height;
        return area;
    }

    public static double perimeter (double width,double height){
        double perimeter;
        perimeter = (2 * width) + (2 * height);
        return perimeter;
    }


    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        double width, height;
        char resume = 'Y';

        while (resume == 'Y' || resume == 'y'){
            System.out.print("Enter width: ");
            width = sc.nextDouble();
            System.out.print("Enter height: ");
            height = sc.nextDouble();

            boolean valid = isValid(width,height);
            if (!valid){
                System.out.println("This is an invalid rectangle");
            }

            else if (valid){
                System.out.println("This is a valid rectangle");
                System.out.println("The area is: " + area(width,height));
                System.out.println("The perimeter is: " + perimeter(width,height));

            }

            System.out.println();
            System.out.print("Do you want to enter another width and height (Y/N)? :");
            resume = sc.next().charAt(0);
            System.out.println();

        }
        System.out.println("Program Ends ");
    }


}
