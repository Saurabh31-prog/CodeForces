import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); 

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(); 
            
            int tens = n / 10; 
            int units = n % 10; 
            int sum = tens + units;
            
            System.out.println(sum);
        }

        sc.close(); 
    }
}
