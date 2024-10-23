import java.util.Scanner;
public class letswatchFootball{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int minWaitTime = (int) Math.ceil((double)(a - b) * c / b);

        // Output the minimum waiting time
        System.out.println(minWaitTime);
    }
}