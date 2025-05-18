import java.util.Scanner;

public class Bai17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);

        if (Character.isLowerCase(c)) {
            System.out.println(" LOWER");
        } else if (Character.isUpperCase(c)) {
            System.out.println("UPPER");
        } else if (Character.isDigit(c)) {
            System.out.println("DIGIT");
        } else
            System.out.println("SPECIAL");
    }
}
