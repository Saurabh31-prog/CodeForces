import java.util.Scanner;

public class longestgoodArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // number of test cases
        
        while (t-- > 0) {
            long l = sc.nextLong();  // lower bound
            long r = sc.nextLong();  // upper bound
            
            long d = r - l;  // difference between r and l
            
            // Using quadratic formula to find the maximum k
            long k = (long) ((-1 + Math.sqrt(1 + 8 * d)) / 2);
            
            // The longest good array has length k + 1
            System.out.println(k + 1);
        }
        
        sc.close();
    }
}
