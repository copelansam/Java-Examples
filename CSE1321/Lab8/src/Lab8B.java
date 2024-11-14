import java.util.Scanner;
public class Lab8B {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int row, column, cells, count = 0;
        System.out.print("Please enter the number of rows: ");
        row = sc.nextInt();
        System.out.print("Please enter the number of columns: ");
        column = sc.nextInt();
        cells = row * column;
        System.out.print("I have " + row + " rows and " + column + " columns.");
        System.out.println(" I need to fill-up " + cells + " spaces.");
        System.out.println();
        System.out.println("The " + row + "x" + column + " array:");

        int [][] bigArray;
        bigArray = new int [row][column];
        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                count++;
                bigArray[i][j] = count;
                System.out.print(bigArray[i][j] +"|");


            }
            System.out.println();
        }

    }
}
