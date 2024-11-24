# Практика #26

## Практика #1: 

Методы класса String

```java
public class Main {
    public static void main(String[] args) {
        String str = "Hello, World!";
        
        // 1. length() - длина строки
        System.out.println(str.length());
        
        // 2. charAt() - символ по индексу
        System.out.println(str.charAt(1));
        
        // 3. substring() - подстрока с указанного индекса
        System.out.println(str.substring(1));
        
        // 4. toLowerCase() - строка в нижнем регистре
        System.out.println(str.toLowerCase());
        
        // 5. toUpperCase() - строка в верхнем регистре
        System.out.println(str.toUpperCase());
        
        // 6. contains() - проверка на наличие подстроки
        System.out.println(str.contains("World"));
        
        // 7. replace() - замена символов
        System.out.println(str.replace('o', '0'));
        
        // 8. split() - разбивка строки на массив
        String[] words = str.split(", ");
        System.out.println("Разделенные слова: ");
        for (String word : words) {
            System.out.println(word);
        }
        
        // 9. trim() - удаление пробелов
        String strWithSpaces = "   Hello, World!   ";
        System.out.println(strWithSpaces.trim() + "'");
        
        // 10. indexOf() - индекс первого вхождения подстроки
        System.out.println(str.indexOf("World"));
    }
}

```

## Практика #2: 

Примеры использования класса StringJoiner

```java
import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(", ");
        joiner.add("One").add("Two").add("Three");
        System.out.println(joiner);
    }
}
```

## Практика #3: 

Зачем нужны три двойные кавычки?

Три двойные кавычки позволяют создавать многострочные строки:

```java
String multiLineString = """
    Это многострочная строка.
    Она занимает несколько строк.
    """;
```