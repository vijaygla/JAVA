class Laptop {
    void laptopMethod() {
        System.out.println("99% Battery available.");
    }
}
public class Computer {
    void computerMethod() {
        System.out.println("Power gone! Shut down your PC soon...");
    }
    public static void main(String[] args) {
        Computer c = new Computer();
        Laptop l = new Laptop();
        l.laptopMethod();
        c.computerMethod();
    }
}


// OUTPUT
// 99% Battery available.
// Power gone! Shut down your PC soon...
