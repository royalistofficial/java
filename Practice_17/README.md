# Практика #17

## Практика #1: Примеры использования `instanceof` с параметризованными классами

1. Пример без ограничений:

```java
class Wrapper<T> {
    public T item;
    public Wrapper(T item) { this.item = item; }
}

public class Example {
    public static void main(String[] args) {
        Wrapper<String> stringWrapper = new Wrapper<>("Hello");
        if (stringWrapper instanceof Wrapper) {
        }
    }
}
```

2. Пример с ограничениями:

```java
class NumberWrapper<T extends Number> {
    public T item;
    public NumberWrapper(T item) { this.item = item; }
}

public class Example {
    public static void main(String[] args) {
        NumberWrapper<Integer> intWrapper = new NumberWrapper<>(10);
        if (intWrapper instanceof NumberWrapper) {
        }
    }
}
```

## Практика #2: Использование `<? extends T>` и `<? super T>`

1. `<? extends T>`: Позволяет использовать подтипы `T`.

```java
public static void printAnimals(List<? extends Animal> animals) {
    for (Animal animal : animals) {
        System.out.println(animal);
    }
}
```

2. `<? super T>`: Позволяет добавлять объекты типа `T` в коллекции.

```java
public static void addDogs(List<? super Dog> animals) {
    animals.add(new Dog());
}
```

### Зачем нужны эти конструкции?

- `<? extends T>`: Гибкость для работы с подтипами.
- `<? super T>`: Безопасное добавление объектов типа `T` в коллекции.