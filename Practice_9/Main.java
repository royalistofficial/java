/**
    * @author Бугайцев Михаил
    * @version 1.0
    * @since 1.0
*/
public class Main {

    /**
     * Метод main, который запускает практики.
     * 
     * @param args нет передаваемых параметров
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
        int i = 0;
        while (true) {
            System.out.println(i);
            i++;
        }

        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while (true);
    }

    /**
     * Практика #2: Пример использования операторов break и continue с любым видом цикла.
     * 
     * @param нет передаваемых параметров
     * @return нет возвращаемого значения
     */
    private static void practice2() {
        for (int k = 0; k < 10; k++) {
            if (k == 5) {
                System.out.println("break");
                break;
            }
            System.out.println(k);
        }

        for (int l = 0; l < 10; l++) {
            if (l % 2 == 0) {
                continue;
            }
            System.out.println(l);
        }
    }
}
