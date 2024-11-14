import java.util.Scanner;
public class Driver {
    public static int lengthOfMatch(String first, String second){
        // Determines how many consecutive characters two strings have in
        // common starting from the end and moving left.
        if (first.length() == 0 || second.length() == 0){
            return 0;
        }
        else if (first.charAt(first.length() - 1) != second.charAt(second.length() - 1)){
            return 0;
        }

        else{
            return 1 + lengthOfMatch(first.substring(0,first.length() - 1), second.substring(0,second.length() - 1));
        }
    }

    public static int calculateSkip(char letter, String word){
        // Determines index of first appearance of specified character within
        // specified string starting from the right and moving left.
        if (word.length() == 0){
            return 0;
        }
        else if (word.charAt(word.length() - 1) == letter){
            return 0;
        }
        else{
            return 1 + calculateSkip(letter, word.substring(0,word.length() - 1));
        }
    }
public static int findString(String text, String pattern){
        if (pattern.length() > text.length()){
            return -1;
        }
        else {
            String textSub = text.substring(0,pattern.length());
            if (lengthOfMatch(pattern, textSub) == pattern.length()){
                return 0;
            }
            char mismatch = text.charAt(pattern.length() - lengthOfMatch(pattern,textSub) - 1);
            String patternBefore = pattern.substring(0,pattern.length() - lengthOfMatch(pattern,textSub));
            String patternAfter = pattern.substring(pattern.length() - lengthOfMatch(pattern,textSub));
            int skip = calculateSkip(mismatch, patternAfter);
            if (skip < patternAfter.length()){
                skip = 1 + lengthOfMatch(pattern,textSub);
            }
            else{
                skip = calculateSkip(mismatch, patternBefore);
            }
            int result = findString(text.substring(skip),pattern);
            return skip + result;
        }
}
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("[Pattern Matcher]");
        System.out.print("Enter original text: ");
        String original = scan.nextLine();
        System.out.print("Enter pattern to find: ");
        String pattern = scan.nextLine();
        int position = findString(original,pattern);
        System.out.println();
        if (position == -1){
            System.out.println("Pattern could not be found in text!");
        }
        else{
            System.out.println("Pattern found at position " + position);
        }
    }
}
