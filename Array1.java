import java.util.*;

public class Array1 {
    public static void main(String[] args) {
        int[][] a = { { 2, 3, 4 }, { 5, 6, 7, } };
        // Scanner in = new Scanner(System.in);
        // System.out.println("Enter the array elements");
        // for (int i = 0; i < 2; i++) {
        // for (int j = 0; j < 3; j++) {
        // a[i][j] = in.nextInt();
        // }
        // }
        System.out.println("Array is:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("\t" + a[i][j]);
            }
            System.out.print("\n");

        }
    }
}
