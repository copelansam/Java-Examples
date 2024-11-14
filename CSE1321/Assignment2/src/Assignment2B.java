import java.util.Scanner;
public class Assignment2B {
    public static void main (String[] args){
        int width, height, x1, x2, y1, y2;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the hit box bottom-left X coordinate: ");
        x1 = sc.nextInt();
        System.out.print("Enter the hit box bottom-left Y coordinate: ");
        y1 = sc.nextInt();

        System.out.print("Enter the width of the hit box: ");
        width = sc.nextInt();
        System.out.print("Enter the height of the hit box: ");
        height = sc.nextInt();

        x2 = x1 + width;
        y2 = y1 + height;

        System.out.println("[Hit Box Coordinates]");
        System.out.println("Bottom-left: " + x1 + "," + y1);
        System.out.println("Top-left: " + x1 + "," + y2);
        System.out.println("Bottom-right: " + x2 + "," + y1);
        System.out.println("Top-right: " + x2 + "," + y2);

            }
}
