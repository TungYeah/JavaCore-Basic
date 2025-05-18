import java.util.Scanner;

public class Bai15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gia1Lit = a;
        int gia2Lit = b/2;
        if (gia1Lit <= gia2Lit){
            System.out.println(n*a);
        }
        else{
            if( n % 2 == 0){
                System.out.println(n /2 * b);
            }
            else
                System.out.println((n / 2) * b +a);
        }
    }
}
