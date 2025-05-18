import java.util.Scanner;

public class Bai3 {
    public static void sum(int n){
        System.out.println(n * 28);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sum(n);
    }
}
