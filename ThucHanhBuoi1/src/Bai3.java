import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        long N = sc.nextLong();

        long soTien = N / 500000;

        long tienThua = N - (soTien * 500000);

        System.out.println(soTien);
        System.out.println(tienThua );
    }
}
