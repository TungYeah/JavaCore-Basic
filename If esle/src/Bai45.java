import java.util.Scanner;

public class Bai45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();

        if (N == 0) {
            System.out.println(0);
        } else {
            long result = N % 9;
            if (result == 0) {
                System.out.println(9);
            } else {
                System.out.println(result);
            }
        }
    }
}
