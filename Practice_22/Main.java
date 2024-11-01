package Practice_22;

interface MyInterface {
    // Вложенный статический класс
    class NestedClass {
        public void display() {
            System.out.println("Hello, world!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Создание экземпляра вложенного класса
        MyInterface.NestedClass nestedClass = new MyInterface.NestedClass();
        
        // Вызов метода вложенного класса
        nestedClass.display(); // Вывод: Hello, world!
    }
}
