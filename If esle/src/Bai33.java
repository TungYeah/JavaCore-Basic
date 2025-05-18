import java.util.Scanner;

public class Bai33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int n = sc.nextInt();
        int tongSoTien = a + b + c +n;
        if(tongSoTien % 3 != 0){
            System.out.println("NO");
            return;
        }
        int m = tongSoTien / 3;
        if(a > m || b > m || c > m)
        {
            System.out.println("NO");
        }
        else System.out.println("YES");
    }
}
