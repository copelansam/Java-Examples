import java.util.Scanner;
public class Assignment2C {
    public static void main (String[] args){
        int USD;
        float GBP, bisonDollar;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Bisonica!");
        System.out.print("How many US Dollars do you have? ");
        USD = sc.nextInt();
        final float US_2_GB = 0.79f;
        GBP = USD * US_2_GB;
        System.out.println(USD + " US Dollar(s) is " + GBP + " British Pound(s),");
        final float GB_2_BD = 5f;
        bisonDollar = GBP / GB_2_BD;
        System.out.println("which is " + bisonDollar + " Bison Dollar(s)");

    }

}
