import java.util.Scanner;

public class Bai25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int soDoLa = 0;
        soDoLa += n/ 100;
        n %= 100;

        soDoLa += n / 20;
        n %= 20;

        soDoLa += n / 10;
        n %= 10;

        soDoLa += n/5;
        n %= 5;

        soDoLa += n;

        System.out.println(soDoLa);
    }
}
