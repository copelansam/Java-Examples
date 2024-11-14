import java.util.Scanner;
import java.util.Random;
public class Assignment6C {
    public static void main (String args[]) {
        int xCoord, yCoord, dimension, success = 0;
        boolean end = false;
        Scanner sc = new Scanner(System.in);


        System.out.println("[Minesweeper – DOS Edition]");
        System.out.print("What is the grid size? ");
        dimension = sc.nextInt();
        Random rand = new Random();


        char [][] grid = new char [dimension][dimension];
        int [] mine = new int [dimension];

        for (int i = 0; i < mine.length; i++){
            int random = rand.nextInt(dimension);
            mine[i] = random;
        }

        for (int i = 0; i < dimension; i++){
            for (int j = 0; j < dimension; j++){
                grid[i][j] = '?';
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }

        while (!end) {


            System.out.print("Enter your X coordinate: ");
            xCoord = sc.nextInt();
            System.out.print("Enter your Y coordinate: ");
            yCoord = sc.nextInt();
            System.out.println();

            if (mine[xCoord] == yCoord) {
                grid[yCoord][xCoord] = 'X';
                for (int i = 0; i < dimension; i++) {
                    for (int j = 0; j < dimension; j++) {
                        System.out.print(grid[i][j]);
                    }
                    System.out.println();
                }

                System.out.println("Sorry, you hit a mine!");
                end = true;
                break;

            }
            success = 0;

            grid[yCoord][xCoord] = '_';
            for (int i = 0; i < dimension; i++) {
                for (int j = 0; j < dimension; j++) {
                    System.out.print(grid[i][j]);
                    if (grid[i][j] == '_'){
                        success = success + 1;
                    }
                }
                System.out.println();
            }

            if (success == dimension){
                System.out.println("You win!");
                end = true;
            }

        }
    }
}
