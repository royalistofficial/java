package src;
/**
 * Класс для выполнения арифметических операций.
 * 
 * @author Иван Иванов
 * @version 2.0
 * @since 1.0
 */
public class Calculator {
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
     *
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
