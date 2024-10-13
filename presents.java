import java.util.Scanner;

public class presents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of friends
        int n = sc.nextInt();
        
        // Create an array to store gift givers
        int[] giftGiver = new int[n];
        
        // Read the input array (who gave gifts to whom)
        for (int i = 0; i < n; i++) {
            int recipient = sc.nextInt();
            // Store the friend who gave the gift to this recipient
            giftGiver[recipient - 1] = i + 1;
        }
        
        // Print the result
        for (int i = 0; i < n; i++) {
            System.out.print(giftGiver[i] + " ");
        }
    }
}
