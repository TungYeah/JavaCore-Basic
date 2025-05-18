import java.util.Scanner;

public class Bai41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dem = 0;
        int tong = 0;
        for (int i = 0; i < n; i++) {
            char kitu = sc.next().charAt(0);
            if (Character.isLetter(kitu)) {
               dem++;
            }
            else if (Character.isDigit(kitu)) {
                tong += kitu - '0';
            }
        }

        System.out.println(dem);
        System.out.println(tong);
    }
}
