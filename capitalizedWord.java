import java.util.Scanner;

public class capitalizedWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        System.out.println(capitalize(word));
    }

    static String capitalize(String word) {
        if (word == null || word.length() == 0) {
            return word; // Return as-is if the word is empty
        }
        // Convert the first character to uppercase, and concatenate it with the rest of the word (unchanged)
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }
    
}
