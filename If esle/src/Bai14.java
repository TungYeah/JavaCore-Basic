import java.util.Scanner;

public class Bai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double trungBinh = (a + b+ 2 * c + 3 * d)/7;
        if(trungBinh >= 8)
            System.out.println("GIOI");
        else if (trungBinh <= 8 && trungBinh >= 6.5) {
            System.out.println("KHA");
        }
        else if (trungBinh >= 5 && trungBinh < 6.5){
            System.out.println("TRUNG BINH");
        }
        else
         System.out.println("YEU");
    }
}
