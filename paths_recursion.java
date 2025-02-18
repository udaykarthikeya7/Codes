import java.util.Scanner;

public class paths_recursion {
    static int numberOfPaths(int r, int c) {
        if(r == 1 || c == 1) return 1;
        else return numberOfPaths(r-1,c) + numberOfPaths(r,c-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows and columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Number of paths from start to destination: "+numberOfPaths(r,c));
        sc.close();
    }
}
