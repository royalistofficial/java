# Практика #6



## Практика #1

Приведите примеры использования методы decode().


## Практика #2

Приведите все способы создания экземпляра класса Boolean.


## Практика #3

В каком случае при автоупаковке/автораспаковке будет брошено исключение NullPointerException. Приведите пример.

##Практика #4

Какие значения напечатает следующий код?

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

Объясните полученный результат. Для чего используется класс IntegerCache?


Для i1 = 128:

a1 == i1 и b1 == i1 возвращают true (распаковка Integer в int).
a1 == b1 возвращает false (разные объекты, 128 не кэшируется).
a1.equals(i1), b1.equals(i1) и a1.equals(b1) возвращают true (сравнение значений).

Для i2 = 127:

a2 == i2 и b2 == i2 возвращают true.
a2 == b2 возвращает true (один кэшированный объект).
a2.equals(i2), b2.equals(i2) и a2.equals(b2) возвращают true.

Класс IntegerCache кэширует объекты Integer в диапазоне от -128 до 127, что экономит память и улучшает производительность.
