
public class Main {
    public static void main(String[] args) {
        // Пример 1: ArithmeticException
        try {
            int result = 10 / 0; 
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }

        // Пример 2: ArrayIndexOutOfBoundsException
        try {
            int[] array = new int[5];
            int value = array[10];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        // Пример 3: IllegalArgumentException
        try {
            throw new IllegalArgumentException("..."); 
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        }

        // Пример 4: ClassCastException
        try {
            Object obj = new Integer(100);
            String str = (String) obj;
        } catch (ClassCastException e) {
            System.out.println("ClassCastException: " + e.getMessage());
        }

        // Пример 5: NullPointerException
        try {
            String str = null;
            int length = str.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }
    }
}
