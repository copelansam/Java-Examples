/*Class: CSE 1321L
        Section: J51
        Term: Spring 2024
        Instructor: Vinesh Babu Yaganti
        Name: Samuel Copelan
        Lab#: 3
        */
import java.util.Scanner;

class Lab3A {
    public static void main(String[] args) {
        float balance, apr, aprPayment, payment, monthlyRate;
        Scanner sc = new Scanner (System.in);
        System.out.print("Amount owed: ");
        balance = sc.nextFloat();
        System.out.print("$APR: ");
        apr = sc.nextFloat();

        monthlyRate = apr / 12;
        aprPayment = apr/100;
        payment = (balance * aprPayment) / 12;

        System.out.printf("Monthly percentage rate: %.3f%n ", monthlyRate);
        System.out.printf("Minimum payment: $ %.2f%n" , payment);


    }
}