import java.util.*;

public class battleforSurvive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0)
        {
            int n= sc.nextInt();
            long[] arr = new long[n];
            long sum = 0;

            for(int i = 0; i < n-2; i++)
            {
                arr[i] = sc.nextLong();
                sum += arr[i];
            }
            long secondlast = sc.nextLong();
            secondlast -= sum;
            
            long last = sc.nextLong();
            last -= secondlast;
            System.out.println(last);
            
        }
        sc.close();
    }
    
}
