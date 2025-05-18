import java.util.Scanner;

public class Basic9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong(); // Nhập số nguyên N

        // Lấy giá trị tuyệt đối của N
        long absN = Math.abs(N);

        int oddCount = 0; // Biến đếm chữ số lẻ
        int evenCount = 0; // Biến đếm chữ số chẵn

        // Đếm số lượng chữ số lẻ và chẵn
        if (absN == 0) {
            evenCount = 1; // 0 là chữ số chẵn
        } else {
            while (absN > 0) {
                long digit = absN % 10; // Tách chữ số cuối
                if (digit % 2 == 0) {
                    evenCount++; // Nếu chữ số chẵn
                } else {
                    oddCount++; // Nếu chữ số lẻ
                }
                absN /= 10; // Bỏ chữ số cuối
            }
        }

        // So sánh số lượng chữ số lẻ và chẵn
        if (oddCount < evenCount) {
            System.out.println("28tech");
        } else {
            System.out.println("29tech");
        }
    }
}
