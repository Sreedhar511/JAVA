public class Sree1 {
    public static void main(String args[]) {
        B in = new B();
        in.sum(30, 40);
        A sc = new A();
        sc.sum();
    }

}

class A {
    int a = 10;
    int b = 40;

    void sum() {
        System.out.println("The sum is:" + (a + b));
    }
}

class B extends A {
    void sum(int x, int y) {
        System.out.println("The multiplication is:" + (x * y));
    }
}