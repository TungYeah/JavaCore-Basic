import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        long A = (long) Math.pow(x,3) + (long)Math.pow(x, 2)*3 + x + 1;
        System.out.println(A);
    }

}
