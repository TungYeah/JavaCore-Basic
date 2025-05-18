import java.util.Scanner;

public class Bai10 {
    public static boolean  chanle(int n){
        int chan = 0;
        int le = 0;
        while (n > 0){
            int digit = n % 10;
            if( digit % 2 == 0){
                chan ++;
            }
            else{
                le++;
            }
            n /= 10;
        }
        return (chan > le);
    }

    public static boolean check(int n){
        int sum = 0;
        while (n > 0){
            sum += (n % 10);
            n /= 10;
        }
        return(chanle(sum));
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1 ; i <= n ; i++){
            if (check(i)) {
                System.out.printf(i + " ");
            }
        }
    }
}
