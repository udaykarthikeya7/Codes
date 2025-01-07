import java.util.Scanner;

class leaders_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int max = arr[n-1];
        int[] res = new int[n];
        res[0] = max;
        int c = 1;
        for(int i = n-2; i >= 0 ;i--) {
            if (arr[i] >= max) {
                max = arr[i];
                res[c] = max;
                c++;
            }
        }
        for(int i = c-1; i >= 0; i--){
            System.out.print(res[i] + " ");
        }
    }
}