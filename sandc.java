import java.util.Scanner;

public class sandc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();  // Number of test cases
        
        for (int i = 0; i < t; i++) {
            long n = sc.nextLong();  // Input number
            
            // Count perfect squares
            long squares = (long) Math.sqrt(n);
            
            // Count perfect cubes
            long cubes = (long) Math.cbrt(n);
            
            // Count perfect sixth powers by direct iteration
            long sixthPowers = countSixthPowers(n);
            
            // Calculate result
            long result = squares + cubes - sixthPowers;
            System.out.println(result);
        }
        
        sc.close();
    }
    
    // Method to count the number of perfect sixth powers <= n
    private static long countSixthPowers(long n) {
        long count = 0;
        for (long i = 1; i * i * i * i * i * i <= n; i++) {
            count++;
        }
        return count;
    }
}
