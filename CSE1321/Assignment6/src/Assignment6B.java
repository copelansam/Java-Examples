import java.util.Scanner;
public class Assignment6B {

    public static int[] arraySort(int[] intValues) {
        int temp = 0;
        for (int i = 0; i < (intValues.length - 1); i++) {

            for (int j = 0; j < (intValues.length - i - 1); j++) {
                if (intValues[j] > intValues[j + 1]) {
                    temp = intValues[j];
                    intValues[j] = intValues[j + 1];
                    intValues[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < 8; i++) {
            System.out.print(intValues[i] + ", ");
        }
        return intValues;
    }

    public static char[] arraySort(char[] charValues) {
        char temp = 0;
        for (int i = 0; i < (charValues.length - 1); i++) {

            for (int j = 0; j < (charValues.length - i - 1); j++) {
                if (charValues[j] > charValues[j + 1]) {
                    temp = charValues[j];
                    charValues[j] = charValues[j + 1];
                    charValues[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < 8; i++) {
            System.out.print(charValues[i] + ", ");
        }
        return charValues;
    }

    public static float[] arraySort(float[] decimalValues) {
        float temp = 0;
        for (int i = 0; i < (decimalValues.length - 1); i++) {

            for (int j = 0; j < (decimalValues.length - i - 1); j++) {
                if (decimalValues[j] > decimalValues[j + 1]) {
                    temp = decimalValues[j];
                    decimalValues[j] = decimalValues[j + 1];
                    decimalValues[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < 8; i++) {
            System.out.print(decimalValues[i] + ", ");
        }
        return decimalValues;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int integer;
        char character;
        String choice;
        float decimal;
        System.out.println("[Overloaded Sort]");
        System.out.print("What data type do you want to enter? ");
        choice = sc.nextLine();

        char[] charValues = new char[8];
        float[] decimalValues = new float[8];
        int[] intValues = new int[8];

        if (choice.equalsIgnoreCase("char")) {

            for (int i = 0; i < 8; i++) {
                System.out.print("Value " + (i + 1) + ": ");
                character = sc.next().charAt(0);
                charValues[i] = character;
            }
        }

        if (choice.equalsIgnoreCase("float")) {

            for (int i = 0; i < 8; i++) {
                System.out.print("Value " + (i + 1) + ": ");
                decimal = sc.nextFloat();
                decimalValues[i] = decimal;
            }
        }

        if (choice.equalsIgnoreCase("int")) {

            for (int i = 0; i < 8; i++) {
                System.out.print("Value " + (i + 1) + ": ");
                integer = sc.nextInt();
                intValues[i] = integer;
            }
        }

        System.out.println("Calling arraySort()...");
        System.out.println("The sorted values are:");

        if (choice.equalsIgnoreCase("int")) {
            arraySort(intValues);
        }

        else if (choice.equalsIgnoreCase("float")) {
            arraySort(decimalValues);
        }

        else if (choice.equalsIgnoreCase("char")){
            arraySort(charValues);
        }


    }
}

