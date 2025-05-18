import java.util.Scanner;

public class Bai18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);

        if(Character.isUpperCase(c)){
            System.out.println(Character.toLowerCase(c));
        } else if (Character.isLowerCase(c)) {
            System.out.println(Character.toUpperCase(c));
        }
        else
            System.out.println(c);
    }
}
