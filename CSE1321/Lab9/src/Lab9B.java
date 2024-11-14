/*Class: CSE 1321L
        Section: J51
        Term: Spring 2024
        Instructor: Vinesh Babu Yaganti
        Name: Samuel Copelan
        Lab#: 9
        */
import java.util.Scanner;
public class Lab9B {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int user, target;
        int numbers [] = new int [11];
        System.out.println("Please enter 11 numbers:");

        for (int i = 0; i <numbers.length; i++){
            System.out.print("Integer " + (i+1) + ": ");
            user = sc.nextInt();
            numbers[i] = user;
        }

        System.out.print("What is the target number: ");
        target = sc.nextInt();


        for ( int i = 0; i < (numbers.length - 1); i ++){

            for (int j = 0; j < (numbers.length - i - 1); j++){
                if (numbers[j] > numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }


        System.out.print("The sorted set is: ");
        for (int i = 0; i < 11; i ++){
            System.out.print(" " + numbers[i] + " ");
        }

        int low = 0, mid = 0;
        int high = (numbers.length - 1);
        boolean found = false;
        while (high >= low){
            mid = (low + high)/2;

            System.out.println("\nLow is " + low);
            System.out.println("High is " + high);
            System.out.println("Mid is " + mid);

            System.out.println("Searching");


            if (target < numbers[mid]){
                high = (mid - 1);
            }

            else if (target == numbers[mid] ){
                found = true;
                break;
            }

            else {
                low = (mid +1);
            }
        }

        if (found){
            System.out.println("The target is in the set.");
        }
        else {
            System.out.println("The target is not in the set.");
        }

    }
}
