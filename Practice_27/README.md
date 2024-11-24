# Практика #27

## Практика #1

Напишите программу, в которой будет продемонстрирована функциональность десяти любых методов классов StringBuffer и StringBuilder. В комментариях к программе напишите пояснение к используемым методам.

```java
public class Main {
    public static void main(String[] args) {
        // Пример использования StringBuffer
        StringBuffer stringBuffer = new StringBuffer("Hello");
        
        // 1. append() - добавляет строку в конец
        stringBuffer.append(", World!");
        System.out.println( stringBuffer);
        
        // 2. insert() - вставляет строку по указанному индексу
        stringBuffer.insert(5, " Beautiful");
        System.out.println(stringBuffer);
        
        // 3. delete() - удаляет часть строки
        stringBuffer.delete(5, 15);
        System.out.println(stringBuffer);
        
        // 4. reverse() - разворачивает строку
        stringBuffer.reverse();
        System.out.println(stringBuffer);
        
        // 5. capacity() - возвращает емкость буфера
        System.out.println(stringBuffer.capacity());
        
        // Пример использования StringBuilder
        StringBuilder stringBuilder = new StringBuilder("Hello");
        
        // 6. append() - добавляет строку в конец
        stringBuilder.append(", World!");
        System.out.println(stringBuilder);
        
        // 7. insert() - вставляет строку по указанному индексу
        stringBuilder.insert(5, " Beautiful");
        System.out.println( stringBuilder);
        
        // 8. delete() - удаляет часть строки
        stringBuilder.delete(5, 15);
        System.out.println(stringBuilder);
        
        // 9. reverse() - разворачивает строку
        stringBuilder.reverse();
        System.out.println(stringBuilder);
        
        // 10. length() - возвращает длину строки
        System.out.println(stringBuilder.length());
    }
}
```

## Практика #2

Покажите с помощью каких методов объекты классов String, StringBuffer и StringBuilder могут быть преобразованы друг в друга.




```java
public class Main {
    public static void main(String[] args) {
        // Преобразование String в StringBuffer
        String str = "Hello, World!";
        StringBuffer stringBuffer = new StringBuffer(str);
        System.out.println(stringBuffer);

        // Преобразование String в StringBuilder
        StringBuilder stringBuilder = new StringBuilder(str);
        System.out.println(stringBuffer);

        // Преобразование StringBuffer в String
        String strFromBuffer = stringBuffer.toString();
        System.out.println(stringBuffer);

        // Преобразование StringBuilder в String
        String strFromBuilder = stringBuilder.toString();
        System.out.println(stringBuffer);

        // Преобразование StringBuffer в StringBuilder
        StringBuilder builderFromBuffer = new StringBuilder(stringBuffer.toString());
        System.out.println(stringBuffer);

        // Преобразование StringBuilder в StringBuffer
        StringBuffer bufferFromBuilder = new StringBuffer(stringBuilder.toString());
        System.out.println(stringBuffer);
    }
}
```
