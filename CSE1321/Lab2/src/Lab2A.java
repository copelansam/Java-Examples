/*Class: CSE 1321L
        Section: J51
        Term: Spring 2024
        Instructor: Vinesh Babu Yaganti
        Name: Samuel Copelan
        Lab#: 2
        */
import java.util.Scanner;
public class Lab2A {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        String name1, name2, verb, adverb;
        System.out.print ("Enter a name: ");
        name1 = sc.nextLine();
        System.out.print ("Enter another name: ");
        name2 = sc.nextLine();
        System.out.print ("Enter a verb: ");
        verb = sc.nextLine();
        System.out.print ("Enter an adverb: ");
        adverb = sc.nextLine();

        System.out.println("Once upon a time, there was a person named " + name1 + " who had a child named " + name2 + ".");
        System.out.println("This child would " + verb +" "+ adverb + " while singing to strangers.");


    }
}
