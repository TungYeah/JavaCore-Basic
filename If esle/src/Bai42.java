import java.util.Scanner;

public class Bai42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        h = h / 100;

        double bmi = w / (h * h);

        if (bmi < 18.5) {
            System.out.println("Under weight");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("Over weight");
        } else if (bmi < 35) {
            System.out.println("Obesity 1");
        } else if (bmi < 40) {
            System.out.println("Obesity 2");
        } else {
            System.out.println("Extreme obesity");
        }
    }
}
