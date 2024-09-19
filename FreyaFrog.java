import java.util.Scanner;

public class FreyaFrog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();  // Number of test cases
        
        // Process each test case
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int k = sc.nextInt();
            
            int moveX = 2 * (int) Math.ceil((double) x / k) - 1;
            int moveY = 2 * (int) Math.ceil((double) y / k);
            System.out.println(Math.max(moveX, moveY));
        }
        
        sc.close();
    }
}
