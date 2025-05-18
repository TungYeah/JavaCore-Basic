import java.util.Scanner;

public class Basic8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long firstDigit = N;
        while (firstDigit >= 10) {
            firstDigit /= 10;
        }

        long maxDigit = 0;
        long currentN = N;


        while (currentN > 0) {
            long currentDigit = currentN % 10;
            if (currentDigit > maxDigit) {
                maxDigit = currentDigit;
            }
            currentN /= 10;
        }


        if (firstDigit >= maxDigit) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
