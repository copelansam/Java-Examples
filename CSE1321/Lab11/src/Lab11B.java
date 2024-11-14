/*Class: CSE 1321L
        Section: J51
        Term: Spring 2024
        Instructor: Vinesh Babu Yaganti
        Name: Samuel Copelan
        Lab#: 11
        */
import java.util.Scanner;
public class Lab11B {

    public static boolean valid (String password){
        boolean valid = false;

        if (password.length() >= 8){
            valid = true;
        }
        else if (password.length() < 8){
            valid = false;
            return valid;
        }

        for (int i = 0; i < password.length(); i++){
            if (password.charAt(i) >= 65 && password.charAt(i) <= 90){
                valid = true;
                break;
            }
            else {
                valid = false;
            }
        }

        for (int i = 0; i < password.length(); i++){
            if (password.charAt(i) >= 48 && password.charAt(i) <= 57){
                valid = true;
                break;
            }
            else {
                valid = false;
            }
        }

        return valid;
    }

    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        String password;
        System.out.print("Enter a password: ");
        password = sc.nextLine();

        if (valid(password)){
            System.out.println("Valid password ");
        }
        else if (!valid(password)){
            System.out.println("Invalid password");
        }

        System.out.println();
        System.out.println("Program Ends");
    }
}
