import java.util.Scanner;
public class Assignment1B {
    public static void main (String[] args) {
        Double red1, red2, blue1, blue2, green1, green2, redDistance, greenDistance, blueDistance, distance;
        System.out.println("PLease enter the following values for your first color:");
        System.out.print("Please input the first red value: ");
        Scanner sc = new Scanner (System.in);
        red1 = sc.nextDouble();

        System.out.print("Please input the first green value :");
        green1 = sc.nextDouble();

        System.out.print("Please input the first blue value: ");
        blue1 = sc.nextDouble();

        System.out.println("Please input the following values for the second color:");
        System.out.print("Please input the second red value: ");
        red2 = sc.nextDouble();

        System.out.print("PLease input the second green value: ");
        green2 = sc.nextDouble();

        System.out.print("Please input the second blue value: ");
        blue2 = sc.nextDouble();
        System.out.println();

        redDistance = ((red2 - red1) * (red2 - red1));
        greenDistance = ((green2 - green1) * (green2 - green1));
        blueDistance = ((blue2 - blue1) * (blue2 - blue1));
        distance = Math.sqrt(redDistance + greenDistance + blueDistance);

        System.out.println("First color:");
        System.out.println("R: " + red1);
        System.out.println("G: " + green1);
        System.out.println("B: " + blue1);
        System.out.println();

        System.out.println("Second color:");
        System.out.println("R: " + red2);
        System.out.println("G: " + green2);
        System.out.println("B: " + blue2);
        System.out.println();



        System.out.println("Color Distance: " + distance);
    }
}
