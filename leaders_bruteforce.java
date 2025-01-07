import java.util.Scanner;

class leaders_bruteforce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int[] res = new int[n];
        int c = 0;
        outer: for(int i = 0; i < n-2; i++) {
            for(int j = i+1; j < n-2; j++) {
                if (arr[j] > arr[i]) continue outer;
            }
            res[c] = arr[i];
            c++;
        }
        res[c] = arr[n-1];
        for(int i = 0; i <= c; i++) System.out.print(res[i] + " ");
    }
}
