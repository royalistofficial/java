# Практика #39


##  Практика #1

Что произойдет при выполнении данного кода? Поясните.
```java
public class App {
  final static int START_COUNTER;
  static {
    START_COUNTER = Integer.parseInt("Y-");
  }
  public static void main(String[] args) {
    System.out.println("Hello");
  }
}
```

При выполнении данного кода произойдет исключение NumberFormatException, так как строка "Y-" не может быть преобразована в целое число. Программа завершится с ошибкой, и строка "Hello" не будет выведена.