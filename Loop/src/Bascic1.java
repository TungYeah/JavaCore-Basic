import java.util.Scanner;

public class Bascic1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println("Hello 28tech");
        }

        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < N; i++) {
            System.out.print(i + " ");
        }
        System.out.println();


        for (int i = N; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = N - 1; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

