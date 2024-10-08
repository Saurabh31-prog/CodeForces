import java.util.Scanner;

public class word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the input word
        String s = sc.next();
        
        // Variables to count the number of uppercase and lowercase letters
        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        
        // Iterate through the word to count lowercase and uppercase letters
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c)) {
                upperCaseCount++;
            } else {
                lowerCaseCount++;
            }
        }
        
        // Determine the output based on the counts
        if (upperCaseCount > lowerCaseCount) {
            // More uppercase letters, convert the word to uppercase
            System.out.println(s.toUpperCase());
        } else {
            // Otherwise, convert the word to lowercase (even if counts are equal)
            System.out.println(s.toLowerCase());
        }
    }
}
