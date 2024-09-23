import java.util.Scanner;

public class beautifulMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[5][5];
        int row = 0, col = 0;
        int moves = 0;


        for(int i = 0; i< 5; i++){
            for(int j = 0; j < 5; j++){
                matrix[i][j] = sc.nextInt();
                if(matrix[i][j] == 1){
                    row = i;
                    col = j;
                }
            }
        }
        moves = Math.abs(row- 2) + Math.abs(col - 2);
        System.out.println(moves);
        sc.close();
    }
    
}
