// import java.util.Scanner;

// public class threebrothers {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = 0;

//         if(a < b){
//             System.out.println(c = a + 1);
//         }
//         else if(a > b) {
//             System.out.println(c = b + 1);
//         }
//         sc.close();
//     }
// }

import java.util.Scanner;

public class threebrothers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        // Sum of all brothers (1 + 2 + 3) is 6
        int c = 6 - (a + b);  // The missing brother is 6 - (a + b)
        
        System.out.println(c);
        sc.close();
    }
}
