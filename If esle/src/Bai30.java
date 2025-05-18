import java.util.Scanner;

public class Bai30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if( N < 2){
            System.out.println(0);
        }
        else {
            long ketQua = (long) N * (N - 1) / 2;
            System.out.println(ketQua);
        }
    }
}
