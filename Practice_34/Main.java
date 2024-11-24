class A {
    public static void method() {
        System.out.println("static method A");
    }
}

class B extends A {
    public static void method() {
        System.out.println("static method B");
    }
}

public class Main {
    public static void main(String[] args) {
        A obj = new B();
        obj.method(); // Вывод: "Static method in A"
    }
}
