import java.util.Scanner;

public class Bai2 {
    public static boolean snt(int n){
        if(n <2){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n) ; i++){
                if( n % i ==0){
                    return false;
                }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int dem =0;

        int a[] = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for (int i = 0 ; i < n; i++){
            if(snt(i)){
                dem++;
                sum += a[i];
            }
        }
        double tbc = (double) sum / dem;
        System.out.printf("%.3f\n", tbc);
    }
}
