import java.util.Scanner;

class Fibonacci {
    static int n1 = 0, n2 = 1, n3;

    static void fibonacci(int count) {
        if (count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.println("" + n3);
            fibonacci(count - 1);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter count value:");
        int count = in.nextInt();
        System.out.println(n1 + "\n" + n2);
        fibonacci(count - 2);

    }
}