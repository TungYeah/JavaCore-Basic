import java.util.Scanner;

public class Basic3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // Dòng 1: In ra các số từ 1 tới N (sử dụng vòng lặp for)
        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Dòng 2: In ra các số từ N về 0 (sử dụng vòng lặp for)
        for (int i = N; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Dòng 3: In ra các số chẵn nhỏ hơn hoặc bằng N (sử dụng vòng lặp for)
        for (int i = 0; i <= N; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Dòng 4: In ra các số lẻ nhỏ hơn hoặc bằng N (sử dụng vòng lặp while)
        int i = 1;
        while (i <= N) {
            System.out.print(i + " ");
            i += 2;
        }
        System.out.println();

        // Dòng 5: In ra các bội số của 4 nhỏ hơn N (sử dụng vòng lặp while)
        i = 0;
        while (i < N) {
            System.out.print(i + " ");
            i += 4;
        }
        System.out.println();

        for (char c = 'a'; c < 'a' + N; c++) {
            System.out.print(c + " ");
        }
        System.out.println();


        int c = 'z' - N + 1;
        while (c <= 'z') {
            System.out.print(c + " ");
            c++;
        }
        System.out.println();
    }
}
