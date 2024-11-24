class A {
    int a;

    A(int a) {
        this.a = a;
    }

    void display() {
        System.out.println("display A: " + a);
    }
}

class B extends A {
    int b;

    B(int a, int b) {
        super(a); // Вызов конструктора суперкласса A
        this.b = b;
    }

    void show() {
        System.out.println("display B: " + b);
    }

    void displayAll() {
        super.display(); // Доступ к методу суперкласса A
        System.out.println("display B: " +  super.a); // Доступ к полю a
    }
}

public class Main {
    public static void main(String[] args) {
        B obj = new B(1, 2); 
        obj.displayAll();
        obj.show();
    }
}
