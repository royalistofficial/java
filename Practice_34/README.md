# Практика #34


##  Практика #1

Почему динамический полиморфизм не может быть применен к статическим методам?

Статические методы связываются с классом, а не с экземпляром класса, при вызове статического метода компилятор определяет, какой метод вызывать, на этапе компиляции, а не во время выполнения. Таким образом, статические методы не могут использовать динамическое связывание.

```java
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
        obj.method(); // Вывод: static method A
    }
}
```