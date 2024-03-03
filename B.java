class A {
    int a;
    int b;

    A() {
        a = 20;
        b = 50;
    }

    A(int x, int y) {
        a = x;
        b = y;
    }

    int mul() {
        return a * b;
    }
}

class B {
    public static void main(String args[]) {
        A in = new A();
        System.out.println("Multiplication is:" + in.mul());
        A sc = new A(50, 50);

        System.out.println("Multiplication is:" + sc.mul());
    }
}