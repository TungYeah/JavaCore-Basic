import java.util.Scanner;

public class Bai44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long tong1 = (long) N * (N + 1) / 2;
        long tong2 = (long) N * (N + 1) * (2 * N + 1) / 6;
        int chia3 = N / 3;
        long tong3 = 3L * chia3 * (chia3 + 1) / 2;
        System.out.println(tong1);
        System.out.println(tong2);
        System.out.println(chia3);
        System.out.println(tong3);
    }
}
