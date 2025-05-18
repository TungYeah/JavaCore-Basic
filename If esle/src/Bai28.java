import java.util.Scanner;

public class Bai28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long u1 = sc.nextLong();
        long d = sc.nextLong();
        if (2 < n && n > 10000 && u1 < 1 ) {
            System.out.println("INVALID");
        }
        else {
            long sN =  n * (2 * u1 + (n - 1) * d) / 2;
            System.out.println(sN);
        }
    }
}
