import java.util.Scanner;
 class FSA {
    int state;

    FSA(int x) {
        state = x;
    }


    int goToNextState(int x) {
        if (state < 3){
            state = x + 1;

        }
        else if (state == 3){
            state = 0;

        }
        return state;
    }

    boolean end() {

        if (state == 3) {
            return true;
        }
        else {
            System.out.println("You can’t stop here; you can only stop at state 3.\n");
            return false;
        }
    }
}




public class Assignment7A {
    public static void main(String[] args) {
        int state;
        String selection;
        Scanner sc = new Scanner(System.in);
        boolean end = false;
        System.out.println("[Finite State Automata]");
        System.out.print("What state do you want to start at? ");
        state = sc.nextInt();
        FSA status = new FSA(state);
        System.out.println();
        while (!end) {
            Scanner scan = new Scanner (System.in);
            System.out.println("What will you do?");
            System.out.println(">Go to next state");
            System.out.println(">End");
            selection = scan.nextLine();
            System.out.println();
            if (selection.equalsIgnoreCase("go to next state")) {

                status.state = status.goToNextState(status.state);
                System.out.println("You’re now at state " + status.state);

            }
            else if (selection.equalsIgnoreCase("end")) {
                end = status.end();
                if (end) {
                    System.out.println("The FSA has shut down.");

                }

            }
            else if (!selection.equalsIgnoreCase("go to next state") || !selection.equalsIgnoreCase("end")){
                System.out.println("[Invalid command!]");
                System.out.println();
            }

        }
    }
}
