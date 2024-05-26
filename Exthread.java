class Exthread extends Thread {
    int x = 15;
    int y = 20;
    int sum;

    public void run() {
        sum = x + y;
        System.out.println("The sum is:" + sum);
    }

    public static void main(String[] args) {
        Exthread in = new Exthread();
        Thread t = new Thread("Hello Java");
        in.start();
        String s = t.getName();
        System.out.println(s);
        t.setName("Welcome to java");
        t.getName();
        System.out.println(t);
        System.out.println(t.activeCount());
        System.out.println(t.threadId());
    }
}
