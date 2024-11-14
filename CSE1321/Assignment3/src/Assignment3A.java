import java.util.Scanner;
public class Assignment3A {
    public static void main (String[] args){
        int events, eventPercent;
        String grad;
        Scanner sc = new Scanner (System.in);
        System.out.println("[Scrappy’s Bucket List Rewards]");
        System.out.print("How many events have you attended? ");
        events = sc.nextInt();
        eventPercent = ((events * 100) / 63) ;

        if (eventPercent >= 0 && eventPercent < 10){
            System.out.println("Check out events at https://studentaffairs.kennesaw.edu/scrappysbucketlist/!");
        }
        else if (eventPercent >=10 && eventPercent < 25){
            System.out.println("You've been to " + eventPercent + "% of all SBL events!");
            System.out.println("You've earned a Drawstring Bag!");
        }
        else if (eventPercent >= 25 && eventPercent < 50){
            System.out.println("You've been to " + eventPercent + "% of all SBL events!");
            System.out.println("You've earned a Drawstring Bag!");
            System.out.println("You've earned a Hat!");
        }
        else if (eventPercent >= 50 && eventPercent < 75){
            System.out.println("You've been to " + eventPercent + "% of all SBL events!");
            System.out.println("You've earned a Drawstring Bag!");
            System.out.println("You've earned a Hat!");
            System.out.println("You've earned a T-Shirt!");
        }
        else if (eventPercent >= 75 && eventPercent < 100){
            System.out.println("You've been to " + eventPercent + "% of all SBL events!");
            System.out.println("You've earned a Drawstring Bag!");
            System.out.println("You've earned a Hat!");
            System.out.println("You've earned a T-Shirt!");
            System.out.println("You've earned a Glass Water Bottle!");
        }
        else if (eventPercent == 100) {
            System.out.println("You've been to 100% of all SBL events!");
            System.out.println("You've earned a Drawstring Bag!");
            System.out.println("You've earned a Hat!");
            System.out.println("You've earned a T-Shirt!");
            System.out.println("You've earned a Glass Water Bottle!");
            System.out.println("You've earned a Hoodie!");
            System.out.print("Are you graduating? ");
            Scanner grad2 = new Scanner (System.in);
            grad = grad2.nextLine();
            if (grad.equalsIgnoreCase("yes")) {
                    System.out.println("Hooray, you earned a Challenge Coin and special graduation cords!");
            }
            else if (grad.equalsIgnoreCase("no")) {
                    System.out.println("There’s a special reward when you graduate!");
            }
        }
    }
}
