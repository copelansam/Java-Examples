import java.util.Random;
public class Assignment6A {

    public static boolean check_if_sorted(int [] table){
        boolean sort = true;

        for (int i = 0; i < table.length-1; i++){
            if (table[i+1] < table[i]){
                sort = false;
            }
        }
        return sort;

    }

    public static int[] shuffleArray(int [] table){
        Random rand = new Random();
        int tempTable [] = new int [table.length];


        for (int i = table.length -1; i >=0; i--){
            int index = rand.nextInt(i +1);
            int temp = table[i];
            tempTable[i] = table[index];
            table[index] = temp;

        }

        for (int i = 0; i < table.length; i++){
            table[i] = tempTable[i];
        }
        return table;
    }

    public static void printArray(int [] table){
        for (int i = 0; i < table.length; i++){
            System.out.print(table[i] + ", ");
        }

    }

    public static void main (String args[]){
        int table[] = new int[19];
        int attempts = 0;
        System.out.println("[Bogosort]");
        System.out.println();

        System.out.println("Printing array...");
        for (int i = 0; i < table.length-1; i++){
            Random rand = new Random();
            int random = rand.nextInt(454);
            table[i] = random;
            System.out.print(table[i]);
        }
        boolean sorted = false;
        while (!sorted){
            if(!check_if_sorted(table)) {
                System.out.println("\nNot sorted yet!");
                System.out.println();
                System.out.println("Shuffling array...");
                shuffleArray(table);
                System.out.println();
                System.out.println("Printing array...");
                printArray(table);

            }

            else if (check_if_sorted(table)){
                sorted = true;

            }

            attempts++;
        }
        System.out.println("\n\nHooray, it’s sorted! And it only took " + attempts + " attempts!");

    }

}
 