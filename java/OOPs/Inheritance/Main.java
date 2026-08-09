public class Main {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.m1();
        p.m2();
        Child c = new Child();
        c.m3();
        c.m4();
        c.m2();
    }
}
