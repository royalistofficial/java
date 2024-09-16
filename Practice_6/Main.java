/**
    * @author Бугайцев Михаил
    * @version 1.0
    * @since 1.0
*/
public class Main {

    /**
     * Метод main, который запускает все практики.
     * 
     * @param нет передаваемых параметров
     * @return нет возвращаемого значения
     */
    public static void main(String[] args) {
        practice1();
        practice2();
        practice3();
        practice4();
    }

    /**
     * Практика #1: Примеры использования метода decode().
     * 
     * @param нет передаваемых параметров
     * @return нет возвращаемого значения
     */
    private static void practice1() {
        System.out.println("Практика #1");

        // Пример 1: Кодирование и декодирование Base64
        String originalString = "Hello World!";
        String base64Encoded = java.util.Base64.getEncoder().encodeToString(originalString.getBytes());
        System.out.println(base64Encoded);

        byte[] decodedBytes = java.util.Base64.getDecoder().decode(base64Encoded);
        String decodedString = new String(decodedBytes);
        System.out.println(decodedString);

        // Пример 2: Кодирование и декодирование URL
        String urlOriginal = "Hello World!";
        String urlEncoded = java.net.URLEncoder.encode(urlOriginal, java.nio.charset.StandardCharsets.UTF_8);
        System.out.println(urlEncoded);

        try {
            String decodedUrlString = java.net.URLDecoder.decode(urlEncoded, "UTF-8");
            System.out.println(decodedUrlString);
        } catch (java.io.UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }


    /**
     * Практика #2: Приведите все способы создания экземпляра класса Boolean.
     * 
     * @param нет передаваемых параметров
     * @return нет возвращаемого значения
     */
    private static void practice2() {
        System.out.println("\nПрактика #2");

        // Способы создания экземпляров класса Boolean
        Boolean bool1 = new Boolean(true);
        Boolean bool2 = Boolean.valueOf(false);
        Boolean bool3 = Boolean.valueOf("true");
        Boolean bool4 = Boolean.valueOf("false");
        boolean primitiveBool = true;
        Boolean bool5 = primitiveBool; // Автоматическая упаковка

        System.out.println("bool1: " + bool1);
        System.out.println("bool2: " + bool2);
        System.out.println("bool3: " + bool3);
        System.out.println("bool4: " + bool4);
        System.out.println("bool5: " + bool5);
    }

    /**
     * Практика #3: В каком случае при автоупаковке/автораспаковке будет брошено исключение NullPointerException. Приведите пример. 
     * 
     * @param нет передаваемых параметров
     * @return нет возвращаемого значения
     */
    private static void practice3() {
        System.out.println("\nПрактика #3");

        // Пример, который вызывает NullPointerException
        Integer nullInteger = null;
        try {
            int value = nullInteger; // Это приведет к NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Исключение: " + e);
        }
    }

    /**
     * Практика #4: Какие значения напечатает следующий код?
     * 
     * @param нет передаваемых параметров
     * @return нет возвращаемого значения
     */
    private static void practice4() {
        System.out.println("\nПрактика #4");

        int i1 = 128;
        Integer a1 = i1;
        Integer b1 = i1;
        System.out.println("a1==i1 " + (a1 == i1));
        System.out.println("b1==i1 " + (b1 == i1));
        System.out.println("a1==b1 " + (a1 == b1));
        System.out.println("a1.equals(i1) -> " + a1.equals(i1));
        System.out.println("b1.equals(i1) -> " + b1.equals(i1));
        System.out.println("a1.equals(b1) -> " + a1.equals(b1));

        int i2 = 127;
        Integer a2 = i2;
        Integer b2 = i2;
        System.out.println("a2==i2 " + (a2 == i2));
        System.out.println("b2==i2 " + (b2 == i2));
        System.out.println("a2==b2 " + (a2 == b2));
        System.out.println("a2.equals(i2) -> " + a2.equals(i2));
        System.out.println("b2.equals(i2) -> " + b2.equals(i2));
        System.out.println("a2.equals(b2) -> " + a2.equals(b2));
    }
}
