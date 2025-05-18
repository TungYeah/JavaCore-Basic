import java.util.Scanner;

public class congSo {
    public static String findMax(String s, String t){
        if (s.length() > t.length()){
            return s;
        }
        else
            return t;
        if(s.compareTo(t) > 0)
            return s;
        else
            return t;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String t = "";
        for (char x : s.toCharArray()){
            if (Character.isDigit(x)){
                t += x;
            }
            else
                t += " ";
        }
        String[] arr = t.trim().split("\\s+");
        String ans= " ";
        for (String x : arr){
            StringBuilder sb = new StringBuilder(x);
            while (sb.length() > 1 && sb.charAt(0) == '0')
                sb.deleteCharAt(0);
            ans = findMax(ans,sb.toString());
        }
        System.out.println(ans);
    }
}
