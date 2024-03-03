import java.util.*;

class A {
    static int fact(int n) {
        if (n == 0) {
            return 1;
        } else {
            return (n * (fact - 1));
        }
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = in.nextInt();
        int factorial = 1;
        factorial = fact(n);
        System.out.println("Factorial of" + n + "is:" + factorial);

    }
}