import java.util.Scanner;
public class Assignment3C {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int tale, bad, help;
        System.out.println("[Epic Quest Simulator]");
        System.out.println("Hello stranger! Do you have time to hear my tale?");
        System.out.println("1) Yes");
        System.out.println("2) No");
        tale = sc.nextInt();
        if (tale == 2){
            System.out.println("Ah, then goodbye...");
        }
        else if (tale == 1){
            System.out.println("Thank you! I come from the land of Pax Bisonica. Our country has been\n" +
                    "taken over by a cruel tyrant!");
            System.out.println("1) That's awful!");
            System.out.println("2) What can I do?");
            bad = sc.nextInt();
            if (bad == 1){
                System.out.println("Alas, it is truly terrible...");
            }
            System.out.println("Please, you must journey to Pax Bisonica and free our country!");
            System.out.println("1) Yes");
            System.out.println("2) No");
            help = sc.nextInt();
            if (help == 1){
                System.out.println("Hooray!");
            }
            else if (help == 2){
                System.out.println("Then all is lost...");
            }
        }

    }
}
