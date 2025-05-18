import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        double F =  (C * 9.0 / 5) +32;
        System.out.printf("%.2f", F);
    }
}
