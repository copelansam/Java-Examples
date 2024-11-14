import java.util.Scanner;
public class Assignment4C {
    public static void main (String[] args)  throws InterruptedException {
        String sentence;
        int back, counter = 0;
        Scanner sc = new Scanner (System.in);
        System.out.println("[Backspace Animation]");
        System.out.println("Please enter your sentence:");
        sentence = sc.nextLine();
        System.out.println("How many letters do you want to backspace?");
        back = sc.nextInt();
        System.out.print(sentence);

        while (counter < back){
            Thread.sleep (500);
            System.out.print("\b");
            counter++;

        }

    }
}

