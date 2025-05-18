import java.util.Scanner;

public class Baisic7 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        long N = sc.nextLong();

        long max = 0;
        if (N == 0) {
            max = 0;
        }


        while (N > 0) {
            long currentDigit = N % 10;
            if (currentDigit > max) {
                max = currentDigit;
            }
            N /= 10; // Bỏ chữ số cuối cùng
        }
        System.out.println(max);

    }
}
