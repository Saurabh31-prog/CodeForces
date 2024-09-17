import java.util.*;
public class AlternatingSumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 0; i < t; i++){
        int n  = sc.nextInt();
        int[] arr = new int[n];

        for(int j = 0; j < n; j++){
            arr[j] = sc.nextInt();
        }
        //calculating the sum
        int altSum = 0;
        for(int j = 0; j < n; j++){
            if(j % 2 == 0){
                altSum += arr[j];
            }else {
                altSum -= arr[j];
            }
        }
        System.out.println(altSum);

        }
        sc.close();
    }
    
}
