import java.util.Scanner;

public class minOps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            
            int operations = 0;
            
            if (k == 1) {
                operations = (int) n;
            } else {
                while (n > 0) {
                    operations += n % k;
                    n /= k;
                }
            }

            System.out.println(operations);
        }
        
        sc.close();
    }
}
