import java.util.Scanner;
public class Lab8A {
    public static void main (String [] args){
        System.out.println("Please enter 5 integers for the first array:");
        int [] arrayOne;
        arrayOne = new int [5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
            System.out.print("Integer " + (i + 1) + ":");
            int value = sc.nextInt();
            arrayOne[i] = value;
        }

        System.out.println("Please enter 5 integers for the second array: ");
        int [] arrayTwo;
        arrayTwo = new int [5];
        for (int i = 0; i < 5; i++){
            System.out.print("Integer " + (i + 1) + ":");
            int value = sc.nextInt();
            arrayTwo[i] = value;
        }

        System.out.print("The resulting sums are ");
        for (int i = 0; i < 5; i++){
            System.out.print((arrayOne[i] +arrayTwo[i]) + "|");
        }

    }
}

