import java.util.Scanner;
public class Lab12B {
    public static void main (String [] args){
        System.out.println("You are about to create a dog.");
        int age;
        double weight, feed;
        String name, breed, color;
        Scanner sc = new Scanner (System.in);
        System.out.print("How old is the dog: ");
        age = sc.nextInt();
        System.out.print("How much does the dog weigh: ");
        weight = sc.nextDouble();
        System.out.print("What is the dog’s name: ");
        Scanner scan = new Scanner (System.in);
        name = scan.nextLine();
        System.out.print("What color is the dog: ");
        color = scan.nextLine();
        System.out.print("What breed is the dog: ");
        breed = scan.nextLine();
        System.out.println();

        Dog user = new Dog (age, weight, name, color, breed);

        System.out.println(user.name + " is a " + user.age + " year old " + user.color + " " + user.breed + " that weights " + user.weight + " lbs.");
        System.out.println();
        System.out.println(user.bark());
        System.out.println();
        System.out.print(user.name + " is hungry, how much should he eat: ");
        feed = scan.nextDouble();
        user.eat(feed);
        System.out.print(user.name + " isn’t a very good name. What should they be renamed to: ");
        Scanner scanning = new Scanner (System.in);
        user.name = scanning.nextLine();
        System.out.println();
        System.out.println(user.name + " is a " + user.age + " year old " + user.color + " " + user.breed + " that weights " + user.weight + " lbs.");


    }
}
