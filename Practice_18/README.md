# Практика #18


## Практика #1

Приведите примеры класса, в котором перегружен метод с переменным числом параметров.

```java
public class Calculator {

    // Метод для сложения двух чисел
    public int add(int a, int b) {
        return a + b;
    }

    // Перегруженный метод для сложения переменного числа целых чисел
    public int add(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    // Перегруженный метод для сложения переменного числа чисел типа double
    public double add(double... numbers) {
        double sum = 0.0;
        for (double number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(5, 10));
        System.out.println(calculator.add(1, 2, 3, 4, 5));
        System.out.println(calculator.add(1.1, 2.2, 3.3, 4.4));
    }
}

```