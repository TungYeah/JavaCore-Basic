import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++){

            String s = sc.nextLine().toLowerCase();
            String[] arr = s.split("\\s+");
            int doDai = arr.length;
            String email = arr[doDai - 1];
            for (int j = 0; j < doDai - 1; j++){
                email += arr[j].charAt(0);
            }
            email += "@gmail.com";
            System.out.println(email);

        }

        sc.close();
    }
}
