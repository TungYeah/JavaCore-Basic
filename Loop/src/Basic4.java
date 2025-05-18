import java.util.Scanner;

public class Basic4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 1: In ra các số nguyên dương chia hết cho 3 <= N
        int i = 3;
        while (i <= N) {
            System.out.print(i + " ");
            i += 3;
        }
        System.out.println();

        // 2: In ra các số nguyên không âm chia hết cho cả 3 và 5 < N
        i = 0;
        while (i < N) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();

        // 3: Số nhỏ nhất >= N chia hết cho 7
        for (i = N; ; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
                break;
            }
        }

        // 4: Số lớn nhất <= N chia hết cho 9
        for (i = N; i >= 0; i--) {
            if (i % 9 == 0) {
                System.out.println(i);
                break;
            }
        }

        // 5: In ra dãy số : 1, 3, 5, 7, 9 .... 2N - 1
        i = 1;
        while (i < 2 * N) {
            System.out.print(i + " ");
            i += 2;
        }
        System.out.println();
    }
}
