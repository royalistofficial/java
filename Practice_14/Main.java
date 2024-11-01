// Класс с инициализацией при объявлении
class A1 {
    public final int a = 10;
}

// Класс с инициализацией в конструкторе
class A2 {
    public final int a;

    public A2(int value) {
        this.a = value;
    }

}

// Класс с инициализацией в блоке инициализации
class A3 {
    public final int a;

    {
        a = 10; 
    }

}

public class Main {
    public static void main(String[] args) {
        A1 obj1 = new A1();
        A2 obj2 = new A2(10); 
        A3 obj3 = new A3();
    }
}
