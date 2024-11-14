
/*Class: CSE 1321L
        Section: J51
        Term: Spring 2024
        Instructor: Vinesh Babu Yaganti
        Name: Samuel Copelan
        Lab#: 5
        */
import java.util.Scanner;
public class Lab5B {
    public static void main(String [] args) {
        int number, divisible;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        number = sc.nextInt();
        divisible = 0;

        if (number % 2 == 0){
            divisible = 2;
        }
        else if (number % 3 == 0){
            divisible = 3;
        }
        else if (number % 5 == 0){
            divisible = 5;
        }

        switch (divisible){
            case 2: System.out.println("This number is divisible by 2");
            break;
            case 3: System.out.println("This number is divisible by 3");
            break;
            case 5: System.out.println("This number is divisible by 5");
            break;
            default: System.out.println("This number is undetermined");
            break;
        }
    }
}
