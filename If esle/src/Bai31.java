import java.util.Scanner;

public class Bai31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();
        int b1= sc.nextInt();
        int b2 = sc.nextInt();
        int b3 = sc.nextInt();
        int n = sc.nextInt();
        int soCup = a1 + a2 + a3;
        int soHuyChuong = b1 + b2 + b3;
        int n1 = (soCup + 4) / 5;
        int n2 = (soHuyChuong + 9) / 10;
        if (n1 + n2 <= n)
        {
            System.out.println("YES");
        }
        else
            System.out.println("NO");
    }
}
