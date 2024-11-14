import java.util.Scanner;
public class Assignment4A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width, height, star = 1;
        char symbol;
        System.out.print("Enter a character to use: ");
        symbol = sc.next().charAt(0);
        System.out.print("Enter the diamond's width: ");
        width = sc.nextInt();

        while (width < 3){
            System.out.println("Please enter a width of at least 3.");
            System.out.print("Enter the diamond's width: ");
            width = sc.nextInt();
        }

        if (width % 2 == 0 ){
            System.out.println("To make a diamond, we’ll use " + (width + 1) + " as the width instead.");
            width = (width + 1);

        }

        width = (width + 1) / 2;




        while (star < width){
            height = 1;
            while (height <= width - star + 1 ){
                System.out.print(" ");
                height++;
            }
            height = 1;

            while (height <= star * 2 - 1 ){
                System.out.print(symbol);
                height++;
            }
            System.out.println();
            star++;

        }

        while (star > 0){
            height = 1;
            while (height <= width - star + 1 ){
                System.out.print(" ");
                height++;
            }

            height = 1;

            while (height <= star * 2 - 1 ){
                height++;
                System.out.print(symbol);
            }
            System.out.println();
         star--;
        }
    }
}


