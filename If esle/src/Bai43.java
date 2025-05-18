import java.util.Scanner;

public class Bai43 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char c = sc.next().charAt(0);

        switch (c) {
            case '+':
                System.out.printf("%d + %d = %d\n", a, b, a + b);
                break;
            case '-':
                System.out.printf("%d - %d = %d\n", a, b, a - b);
                break;
            case '*':
                System.out.printf("%d * %d = %d\n", a, b, a * b);
                break;
            case '/':
                System.out.printf("%d / %d = %.2f\n", a, b, (double) a / b);
                break;
            case '%':
                System.out.printf("%d %% %d = %d\n", a, b, a % b);
                break;
            default:
                System.out.println("Phép toán không hợp lệ.");
        }
    }
}
