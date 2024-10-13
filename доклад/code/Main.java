import src.Calculator; 
/**
 * Класс для входа в программу.
 * 
 * @author Иван Иванов
 * @version 2.0
 * @since 1.0
 */
public class Main {

    /**
     * Точка входа в программу.
     * 
     * @param args аргументы командной строки
     * <img src="example.jpg" alt="Пример изображения" width="300"/>}
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

}
