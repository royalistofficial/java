
public class Main {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; 
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }

        int[] array = new int[5];
        int value = array[10];

    }
}
