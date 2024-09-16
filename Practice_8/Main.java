/**
    * @author Бугайцев Михаил
    * @version 1.0
    * @since 1.0
*/
public class Main {

    /**
     * Метод main, который запускает практики.
     * 
     * @param нет передаваемых параметров
     * @return нет возвращаемого значения
     */
    public static void main(String[] args) {
        practice1();
        practice2();
    }

    /**
     * Практика #1: Примеры использования различных типов переменных в операторе switch.
     * 
     * @param нет передаваемых параметров
     * @return нет возвращаемого значения
     */
    private static void practice1() {
        int number = 2;
        switch (number) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Not found");
        }

        String day = "Monday";
        switch (day) {
            case "Monday":
                System.out.println("Start of the week");
                break;
            case "Friday":
                System.out.println("End of the week");
                break;
            default:
                System.out.println("Midweek");
        }

        Color color = Color.GREEN;
        switch (color) {
            case RED:
                System.out.println("Red color");
                break;
            case GREEN:
                System.out.println("Green color");
                break;
            case BLUE:
                System.out.println("Blue color");
                break;
        }
    }

    /**
     * Практика #2: Поведение оператора switch без break.
     * 
     * @param нет передаваемых параметров
     * @return нет возвращаемого значения
     */
    private static void practice2() {

        int i = 0;
        int number = 2;

        switch (number) {
            case 1:
                i = 1;
                break;
            case 2:
                i = 2; //выполнение продолжится в case 3
            case 3:
                i = 3;
                break;
            default:
                i = 0;
        }

        System.out.println("i: " + i); 
    }

    enum Color {
        RED, GREEN, BLUE
    }
}