import java.util.Scanner;

public class Bai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int nam = N / 365;
        int tuan = (N % 365) / 7;
        int ngay = (N % 365) % 7;
        System.out.println(nam + " " + tuan + " "+ ngay);
    }
}
