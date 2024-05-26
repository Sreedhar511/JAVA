import java.util.*;

class Mul {
    public static void main(String args[]) {
        int i, j, n1, n2, k, m1, m2;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first matrix size:");
        n1 = in.nextInt();
        n2 = in.nextInt();
        System.out.println("Enetr the second matrix size:");
        m1 = in.nextInt();
        m2 = in.nextInt();
        int a[][] = new int[n1][n2];
        int b[][] = new int[m1][m2];
        int c[][] = new int[3][3];
        System.out.println("Enter first matrix elements:");
        for (i = 0; i < n1; i++) {
            for (j = 0; j < n2; j++) {
                a[i][j] = in.nextInt();
            }
        }
        System.out.println("Enter second matrix elements:");
        for (i = 0; i < m1; i++) {
            for (j = 0; j < m2; j++) {
                b[i][j] = in.nextInt();
            }
        }
        System.out.println("Enter first matrix is:");
        for (i = 0; i < n1; i++) {
            for (j = 0; j < n2; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println("\n");
        }
        System.out.println("Enter second matrix is:");
        for (i = 0; i < m1; i++) {
            for (j = 0; j < m2; j++) {
                System.out.print(b[i][j] + "\t");
            }
            System.out.println("\n");
        }
        System.out.println("The Multiplication matrix is:");

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                c[i][j] = 0;
                for (k = 0; k < 3; k++) {
                    c[i][j] = c[i][j] + a[i][k] * b[k][j];
                }

            }
        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(c[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
