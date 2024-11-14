/*Class: CSE 1321L
        Section: J51
        Term: Spring 2024
        Instructor: Vinesh Babu Yaganti
        Name: Samuel Copelan
        Lab#: 4
        */
import java.util.Scanner;
public class Lab4B {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        String day;
        System.out.print("Enter the day: ");
        day = sc.nextLine();
        day = day.toLowerCase();
        switch(day){
            case "monday": System.out.println("I have class today!");
            break;
            case "tuesday": System.out.println("I should use this time to do my homework.");
            break;
            case "wednesday": System.out.println("I have class today!");
            break;
            case "thursday": System.out.println("I should use this time to do my homework.");
            break;
            case "friday": System.out.println("It’s Friday! Friday! Gotta get down on Friday!");
            break;
            case "saturday": System.out.println("I should use this time to do my homework");
            break;
            case "sunday": System.out.println("I should use this time to do my homework");
            break;

        }



    }
}
