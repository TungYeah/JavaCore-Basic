import java.util.Scanner;

public class Bai9 {
    public static boolean chua6(int n){
        while (n > 0){
            if ( n % 10 == 6){
                return true;
            }
            n /= 10;
        }
        return false;
    }

    public static boolean tongchan(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return  (sum % 2 == 0);
    }
    public static boolean chanle(int n) {
        int chan = 0;
        int le = 0;
        while (n > 0) {
            if( n % 2 == 0){
                chan++;
            }
            else le++;
            n /= 10;
        }
        return  (le > chan );
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a; i <= b; i++){
            if(chua6(i) && tongchan(i) && chanle(i)){
                System.out.printf(i + " ");
            }
        }
    }
}
