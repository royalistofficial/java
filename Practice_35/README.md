# Практика #35


##  Практика #1

Самостоятельно придумайте класс и переопределите для него метод equals(). Каким соглашениям должна следовать реализация этого метода?

```java
public class A {
    private String name;
    private int val;

    public A(String name, int val) {
        this.name = name;
        this.val = val;
    }

    @Override
    public boolean equals(Object obj) {
        // Проверяем, ссылается ли объект на себя
        if (this == obj) {
            return true;
        }
        // Проверяем, является ли объект экземпляром класса A
        if (!(obj instanceof A)) {
            return false;
        }

        A other = (A) obj;
        return this.name.equals(other.name) && this.val == other.val;
    }

    @Override
    public int hashCode() {
        // Генерируем хэш-код на основе полей name и val
        result = name.hashCode() + val;
        return result;
    }

    @Override
    public String toString() {
        return "A{name='" + name + "', val=" + val + "}";
    }
}
```