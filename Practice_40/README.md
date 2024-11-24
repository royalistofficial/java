# Практика #40


## Практика #1

Приведите пример использования одного из подклассов класса InputStream для демонстрации работы метода read().
```java
import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamExample {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("example.txt")) {
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```
## Практика #2

Приведите пример использования одного из подклассов класса OutputStream для демонстрации работы метода write(int).
```java
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamExample {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            fos.write(1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

```
## Практика #3

Если есть иерархия байтовых потоков ввода-вывода, основанная на абстрактных классах InputStream и OutputStream, то зачем дополнительные иерархии, основанные на абстрактных классах Reader и Writer?

Они работают с символьными потоками, поддерживают кодировки и удобнее для работы с текстом.

## Практика #4

Зачем нужен интерфейс AutoCloseable? Приведите пример.

Позволяет автоматически закрывать ресурсы в try-with-resources, предотвращая утечки.

```java
try (BufferedReader br = new BufferedReader(new FileReader("example.txt"))) {

}
```
BufferedReader автоматически закрывается.