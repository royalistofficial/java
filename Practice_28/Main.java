import java.util.Formatter;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Практика #1:
        System.out.println("Практика #1:");
        Formatter formatter = new Formatter();

        // 1. %b - логическое значение
        boolean isJavaFun = true;
        formatter.format("%b%n", isJavaFun);

        // 2. %d - десятичное целое значение
        int number = 100;
        formatter.format(" %d%n", number);

        // 3. %f - десятичное значение с плавающей точкой
        double pi = 3.14159;
        formatter.format("%.2f%n", pi);

        // 4. %s - строковое представление
        String name = "Alice";
        formatter.format("%s!%n", name);

        // 5. %h - хэш-код
        formatter.format("%h%n", name);

        System.out.println(formatter);
        formatter.close();



        // Практика #3:
        System.out.println("Практика #3:");
        Formatter dateFormatter = new Formatter();
        Date date = new Date();

        // 1. %tY - год в четырехзначном формате
        dateFormatter.format("%tY%n", date);

        // 2. %tB - полное название месяца
        dateFormatter.format("%tB%n", date);

        // 3. %tA - полное название дня недели
        dateFormatter.format("%tA%n", date);

        // 4. %tH - час 
        dateFormatter.format("%tH%n", date);

        // 5. %tM - минуты
        dateFormatter.format("%tM%n", date);

        System.out.println(dateFormatter);
        dateFormatter.close();
    }
}
