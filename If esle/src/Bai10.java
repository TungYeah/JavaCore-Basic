import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a + b > c && a + c > b && b + c > a && a > 0 && b > 0 && c > 0) {
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
}