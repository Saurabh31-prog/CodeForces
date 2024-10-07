import java.util.Scanner;

public class Stones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read input
        int n = sc.nextInt();  // The number of stones
        String s = sc.next();  // The colors of the stones as a string
        
        // Variable to count the number of stones to remove
        int count = 0;
        
        // Iterate over the stones, comparing each stone with the next one
        for (int i = 1; i < n; i++) {
            // If the current stone has the same color as the previous one, increase the count
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            }
        }
        
        // Output the result
        System.out.println(count);
    }
}
