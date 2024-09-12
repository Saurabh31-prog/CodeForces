import java.util.*;

public class Kuriyama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] v =new int[n];
        for(int i = 0; i< n; i++){
            v[i] = sc.nextInt();
        }

        //create prefix sum
        long[] prefixV = new long[n +1]; 
        for(int i = 1; i<= n; i++){
            prefixV[i] = prefixV[i-1] + v[i-1];  
        }

        //array for sorted array
        int[] sortedV = v.clone();
        Arrays.sort(sortedV);

        long[] prefixU = new long[n+1];
        for(int i = 1; i <= n; i++){
            prefixU[i] = prefixU[i-1] + sortedV[i-1];
        }

        int m = sc.nextInt();

        for(int i = 0; i < m; i++){
            int type = sc.nextInt();
            int l =sc.nextInt();
            int r = sc.nextInt();

            if(type == 1) {
                System.out.println(prefixV[r] - prefixV[l-1]);
                
            }else {
                System.out.println(prefixU[r] - prefixU[l-1]);
            }
        }
    sc.close();
    }   
}

