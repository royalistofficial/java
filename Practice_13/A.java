public class A {
    public static int a = 1;
    public static int b;

    public static void printVars() {
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    public static void anotherStaticMethod() {
        printVars();
    }

    public void anotherMethod() {
        printVars();
    }

    // Статический блок инициализации, который вызывает printVars()
    static {
        printVars();
    }

    public static void main(String[] args) {
        // Вызов статического метода через имя класса
        A.printVars();

        // Вызов статического метода через экземпляр класса
        A obj = new A();
        obj.printVars();

        // Вызов другого статического метода
        A.anotherStaticMethod();

        // Вызов нестатического метода
        obj.anotherMethod();
    }
}
