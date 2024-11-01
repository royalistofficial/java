# Практика #21


## Практика #1

Приведите примеры "вложение" класса в интерфейс и покажите способ вызова методе такого вложенного класса.

```java
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
        nestedClass.display(); /
    }
}
```
