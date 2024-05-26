import java.util.*;

public class FibDemo1 {
    static int fibonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter how many fibonacci numbers:");
        int n = in.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.print("  " + fibonacci(i));
        }
    }

}
