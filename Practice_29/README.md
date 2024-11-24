# Практика #29


## Практика #1

Объясните для каких целей используются основные классы исключений.

В Java классы исключений используются для обработки ошибок:

 **Throwable**: Корневой класс для всех исключений и ошибок.
   - **Error**: Серьезные проблемы, которые не должны обрабатываться (например, OutOfMemoryError).
   - **Exception**: Исключительные ситуации, которые могут быть обработаны.
     - **Checked Exceptions**: Должны обрабатываться (например, IOException).
     - **RuntimeException**: Необязательная обработка, указывают на ошибки программирования (например, NullPointerException).

## Практика #2

Приведите примеры кода, в которых генерируются и обрабатываются следующие исключения.

* ArithmeticException
* ArrayIndexOutOfBoundsException
* IllegalArgumentException
* ClassCastException
* NullPointerException
