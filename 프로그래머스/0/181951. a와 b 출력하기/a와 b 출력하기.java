import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        while(true){
            if(a < -100000) {
                a = sc.nextInt();
                continue;
            }

            if(b > 100000) {
                b = sc.nextInt();
                continue;
            }

            break;
        }

        System.out.print("a = " + a +"\nb = " + b);
    }
}