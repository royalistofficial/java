# Практика #37


##  Практика #1

Приведите пример собственного класса исключения.

```java
public class MyFirstException extends Exception {
    
    public MyFirstException() {
        super("Произошла ошибка MyFirstException");
    }

    public MyFirstException(String message) {
        super(message);
    }

    public MyFirstException(String message, Throwable cause) {
        super(message, cause);
    }
}
```