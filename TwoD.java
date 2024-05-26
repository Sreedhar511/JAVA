import java.util.*;

class TwoD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m, n;
        System.out.println("Enter the Matrix sizes:");
        m = in.nextInt();
        n = in.nextInt();
        int[][] arr = new int[m][n];
        System.out.println("Enter the Matrix elements:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println("Matrix is");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.err.print("\n");
        }
    }
}
