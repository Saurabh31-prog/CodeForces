import java.util.HashSet;
import java.util.Scanner;

public class boyorGirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        HashSet<Character> distinctChar = new HashSet<>();

        for(char c : name.toCharArray())
        {
            distinctChar.add(c);
        }

        if(distinctChar.size() % 2 == 0){
            System.out.println("CHAT WITH HER!");
        }
        else{
            System.out.println("IGNORE HIM!");
        }
    }
    
}
