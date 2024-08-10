class A {
    int x = 10;
    static int y = 20;

    void m1() {
        B b = new B();
        System.out.println(b.z);
    }

    static void m2() {
        B b = new B();
        System.out.println(b.z);
        A a = new A();
        System.out.println(a.x);
        System.out.println(y); // Since y is a static variable of class A, you can access it directly.
    }

    static class B { // Nested class B should also be static
        int z = 30;

        void m3() {
            A a = new A();
            a.m1();
        }

        static void m4() {
            A a = new A();
            a.m1();
            A.m2();
        }
    }
}

public class Apple {
    public static void main(String1 args[]) {
        A apple = new A();
        apple.m1();
    }
}


