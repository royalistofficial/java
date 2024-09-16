import example.AccessModifiersExample2; 
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
    public static void main() {
        AccessModifiersExample example = new AccessModifiersExample();

        System.out.println(example.publicVariable);
        System.out.println(example.protectedVariable);
        System.out.println(example.packagePrivateVariable);
        // System.out.println(example.privateVariable); // нет доступа

        AccessModifiersExample2 example2 = new AccessModifiersExample2();

        System.out.println(example2.publicVariable);
        // System.out.println(example2.protectedVariable);// нет доступа
        // System.out.println(example2.packagePrivateVariable);// нет доступа
        // System.out.println(example2.privateVariable);// нет доступа

    }
} 

/**
 * Класс, демонстрирующий использование различных модификаторов доступа.
 */
class AccessModifiersExample {

    /** 
     * Публичная переменная, доступная из любого места.
     */
    public String publicVariable = "publicVariable";

    /** 
     * Защищенная переменная, доступная в том же пакете или в подклассах.
     */
    protected String protectedVariable = "protectedVariable";

    /** 
     * Приватная переменная, доступная только внутри этого класса.
     */
    private String privateVariable = "privateVariable";

    /** 
     * Переменная с пакетной видимостью, доступная только в том же пакете.
     */
    String packagePrivateVariable = "packagePrivateVariable";

}
