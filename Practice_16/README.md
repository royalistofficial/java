# Практика #16

# Практика #1

Объясните, почему в цикле for (1) будут другие результаты, чем в следующих затем вызовах (2), хотя аргументы одинаковые?

```java
public class A {
    public void printNum(Integer i)
    {
        System.out.printf("Integer = %d%n", i);
    }
    public void printNum(int i)
    {
        System.out.printf("int = %d%n", i);
    }
    public void printNum(Float f)
    {
        System.out.printf("Float = %.4f%n", f);
    }
    public void printNum(Number n)
    {
        System.out.println("Number=" + n);
    }
}


public class Main {
    public static void main(String[] args) {
        A a = new A();
        Number[ ] num = {new Integer(1), 11, 1.11f, 11.11 };
        // цикл for (1)
        for (Number n : num) {
            a.printNum(n);
        }
        // (2)
        a.printNum(new Integer(1));
        a.printNum(11);
        a.printNum(1.11f);
        a.printNum(11.11);
    }
}
```

## Объяснение:
Разница в результатах между циклом `for` и вызовами (2) связана с тем, как Java выбирает перегруженные методы:

1. Цикл `for`: Метод выбирается на основе фактического типа переменной `n`:
   - `new Integer(1)` → `printNum(Integer i)`
   - `11` → `printNum(Number n)`
   - `1.11f` → `printNum(Float f)`
   - `11.11` → `printNum(Number n)`

2. Вызовы (2): Метод выбирается на основе статического типа аргументов:
   - `new Integer(1)` → `printNum(Integer i)`
   - `11` → `printNum(int i)`
   - `1.11f` → `printNum(Float f)`
   - `11.11` → `printNum(Number n)`

Таким образом, в цикле `for` используются фактические типы объектов, а в вызовах (2) — статические типы аргументов, что приводит к различным результатам.

Вывод программы:
```bash
$ java Main    

Number=1
Number=11
Number=1.11
Number=11.11
Integer = 1
int = 11
Float = 1.1100
Number=11.11
```