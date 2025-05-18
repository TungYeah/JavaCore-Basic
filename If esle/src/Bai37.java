import java.util.Scanner;

public class Bai37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int tongSoPhut = h * 28 +m;

        tongSoPhut = (tongSoPhut + k) % 784;

        int gio = tongSoPhut / 28;
        int phut = tongSoPhut % 28;

        System.out.printf("%02dh:%02dm\n", gio,phut);
    }
}
