import java.util.Scanner;

public class Bai38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dem = 0;
        boolean c = false;
        for (int i = 0; i < n; i++) {
            String kiTu = sc.next(); // Đọc từng ký tự
            if (kiTu.equals("+")) {
                dem++;
            }
            if (kiTu.equals("C")) {
                c = true;
            }
        }
        if (dem >= 2 && c) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
