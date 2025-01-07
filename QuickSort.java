import java.util.Scanner;
import java.util.Arrays;

class QuickSort {

    static void quicksort(int[] a, int s, int e) {
        if(s<e) {
            int loc = partition(a,s,e);
            quicksort(a,0,loc-1);
            quicksort(a,loc+1,e);
        }
    }

    static int partition(int[] a, int s, int e) {
        int p = a[s];
        int lb = s;
        int ub = e;

        while(lb < ub) {
            while(a[lb] <= p) {
                lb++;
            }
            while(a[ub] > p) {
                ub--;
            }
            if(lb < ub) {
                int temp = a[lb];
                a[lb] = a[ub];
                a[ub] = temp;
            }
        }

        int temp = a[ub];
        a[ub] = a[s];
        a[s] = temp;
        return ub;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        quicksort(a,0,n-1);
        System.out.println(Arrays.toString(a));
    }
}