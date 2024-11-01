# Практика #25


## Практика #1

Приведите пример интерфейса, в котором определен один неабстрактный метод и один статический метод, а также класс, реализующий этот интерфейс. Покажите все способы вызова методов интерфейса.

```java
// Определение интерфейса
interface MyInterface {
    // Неабстрактный метод
    default void display() {
        System.out.println("Это неабстрактный метод интерфейса.");
    }

    // Статический метод
    static void staticMethod() {
        System.out.println("Это статический метод интерфейса.");
    }
}

// Класс, реализующий интерфейс
class MyClass implements MyInterface {
    // Переопределение неабстрактного метода
    @Override
    public void display() {
        System.out.println("Это переопределенный метод в классе MyClass.");
    }
}

// Основной класс для тестирования
public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        
        // Вызов неабстрактного метода
        myClass.display(); // Вывод: Это переопределенный метод в классе MyClass.

        // Вызов статического метода
        MyInterface.staticMethod(); // Вывод: Это статический метод интерфейса.
    }
}
```

## Практика #2

Что произойдет, если класс реализует два интерфейса с одинаковыми неабстрактными методами? Как выйти из такого положения? Приведите пример.

```java
// Первый интерфейс
interface InterfaceA {
    default void show() {
        System.out.println("Метод show из InterfaceA");
    }
}

// Второй интерфейс
interface InterfaceB {
    default void show() {
        System.out.println("Метод show из InterfaceB");
    }
}

// Класс, реализующий оба интерфейса
class MyClass implements InterfaceA, InterfaceB {
    // Переопределение метода show для разрешения конфликта
    @Override
    public void show() {
        InterfaceA.super.show(); // Вывод: Метод show из InterfaceA
        // Или
        // InterfaceB.super.show(); // Вывод: Метод show из InterfaceB
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.show(); 
    }
}
```

