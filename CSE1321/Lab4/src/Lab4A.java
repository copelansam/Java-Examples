/*Class: CSE 1321L
        Section: J51
        Term: Spring 2024
        Instructor: Vinesh Babu Yaganti
        Name: Samuel Copelan
        Lab#: 4
        */
import java.util.Scanner;
public class Lab4A {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the score of your exam: ");
        float score = sc.nextFloat();
        String grade= null;
        if (score <= 100.0 && score >= 97.5){
            grade = "A+";
        }
        else if (score <= 97.4 && score >= 94.5){
            grade = "A";
        }
        else if (score <= 94.5 && score >= 91.5){
            grade = "A-";
        }
        else if (score <= 91.4 && score >= 88.5){
            grade = "B+";
        }
        else if (score <= 88.4 && score >= 85.5){
            grade = "B";
        }
        else if (score <= 85.4 && score >= 82.5){
            grade = "B-";
        }
        else if (score <= 82.4 && score >= 79.5){
            grade = "C+";
        }
        else if (score <= 79.4 && score >= 76.5){
            grade = "C";
        }
        else if (score <= 76.4 && score >= 73.5){
            grade = "C-";
        }
        else if (score <= 73.4 && score >= 70.5){
            grade = "D+";
        }
        else if (score <= 70.4 && score >= 67.5){
            grade = "D";
        }
        else if (score <= 67.4 && score >= 64.5){
            grade = "D-";
        }
        else if (score <= 64.4 && score >= 0.0){
            grade = "F";
        }
        System.out.println("Letter grade is: " + grade);
    }
}
