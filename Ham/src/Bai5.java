import java.util.Scanner;

public class Bai5 {
    public  static int sum_digit(long n){
        int sum = 0;
        while (n > 0){
            sum += n%10;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(sum_digit(n));
    }
}
