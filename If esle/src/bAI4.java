import java.util.Scanner;

public class bAI4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        double Pi = 3.14;
        double chuVi = (double) 2 * Pi * R;
        double dienTich = (double) Pi * Math.pow(R,2);
        System.out.printf("%.4f", chuVi);
        System.out.printf(" ");
        System.out.printf("%.4f", dienTich);
    }
}
