import java.util.Scanner;
class Pixel {
    int red = 255, blue = 255, green = 255;

    Pixel (int x, int y, int z){
        red = x;
        green = y;
        blue = z;

    }

    void changeRGB (int x , int y, int z){
        red = x;
        green = y;
        blue = z;

    }

    void printRGB (){
        System.out.print(red + " " + green + " " + blue + " ");

    }


}



public class Assignment7B {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int width, height, red, green, blue, choice = 0, row, column, length;

        System.out.println("[Portable Pix Map Art Program]");
        System.out.print("Enter an image width: ");
        width = sc.nextInt();
        System.out.print("Enter an image height: ");
        height = sc.nextInt();
        Pixel [][] user = new Pixel [height][width];
        System.out.print("Enter the fill color’s red value: ");
        red = sc.nextInt();
        System.out.print("Enter the fill color’s green value: ");
        green = sc.nextInt();
        System.out.print("Enter the fill color’s blue value: ");
        blue = sc.nextInt();
        System.out.println();

        for (int i = 0; i < height; i++){
            for (int j = 0; j < width; j++){
                user[i][j] = new Pixel (255, 255, 255);
            }
        }

        for (int i = 0; i < height; i++){
            for (int j = 0; j < width; j++){
                user[i][j].changeRGB(red, green, blue);
            }
        }
        while (choice != 4) {
            System.out.println("What will you do?");
            System.out.println("1) Fill in a pixel");
            System.out.println("2) Fill in a line");
            System.out.println("3) Print the image");
            System.out.println("4) Quit");
            System.out.print("Choice? ");
            choice = sc.nextInt();
            System.out.println();

            if (choice == 1){
                System.out.print("Row:");
                row = sc.nextInt();
                System.out.print("Column: ");
                column = sc.nextInt();
                System.out.print("New Red Color: ");
                red = sc.nextInt();

                System.out.print("New Green Color: ");
                green = sc.nextInt();

                System.out.print("New Blue Color: ");
                blue = sc.nextInt();

                user[row][column].changeRGB(red, green, blue);

            }

            else if (choice == 2){
                System.out.print("Row:");
                row = sc.nextInt();
                System.out.print("Column: ");
                column = sc.nextInt();
                System.out.print("Length: ");
                length = sc.nextInt();
                System.out.print("New Red Color: ");
                red = sc.nextInt();

                System.out.print("New Green Color: ");
                green = sc.nextInt();

                System.out.print("New Blue Color: ");
                blue = sc.nextInt();

                for (int i = 0; i < length; i++){
                    user[row][column + i].changeRGB(red, green, blue);;
                }

            }

            else if (choice == 3){
                System.out.println("P3");
                System.out.println(width + " " + height);
                System.out.println("255");
                for (int i = 0; i < height; i++){
                    for (int j = 0; j < width; j++){
                        user[i][j].printRGB();
                    }
                    System.out.println();
                }

            }

            else if (choice == 4){
                System.out.println("P3");
                System.out.println(width + " " + height);
                System.out.println("255");
                for (int i = 0; i < height; i++){
                    for (int j = 0; j < width; j++){
                        user[i][j].printRGB();
                    }
                    System.out.println();
                }
                System.out.println("Closing...");
            }

        }
    }
}
