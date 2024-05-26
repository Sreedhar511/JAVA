public class FunInter {
    public static void main(String[] args) {
        In a = new In();
        a.read();
        In b = new In() {
            public void read() {
                System.out.println("Object Method");
            }
        };
        b.read();
        InnerFunInter c = () -> {
            System.out.println("Anonymous Method");
        };
        c.read();
    }
}

@FunctionalInterface
/**
 * InnerFunInter
 */
public interface InnerFunInter {
    void read();
}

class In implements InnerFunInter {
    @Override
    public void read() {
        System.out.println("Read method1");
    }
}
