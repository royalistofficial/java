/**
 * Класс для выполнения арифметических операций.
 * 
 * @author Иван Иванов
 * @version 2.0
 * @since 1.0
 */
public class Calculator {

    /**
     * Точка входа в программу.
     * 
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        int result = calculator.add(1, 2);
        System.out.println("calculator.add(1, 2): " + result);
        
        try {
            int deprecatedResult = calculator.sumDeprecated(1, 2);
            System.out.println("calculator.sumDeprecated(1, 2): " + deprecatedResult);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            int deprecatedResult = calculator.sumDeprecated(-1, 2);
            System.out.println("calculator.sumDeprecated(-1, 2): " + deprecatedResult);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }


    /**
     * Хранит количество выполненных операций.
     */
    private int operationCount;

    
    /**
     * Складывает два числа.
     * 
     * @param a первое число
     * @param b второе число
     * @return результат сложения
     */
    public int add(int a, int b) {
        operationCount++;
        return a + b;
    }

    /**
     * @param a первое число
     * @param b второе число
     * @throws IllegalArgumentException если одно из чисел отрицательное
     * @deprecated Использует {@link #add(int, int)}.
     * @return результат сложения
     */
    @Deprecated
    public int sumDeprecated(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Числа должны быть положительными");
        }
        return a + b;
    }

    /**
     * @todo Реализовать метод
     */
    public void someMethod(){}
}
