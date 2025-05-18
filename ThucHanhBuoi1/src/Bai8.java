import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long soChia3 = N / 3;
        long soChia5 = N / 5;
        long soChia15 = N / 15;

        long kq = soChia3 + soChia5 - soChia15;

        System.out.println(kq);
    }
}
