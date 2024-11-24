public class Main {
    public static void main(String[] args) {
        // Практика #1: 
        SubClass sub = new SubClass();
        sub.display(); 

        // Практика #2: 
        FinalClass finalClass = new FinalClass();
    }
}

// Суперкласс с final-методом
class SuperClass {
    // Метод объявлен как final
    public final void display() {
        System.out.println("Это метод суперкласса.");
    }
}

// Подкласс, который не может переопределить final-метод
class SubClass extends SuperClass {
    // Попытка переопределить final-метод приведет к ошибке компиляции
    /*
    @Override
    public void display() {
        System.out.println("Это метод подкласса.");
    }
    */
}

// Класс, объявленный как final
final class FinalClass {
}

// Попытка создать подкласс приведет к ошибке компиляции
/*
class SubClassFinal extends FinalClass {
    // Этот класс не может наследовать FinalClass
}
*/
