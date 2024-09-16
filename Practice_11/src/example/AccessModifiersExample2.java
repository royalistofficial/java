package example;
/**
 * Класс, демонстрирующий использование различных модификаторов доступа.
 */
public class AccessModifiersExample2 {

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
