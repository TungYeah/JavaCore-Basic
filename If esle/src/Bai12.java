import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int thang = sc.nextInt();
        int nam = sc.nextInt();
        if (thang >= 1 && thang <= 12 && nam > 0){
            if(thang == 1 || thang == 3 || thang == 5 || thang == 8 || thang ==7 || thang == 10 || thang ==12) {
                System.out.println("31");
            } else if (thang == 4 || thang == 6 || thang == 9 || thang ==11) {
                System.out.println("30");
            }
            else
                if (nam % 400 == 0 || (nam % 4 == 0 && nam % 100 != 0)){
                    System.out.println("29");
            }
                else
                    System.out.println("28");
        }
        else
            System.out.println("INVALID");
    }
}
