import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        long tong = (long) a + b;
        int  hieu = a - b;
        long tich = (long) a*b;
        double thuong;
        System.out.println(tong);
        System.out.println(hieu);
        System.out.println(tich);
        if( b == 0){
            System.out.println("INVALID");
        }
        else {
            thuong = (double) a / b;
            System.out.printf("%.4f", thuong);
        }
    }
}
