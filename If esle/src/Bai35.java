import java.util.Scanner;

public class Bai35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();

        int soPhut1ngay = 24 * 60;

        int soPhutH = 60 * h + m ;

        System.out.println(soPhut1ngay - soPhutH);


    }
}
