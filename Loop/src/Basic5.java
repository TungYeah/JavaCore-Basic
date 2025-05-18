import java.util.Scanner;

public class Basic5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        long N = sc.nextLong(); // Nhập số nguyên N có thể rất lớn
        long lastDigit = N % 10;
        while (N >= 10) {
            N /= 10;
        }
        long firstDigit = N;

        System.out.println(firstDigit + " " + lastDigit);
    }
}
