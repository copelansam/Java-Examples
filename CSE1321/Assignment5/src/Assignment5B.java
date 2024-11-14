import java.util.Scanner;
public class Assignment5B {
    public static void main (String[] args) {

        System.out.println("[FYE Level Map Creator]");
        int columns, rows, selection, coordX, coordY, length;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a level map width: ");
        columns = sc.nextInt();
        //columns -= 1;
        System.out.print("Enter a level map height: ");
        rows = sc.nextInt();
        //rows -= 1;

        String[][] game = new String[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                game[i][j] = "_";
                System.out.print(game[i][j]);

            }
            System.out.println();
        }

        selection = 0;
        do {

            System.out.println();
            System.out.println("Options");
            System.out.println("1. Clear Level");
            System.out.println("2. Add Platforms");
            System.out.println("3. Add Items");
            System.out.println("4. Quit");
            System.out.print("Enter a choice: ");
            selection = sc.nextInt();

            if (selection == 1) {
                System.out.println();
                System.out.println("[Clear Level]");
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        game[i][j] = "_";
                        System.out.print(game[i][j]);

                    }
                    System.out.println();
                }
            }

            else if (selection == 2) {
                    System.out.println();
                    System.out.println("[Add Platform]");
                    System.out.print("Enter X Coordinate: ");
                    coordX = sc.nextInt();
                    System.out.print("Enter Y Coordinate: ");
                    coordY = sc.nextInt();
                    System.out.print("Enter Length: ");
                    length = sc.nextInt();

                    if (length > columns || length > (columns - coordX)){
                        System.out.println("This platform won’t fit in the level!");
                        continue;
                    }

                    for (int i = 0; i < length; i++) {
                        game[coordX][coordY + i] = "=";
                    }
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < columns; j++) {
                            System.out.print(game[i][j]);

                        }
                        System.out.println();
                    }

                } else if (selection == 3) {
                    System.out.println();
                    System.out.println("[Add Item]");
                    System.out.print("Enter X Coordinate: ");
                    coordX = sc.nextInt();
                    System.out.print("Enter Y Coordinate: ");
                    coordY = sc.nextInt();
                    if (coordX < 0 || coordX > rows || coordY < 0 || coordY > columns) {
                        System.out.println("This is not a valid location!");
                    } else {
                        game[coordY][coordX] = "P";
                    }
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < columns; j++) {

                            System.out.print(game[i][j]);

                        }
                        System.out.println();
                    }
                } else if (selection == 4) {
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < columns; j++) {

                            System.out.print(game[i][j]);
                        }
                        System.out.println();
                    }

                    System.out.println("Goodbye!");
                }


        } while (selection != 4);



    }
}
