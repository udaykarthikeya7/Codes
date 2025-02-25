import java.util.Stack;
import java.util.Scanner;

public class MinStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < n; i++) {
            a = sc.nextInt();
            if(stack.isEmpty() || a <= stack.peek()) {
                stack.push(a);
            }
        }
        sc.close();
        while(!stack.isEmpty()) System.out.print(stack.pop()+" ");
    }
}
