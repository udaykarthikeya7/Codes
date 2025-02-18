import java.util.Scanner;

class MaxEqSum_Iter {
    static int FindMaxEqSum(int[] arr, int n) {
        int res = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++) {
            int prefix_sum = arr[i];
            for(int j = 0; j < i; j++) {
                prefix_sum += arr[j];
            }
            int suffix_sum = arr[i];
            for(int j = n-1; j > i; j--) {
                suffix_sum += arr[j];
                if(prefix_sum == suffix_sum) res = Math.max(res, prefix_sum);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
        sc.close();
        System.out.println(FindMaxEqSum(arr, n));
    }
}