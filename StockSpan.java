import java.util.Scanner;
import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int[] sp = new int[n];
        // for(int i = 0; i < n; i++) {
        //     sp[i] = sc.nextInt();
        // }
        // sc.close();
        int[] sp = {100,80,60,70,60,75,85};         // stock prices
        int n = sp.length;
        Stack<Integer> st = new Stack<Integer>();   // stack
        int[] span = new int[n];                    // stock span
        span[0] = 1;
        st.push(0);
        for(int i = 1; i < n; i++) {
            while(!st.isEmpty() && sp[i]>=sp[st.peek()]) {
                st.pop();
            }
            span[i] = st.isEmpty() ? i+1 : i-st.peek();
            st.push(i);
        }
        for (int i : span) {
            System.out.print(i+" ");
        }
    }
}
// span = [1,1,1,2]
// stack = [0,1,2,3]