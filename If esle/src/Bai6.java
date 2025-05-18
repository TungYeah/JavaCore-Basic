import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N >0) {
            if (N % 2 == 0) {
                System.out.println("YES");
            } else
                System.out.println("NO");

            if (N % 3 == 0 && N % 5 == 0) {
                System.out.println("YES");
            } else
                System.out.println("NO");

            if (N % 3 == 0 && N % 7 != 0) {
                System.out.println("YES");
            } else
                System.out.println("N0");

            if (N % 3 == 0 || N % 7 == 0) {
                System.out.println("YES");
            } else
                System.out.println("NO");

            if (N > 30 && N < 50) {
                System.out.println("YES");
            } else
                System.out.println("NO");

            if (N >= 30 && (N % 2 == 0 || N % 3 == 0 || N % 5 == 0)) {
                System.out.println("YES");
            } else System.out.println("NO");

            if (N >= 10 && N <= 99) {
                int soCuoi = N % 10;
                if (soCuoi == 2 || soCuoi == 3 || soCuoi == 5 || soCuoi == 7) {
                    System.out.println("YES");
                }
            } else System.out.println("NO");

            if (N <= 100 && N % 23 == 0) {
                System.out.println("YES");
            } else System.out.println("NO");

            if (N < 10 || N > 20) {
                System.out.println("YES");
            } else System.out.println("NO");

            if (N % 10 % 3 == 0) {
                System.out.println("YES");
            } else System.out.println("NO");
        }
        else
            System.out.println("No");
    }
}
