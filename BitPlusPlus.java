import java.util.Scanner;

public class BitPlusPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of statements
        int n = sc.nextInt();
        sc.nextLine(); // Move the scanner to the next line
        
        int x = 0;
        
        // Process each statement
        for (int i = 0; i < n; i++) {
            String statement = sc.nextLine();
            
            // Check if the statement contains "++" or "--"
            if (statement.contains("++")) {
                x++;
            } else if (statement.contains("--")) {
                x--;
            }
        }
        
        // Output the final value of x
        System.out.println(x);
        
        sc.close();
    }
}
