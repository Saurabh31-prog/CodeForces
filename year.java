import java.util.*;

public class year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        
        // Start checking from y + 1
        int nextYear = y + 1;
        
        // Loop until we find a year with distinct digits
        while (!hasDistinctDigits(nextYear)) {
            nextYear++;
        }
        
        // Output the result
        System.out.println(nextYear);
    }
    
    // Function to check if all digits of a year are distinct
    public static boolean hasDistinctDigits(int year) {
        String yearStr = Integer.toString(year);
        Set<Character> digits = new HashSet<>();
        
        for (char c : yearStr.toCharArray()) {
            // If the digit is already in the set, the digits are not distinct
            if (digits.contains(c)) {
                return false;
            }
            digits.add(c);
        }
        
        return true; // All digits are distinct
    }
}
