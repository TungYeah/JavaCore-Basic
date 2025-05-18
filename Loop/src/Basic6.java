import java.util.Scanner;

public class Basic6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong(); // Nhập số N lớn

        long previousDigit = N % 10;
        N /= 10;
        long totalDifference = 0;


        while (N > 0) {
            long currentDigit = N % 10; // Lấy chữ số tiếp theo
            totalDifference += Math.abs(currentDigit - previousDigit); // Tính chênh lệch tuyệt đối
            previousDigit = currentDigit; // Cập nhật chữ số trước đó
            N /= 10; // Bỏ chữ số hiện tại
        }

        // In ra kết quả
        System.out.println(totalDifference);
    }
}
