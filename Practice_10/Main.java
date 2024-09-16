import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
     * Практика #1: Примеры присвоения массивов
     * 
     * @param нет передаваемых параметров
     * @return нет возвращаемого значения
     */
    private static void practice1() {
        int a1[] = {1, 2, 3, 4, 5};
        int a2[] = {6, 7, 8, 9, 10};
        
        a1 = a2;

        for (int i : a1) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /**
     * Практика #2: Пример использования java.util.Array
     * 
     * @param нет передаваемых параметров
     * @return нет возвращаемого значения
     */
    private static void practice2() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Banana");
        list.add("Apple");
        list.add("Orange");

        System.out.println("list.toString(): " + list.toString());

        Collections.sort(list);
        System.out.println("Collections.sort(list);: " + list);

        ArrayList<String> list2 = new ArrayList<>(list);
        System.out.println("list.equals(list2) " + list.equals(list2));

        int index = Collections.binarySearch(list, "Apple");
        System.out.println("Collections.binarySearch(list, 'Apple'): " + index);

        String[] array1 = {"Apple", "Banana"};
        String[] array2 = {"Apple", "Banana"};
        int comparisonResult = Arrays.compare(array1, array2);
        System.out.println("Arrays.compare(array1, array2): " + comparisonResult);

        String[] array3 = {"Apple", "Cherry"};
        int comparisonResult2 = Arrays.compare(array1, array3);
        System.out.println("Arrays.compare(array1, array3): " + comparisonResult2);
    }
}
