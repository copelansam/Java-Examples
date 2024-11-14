/*Class: CSE 1321L
        Section: J51
        Term: Spring 2024
        Instructor: Vinesh Babu Yaganti
        Name: Samuel Copelan
        Lab#: 3
        */
import java.util.Scanner;

class Lab3B {
    public static void main(String[] args) {
        float courseGrade1, courseGrade2, courseGrade3, courseGrade4, courseHour1, courseHour2, courseHour3, courseHour4, quality1, quality2, quality3, quality4, hourTotal, pointTotal, GPA;
        Scanner sc = new Scanner(System.in);

        System.out.print("Course 1 hours: ");
        courseHour1 = sc.nextFloat();
        System.out.print("Grade for course 1: ");
        courseGrade1 = sc.nextFloat();
        quality1 = courseHour1 * courseGrade1;

        System.out.print("Course 2 hours: ");
        courseHour2 = sc.nextFloat();
        System.out.print("Grade for course 2: ");
        courseGrade2 = sc.nextFloat();
        quality2 = courseHour2 * courseGrade2;

        System.out.print("Course 3 hours: ");
        courseHour3 = sc.nextFloat();
        System.out.print("Grade for course 3: ");
        courseGrade3 = sc.nextFloat();
        quality3 = courseHour3 * courseGrade3;

        System.out.print("Course 4 hours: ");
        courseHour4 = sc.nextFloat();
        System.out.print("Grade for course 4: ");
        courseGrade4 = sc.nextFloat();
        quality4 = courseHour4 * courseGrade4;

        hourTotal = courseHour1 + courseHour2 + courseHour3 + courseHour4;
        System.out.println("Total hours is: " + hourTotal);
        pointTotal = quality1 + quality2 + quality3 + quality4;
        System.out.println("Total quality points is: " + pointTotal);
        GPA = pointTotal / hourTotal;
        System.out.println("Your GPA for this semester is " + GPA);
    }
}