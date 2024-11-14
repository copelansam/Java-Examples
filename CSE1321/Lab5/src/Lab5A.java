
/*Class: CSE 1321L
        Section: J51
        Term: Spring 2024
        Instructor: Vinesh Babu Yaganti
        Name: Samuel Copelan
        Lab#: 5
        */
import java.util.Scanner;
public class Lab5A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char permit, license;
        System.out.print("Do you have a driving permit (Y/N)? ");
        permit = sc.next().charAt(0);
        if (permit == 'N' || permit == 'n') {
            System.out.println("Driving permit is a prerequisite to purchase a vehicle!");
        } else if (permit == 'Y' || permit == 'y') {
            System.out.print("Do you have a commercial driving license (Y/N)? ");
            license = sc.next().charAt(0);
            if (license == 'N' || license == 'n') {
                System.out.println("Commercial driving license is a prerequisite to purchase a vehicle!");

            } else if (license == 'Y' || license == 'y') {
                System.out.println("Congratulations! You can purchase a vehicle, let's start talking options!");
            }
        }
    }
}