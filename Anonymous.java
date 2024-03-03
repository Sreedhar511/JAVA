public class Anonymous {
    public static void main(String args[]) {
        A sc = new A();
        B in = new B();
        in.diplay();
        in.show();
        sc.show();
    }
}

class A {
    void show() {
        System.out.println("Hello google");
    }
}

class B extends A {
    void diplay() {
        System.out.println("Show the Output");
    }

    void show() {
        System.out.println("Inherited class");
    }
}