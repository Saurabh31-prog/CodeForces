import java.util.Scanner;

public class cutRibbon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ; //ribbon length;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int maxPieces = 0; 

        for (int x = 0; x <= n / a; x++) {  // Number of cuts of length `a`
            for (int y = 0; y <= (n - x * a) / b; y++) {  // Number of cuts of length `b`
                int remainingLength = n - (x * a + y * b);
                if (remainingLength % c == 0) {  // Check if remaining length can be cut by `c`
                    int z = remainingLength / c;  // Number of cuts of length `c`
                    maxPieces = Math.max(maxPieces, x + y + z);  // Maximize the number of pieces
                }
            }
        }

        System.out.println(maxPieces);

        sc.close();
    }
    
}

