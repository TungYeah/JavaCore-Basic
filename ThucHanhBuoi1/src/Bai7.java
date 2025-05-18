import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double kq = Math.pow(N , 1.0 / 5.0);
        System.out.printf("%.2f",kq);
    }
}
