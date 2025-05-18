    import java.util.Scanner;

    public class Bai34 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);


            int c1 = sc.nextInt();
            int c2 = sc.nextInt();
            int c3 = sc.nextInt();
            int c4 = sc.nextInt();
            int c5 = sc.nextInt();


            int tongXu = c1 + c2 + c3 + c4 + c5;

            // Kiểm tra điều kiện tổng chia hết cho 5 và lớn hơn 0
            if (tongXu % 5 == 0 && tongXu > 0) {
                System.out.println(tongXu / 5);
            } else {
                System.out.println("-1");
            }
        }
    }