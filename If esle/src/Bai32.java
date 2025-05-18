import java.util.Scanner;

public class Bai32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long k2 = sc.nextLong();
        long k3 = sc.nextLong();
        long k5 = sc.nextLong();
        long k6 = sc.nextLong();
        long n =  Math.min(Math.min( k2 , k5 ), k6);
        long m =  Math.min(k3, k2 - n);
        System.out.println(  256 * n + 32 * m );
    }
}
