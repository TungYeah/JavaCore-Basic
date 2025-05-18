import java.util.Scanner;

public class Bai22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long S = sc.nextLong();
        long soXuToiThieu =  S / n;
         if (S % n != 0){
             soXuToiThieu +=1;
         }
        System.out.println(soXuToiThieu);
    }
}
