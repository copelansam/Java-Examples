import java.util.Scanner;
public class Lab12A {
    public static void main (String [] args ){
        Scanner sc = new Scanner (System.in);
        System.out.println("You are about to create a chair.");
        System.out.print("How many legs does your chair have: ");
        int numOfLegs = sc.nextInt();
        System.out.print("Is your chair rolling (true/false): ");
        boolean rolling = sc.nextBoolean();
        System.out.print("What is your chair made of: ");
        Scanner scan = new Scanner (System.in);
        String material = scan.nextLine();
        System.out.println();

        Chair user = new Chair(numOfLegs, rolling, material);

        System.out.println("Your chair has " + user.legs + " legs, is " + user.statsRoll(rolling) + ", and is made of " + user.material + ".");
        System.out.println();
        System.out.println("This program is going to change that.");

        numOfLegs = 4;
        rolling = false;
        material = "wood";

        user.legs = numOfLegs;
        user.rolling = rolling;
        user.material = material;
        System.out.println();
        System.out.println("Your chair has " + user.legs + " legs, is " + user.statsRoll(rolling) + ", and is made of " + user.material + ".");

    }

}
