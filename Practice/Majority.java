package Practice;

import java.util.Scanner;

public class Majority {
    static int FindMajority(int[] arr, int n) {
        int count = 0;
        int elem = 0;
        for(int i : arr) {
            if(count == 0) {
                elem = i;
            }
            count += (i == elem) ? 1 : -1;
        }

        count = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] == elem) {
                count++;
            }
            if(count > n/2) {
                return elem;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
        sc.close();
        int res = FindMajority(arr,n);
        System.out.println(res);
    }
}
