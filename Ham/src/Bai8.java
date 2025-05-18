import java.util.Scanner;

public class Bai8 {
    public static boolean so_dep(int n){
        int soChan = 0;
        int soLe = 0;
        while (n > 0){
           int digit =  n % 10;
           if(digit % 2 == 0){
               soChan++;
           }
           else {
               soLe++;
           }
           n /= 10;
        }
        return soChan == soLe;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1 ; i <= n; i++){
            if (so_dep(i)){
                System.out.printf(i + " ");
            }
        }
    }
}
