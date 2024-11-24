# Практика #41


## Практика #1

Приведите пример кода для чтение данных из текстового файла с помощью Scanner.

```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("example.txt"); 
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine(); 
                System.out.println(line); 
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        }
    }
}

```