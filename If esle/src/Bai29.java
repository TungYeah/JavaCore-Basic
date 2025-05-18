import java.util.Scanner;

public class Bai29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int congBoi = b / a;

        if(b % a != 0 ) {
            System.out.println("NO");
            return;
        }
         if (c != b * congBoi){
             System.out.println("NO");
             return;
         }
         if (d != c * congBoi){
             System.out.println("NO");
         }
         else System.out.println("YES");
    }
}
