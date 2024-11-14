/*Class: CSE 1321L
        Section: J51
        Term: Spring 2024
        Instructor: Vinesh Babu Yaganti
        Name: Samuel Copelan
        Lab#: 10
        */
import java.util.Scanner;
public class Lab10A {

    public static int getMax (int num1, int num2){
        int max = 0;
        if (num1 > num2){
            max = num1;
        }
        else if (num2 > num1){
            max = num2;
        }
        return max;
    }

    public static int getMin (int num1, int num2){
        int min = 0;
        if (num1 > num2){
            min = num2;
        }
        else if (num2 > num1){
            min = num1;
        }
        return min;
    }

    public static double getAverage (int num1, int num2){
        double average;
        double num3 = num1;
        double num4 = num2;
        average = (num3 + num4)/2;
        return average;
    }

    public static void main (String args[]){
        int num1, num2;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number 1: ");
        num1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        num2 = sc.nextInt();
        System.out.println("Min is " + getMin(num1,num2));
        System.out.println("Max is " + getMax(num1,num2));
        System.out.println("Average is " + getAverage(num1,num2));
    }
}
