import java.util.Scanner;

public class Bai4 {
    public  static int solve(int a, int b, int c){
        System.out.println("28tech.com.vn");
        System.out.println((2 * a) + " " + (3 * b) + " " + (4 * c));
        int product =  a * b * c;
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(solve(a,b,c));
    }
}
