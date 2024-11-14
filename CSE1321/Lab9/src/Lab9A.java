/*Class: CSE 1321L
        Section: J51
        Term: Spring 2024
        Instructor: Vinesh Babu Yaganti
        Name: Samuel Copelan
        Lab#: 9
        */
import java.util.Scanner;
public class Lab9A {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        int user, target;
        System.out.println("Please enter 10 numbers:");
        int numbers[] = new int [10];
        for(int i = 0; i < 10; i++){
            System.out.print("Integer " + (i+1) +": ");
            user = sc.nextInt();
            numbers[i] = user;
        }

        System.out.println();
        System.out.print("What is the target number: ");
        target = sc.nextInt();
        System.out.println();

        for (int i = 0; i < 10; i++ ){
            if (target == numbers[i]){
                System.out.println("The target is in the set.");
                break;
            }
            else if (i == 9 && target != numbers[i]) {
                System.out.println("The target is not in the set.");
            }
        }
    }
}
