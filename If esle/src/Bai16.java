import java.util.Scanner;

public class Bai16 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        char c = sc.next().charAt(0);

        char nextChar;

        if (c == 'Z'){
            nextChar = 'a';
        }
        else if (c == 'z'){
            nextChar = 'a';
        }
        else if (c >= 'A' && c <= 'Y'){
            nextChar = (char) (c+1);
        }
        else if (c >= 'a' && c <= 'y'){
            nextChar =(char) (c+1);
        }
        else{
            throw new IllegalArgumentException("INVALID");
        }
        System.out.println(Character.toLowerCase(nextChar));
    }
}
