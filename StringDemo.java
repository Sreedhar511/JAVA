class StringDemo {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("Welcome To Java");
        System.out.println(s);
        System.out.println(s.append("  Is Great Language"));
        System.out.println(s.capacity());
        System.out.println(s.isEmpty());
        System.out.println(s.length());
        System.out.println(s.charAt(3));
    }
}
