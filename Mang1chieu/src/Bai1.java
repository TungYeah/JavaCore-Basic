    import java.util.Scanner;

    public class Bai1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();
            int dem = 0;
            int dem2 = 0;
            int tong = 0;
            int tong2 =0;
            int a[] = new int[size];
            for (int i = 0; i < size; i++){
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < size; i++){
                if(a[i] % 2 == 0 ){
                    dem++;
                    tong += a[i];
                }
                else {
                    dem2++;
                    tong2 += a[i];
                }
            }
            System.out.println(dem);
            System.out.println(dem2);
            System.out.println(tong);
            System.out.println(tong2);
        }

    }
