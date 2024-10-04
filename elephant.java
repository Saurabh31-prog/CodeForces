import java.util.Scanner;

public class elephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the input value x
        int x = sc.nextInt();
        
        // Calculate the number of steps needed
        // Full steps of size 5
        int steps = x / 5;
        
        // If there's a remainder, add one extra step
        if (x % 5 != 0) {
            steps++;
        }
        
        // Output the result
        System.out.println(steps);
        
        sc.close();
    }
}
