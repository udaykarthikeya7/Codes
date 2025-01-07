import java.util.Scanner;
import java.util.Arrays;

public class Matrix_Mul {
    static int[][] multiply_matrices(int[][] matrix1, int[][] matrix2) {
        int m1 = matrix1.length;
        int n1 = matrix1[0].length;
        int m2 = matrix2.length;
        int n2 = matrix2[0].length;

        if (n1 == m2) {
            int[][] result = new int[m1][n2];
            for(int i = 0; i < m1; i++) {
                for(int j = 0; j < n2; j++) {
                    for(int k = 0; k < n1; k++) {
                        result[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
            return result;
        } else {
            return null;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns of each matrix:");
        int m1 = sc.nextInt();
        int n1 = sc.nextInt();
        int m2 = sc.nextInt();
        int n2 = sc.nextInt();

        int[][] matrix1 = new int[m1][n1];
        int[][] matrix2 = new int[m2][n2];

        System.out.println("Enter matrix1 elements:");
        for(int i = 0; i < m1; i++) {
            for(int j = 0; j < n1; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter matrix2 elements:");
        for(int i = 0; i < m2; i++) {
            for(int j = 0; j < n2; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }
        sc.close();
        for (int[] a : matrix1) {
            System.out.println(Arrays.toString(a));
        }
        for (int[] b : matrix2) {
            System.out.println(Arrays.toString(b));
        }
        int[][] result = multiply_matrices(matrix1, matrix2);
        if(result != null) {
            for(int[] row : result) {
                System.out.println(Arrays.toString(row));
            }
        } else {
            System.out.println("Matrices cannot be multiplied");
        }
    }
}
