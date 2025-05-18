import java.util.Scanner;
import java.util.Stack;

public class Test {
    static void stack_push(Stack<Integer> stack){
        for (int i = 0; i < 5; i++){
            stack.push(i);
        }
    }

    static void stack_pop(Stack<Integer> stack){
        for (int i = 0; i < 5; i++){
           int y = (int) stack.pop();;
            System.out.println(y);
        }
    }

    static void stack_peek(Stack<Integer> stack){
        int element = (int) stack.peek();
        System.out.println(element);
    }

    static void stack_search(Stack<Integer> stack, int element){
        int pos = (int) stack.search(element);
        if (pos == -1){
            System.out.println("NOT FOUND");
        }
        else
            System.out.println("FOUND");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        stack_push(stack);
        stack_pop(stack);
        stack_push(stack);
        stack_peek(stack);
        stack_search(stack,2 );
        stack_search(stack, 6);
    }
}
