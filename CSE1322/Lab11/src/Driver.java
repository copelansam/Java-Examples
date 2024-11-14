import java.util.Scanner;
public class Driver {
    public static void main(String [] args){
        BlueRayCollection myCollection = new BlueRayCollection();
        int selection = 9;
        while (selection != 0){
            Scanner sc = new Scanner(System.in);
            System.out.println("0. Quit");
            System.out.println("1. Add BlueRay to collection");
            System.out.println("2. See collection");
            selection = sc.nextInt();
            sc.nextLine();
            if (selection == 1) {
                System.out.println("What is the title?");
                String title = sc.nextLine();
                System.out.println("What is the director?");
                String director = sc.nextLine();
                System.out.println("What is the year of release?");
                int year = sc.nextInt();
                System.out.println("What is the cost?");
                double cost = sc.nextDouble();
                myCollection.add(title, director, year, cost);
            }
            else if (selection == 2) {
                myCollection.showAll();
            }
        }
    }
}
