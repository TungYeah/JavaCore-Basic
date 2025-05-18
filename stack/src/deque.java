import java.util.*;

public class deque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Deque<String> deque = new ArrayDeque<>();
        for (int i = 0; i < n; i++){
            String input = sc.nextLine();
            deque.push(input);
        }
        while (! deque.isEmpty()){
            System.out.printf(deque.pop() + " ");
        }
    }
}
