import java.util.Scanner;
public class Assignment2A {
    public static void main (String[] args){
        int firstNumber, secondNumber, multipleDistance, multiple;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number you want to find a multiple of: ");
        firstNumber = sc.nextInt();

        System.out.print("Enter a second number: ");
        secondNumber = sc.nextInt();

        System.out.println("Calculating...");
        multipleDistance = secondNumber / firstNumber;
        multiple = firstNumber * multipleDistance;

        System.out.println("The nearest multiple of " + firstNumber + " from " + secondNumber + " is " + multiple +"!");

    }
}
