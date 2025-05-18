import java.util.Scanner;

public class Bai40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long tien = 0;

        // Tính tiền điện dựa theo mức tiêu thụ
        if (N >= 1000) {
            tien = N * 4500 + 1200000;
        } else if (N >= 800) {
            tien = N * 3900 + 900000;
        } else if (N >= 500) {
            tien = N * 3700 + 800000;
        } else {
            tien = N * 3300;
        }
        System.out.println(tien);
    }
}
