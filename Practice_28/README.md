# Практика #28


## Практика #1

Приведите пример использования пяти любых спецификаторов из таблицы.

## Практика #2

Зачем нужен метод flush()?

Метод flush() в Java принудительно записывает данные из буфера в целевой поток.

```java
try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
    writer.write("Hello, World!");
    writer.flush(); // Принудительная запись данных в файл
} catch (IOException e) {
    e.printStackTrace();
}
```

## Практика #3

Приведите пример использования пяти любых спецификаторов из таблицы.
