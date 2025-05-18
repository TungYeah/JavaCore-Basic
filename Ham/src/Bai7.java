import java.util.Scanner;

public class Bai7 {
    public static boolean check (long n){
        int sum = 0;
        while (n > 0){
            sum += n%10;
            n /= 10;
        }
        return (sum % 10 == 8);
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(check(n) == true){
            System.out.println("28tech");
        }
        else{
            System.out.println("29tech");
        }
    }
}
