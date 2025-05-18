import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Bai3 {
    public static int tong(int n){
        int sum = 0;
        while(n != 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] a = new Integer[n];
        for (int i = 0 ; i < n ; i ++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a, new Comparator<Integer>(){

            @Override
            public int compare(Integer o1, Integer o2) {
                return tong(o1) - tong(o2);
            }
        });
        for(int x : a){
            System.out.printf(x + " ");
        }
    }
}
