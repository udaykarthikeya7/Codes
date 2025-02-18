import java.util.Scanner;

public class MajorityElem {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int cnt = 0;
        int elem = 0;
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if(cnt == 0) {
                elem = arr[i];
                cnt = 1;
            }
            else if(elem == arr[i]) {
                cnt++;
            } else {
                cnt--;
            }
        }
        sc.close();

        cnt = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] == elem) {
                cnt++;
            }
            if(cnt > n/2) {
                System.out.println(elem);
                return;
            }
        }
        System.out.println(-1);
    }
}
