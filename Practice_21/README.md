# Практика #21


## Практика #1

Приведите примеры использования различных спецификаторов доступа для внутренних классов и объясните их поведение.

```java
public class Main {
    // Приватный внутренний класс
    private class PrivateInner {
    }

    // Защищенный внутренний класс
    protected class ProtectedInner {
    }

    // Публичный внутренний класс
    public class PublicInner {
    }

    // Пакетный (по умолчанию) внутренний класс
    class PackagePrivateInner {
    }

    public void main() {
        PrivateInner privateInner = new PrivateInner();

        ProtectedInner protectedInner = new ProtectedInner();

        PublicInner publicInner = new PublicInner();

        PackagePrivateInner packagePrivateInner = new PackagePrivateInner();
    }
}

```

- `PrivateInner`: доступен только внутри `Main`.
- `ProtectedInner`: доступен внутри `Main`, а также в подклассах и классах в том же пакете.
- `PublicInner`: доступен из любого места, где доступен `Main`.
- `PackagePrivateInner`: доступен только в пределах одного пакета.

## Практика #2: 

Имеет ли внутренний класс доступ к полям и методам внешнего класса? Как возможность доступа зависит от спецификаторов доступа? Приведите примеры кода.

```java
public class Main {
    private String outerField = "Outer Field";

    public class InnerClass {
        void accessOuter() {
            System.out.println(outerField);
        }
    }

    public void testInnerAccess() {
        InnerClass inner = new InnerClass();
        inner.accessOuter();
    }
}
```

Внутренний класс `InnerClass` имеет доступ ко всем полям и методам внешнего класса `Main`, независимо от их спецификаторов доступа. В данном примере `InnerClass` может получить доступ к `outerField`, который является приватным.

## Практика #3: 

Имеет ли внешний класс доступ к полям и методам внутреннего класса? Как возможность доступа зависит от спецификаторов доступа? Приведите примеры кода.

```java
public class Main {
    public class InnerClass {
        private String innerField = "Inner Field";

        public void innerMethod() {
            System.out.println("Inner Method");
        }
    }

    public void accessInner() {
        InnerClass inner = new InnerClass();
        System.out.println(inner.innerField); // Ошибка: innerField имеет private доступ
        inner.innerMethod(); // Доступен, так как метод public
    }
}
```

Внешний класс `Main` может получить доступ к публичным методам внутреннего класса `InnerClass`, но не может получить доступ к его приватным полям. В данном примере `innerField` недоступен, так как он имеет спецификатор доступа `private`, в то время как `innerMethod` доступен, так как он публичный.
