import java.util.Scanner;
import java.util.TreeSet;

class StaticUniquePermutation {
    static TreeSet<String> ts = new TreeSet<String>();
    static void generatePermutation(char[] arr, int start, int end) {
        if(start == end) {
            String out = "";

            for(int i = 0; i < arr.length; i++) {
                out = out + arr[i];
            }
            ts.add(out);
        } else {
            for(int i = start; i <= end; i++) {
                swap(arr,start,i);
                generatePermutation(arr, start+1, end);
                swap(arr,start,i);
            }
        }
    }

    static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        generatePermutation(s.toCharArray(), 0, s.length()-1);
        for(String ele: ts) {
            System.out.print(ele+" ");
        }
    }
}