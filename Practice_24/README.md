# Практика #24


## Практика #1

Объясните, зачем нужны следующие аннотации и приведите примеры их использования.

    @Override
    @Deprecated
    @SuppressWarnings


### @Override
Указывает, что метод переопределяет метод суперкласса.
```java
class A {
    void display() {}
}

class B extends A {
    @Override
    void display() {
    }
}
```

### @Deprecated
Указывает, что элемент устарел и не рекомендуется к использованию.
```java
class Example {
    @Deprecated
    void oldMethod() {}
}
```

### @SuppressWarnings
Подавляет предупреждения компилятора.
```java
class Example {
    @SuppressWarnings("unchecked")
    void exampleMethod() {
        ArrayList list = new ArrayList(); // Подавляет предупреждение о неявном приведении типов
    }
}
```