import java.util.Scanner;

public class Basic2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();


        for (int i = 0; i <= N; i += 3) {
            System.out.print(i + " ");
        }
        System.out.println();


        for (int i = 1; i <= N; i *= 2) {
            System.out.print(i + " ");
        }
        System.out.println();


        for (int i = N; ; i++) {
            if (i % 17 == 0) {
                System.out.println(i);
                break;
            }
        }


        for (int i = N - 1; i >= 0; i--) {
            if (i % 7 == 0) {
                System.out.println(i);
                break;
            }
        }


        int current = 1;
        int step = 1;
        while (current <= N) {
            System.out.print(current + " ");
            current += step;
            step++;
        }
        System.out.println();
    }
}
