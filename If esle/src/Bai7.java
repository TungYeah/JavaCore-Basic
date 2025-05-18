import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int numBer1 = (a / b) * b;
        int numBer2;
        if (a %b ==0){
            numBer2 = a ;
        }
        else {
            numBer2 = (a / b + 1 ) * b;
        }
        System.out.println(numBer1 + " " + numBer2);

    }
}
