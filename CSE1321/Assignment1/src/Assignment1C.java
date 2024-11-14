import java.util.Scanner;
public class Assignment1C {
    public static void main (String[] args) {
        Double soup, rice, veggie, pb, soupFeed, riceFeed, veggieFeed, pbFeed, totalFeed;
        System.out.println("How far your donation goes");
        System.out.print("How many cans of soup? ");
        Scanner sc = new Scanner (System.in);
        soup = sc.nextDouble();
        System.out.print("How many bags of brown rice? ");
        rice  = sc.nextDouble();
        System.out.print("How many cans of vegetables? ");
        veggie = sc.nextDouble();
        System.out.print("How many cans of peanut butter? ");
        pb = sc.nextDouble();

        soupFeed = soup * 2;
        riceFeed = rice * 4;
        veggieFeed = veggie * 3.5;
        pbFeed = pb * 7;
        totalFeed = soupFeed + riceFeed + veggieFeed + pbFeed;

        System.out.println("Your donation will help feed " + totalFeed + " People!");
        System.out.println(soupFeed + "people with the " + soup + "can(s) of soup");
        System.out.println(riceFeed + "people with the " + rice + "bag(s) of rice");
        System.out.println(veggieFeed + "people with the " + veggie + "can(s) of vegetables");
        System.out.println(pbFeed + "people with the " + pb + "can(s) of peanut butter");

    }

}
