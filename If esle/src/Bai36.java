import java.util.Scanner;

public class Bai36{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long gio = n / 3600;
        long phut = (n % 3600) / 60;
        long giay = n % 60;
        System.out.println( gio + "h : "+ phut + "m : " + giay + "s");
    }
}
