# Практика #18


## Практика #1

Приведите примеры класса, в котором используется инициализация элементов перечисления.
```java
public class Week {
    private Day[] days;

    public Week() {
        days = new Day[] {
            Day.MONDAY,
            Day.TUESDAY,
            Day.WEDNESDAY,
            Day.THURSDAY,
            Day.FRIDAY,
            Day.SATURDAY,
            Day.SUNDAY
        };
    }

    public void printDays() {
        for (Day day : days) {
            System.out.println(day);
        }
    }

    public static void main(String[] args) {
        Week week = new Week();
        week.printDays();
    }
}
```

### Практика #2

Приведите примеры реализации собственного перечисления c любым дополнительным методом.

```java
public enum Day {
    MONDAY(false),
    TUESDAY(false),
    WEDNESDAY(false),
    THURSDAY(false),
    FRIDAY(false),
    SATURDAY(true),
    SUNDAY(true);

    private final boolean isWeekend;

    Day(boolean isWeekend) {
        this.isWeekend = isWeekend;
    }

    public boolean isWeekend() {
        return isWeekend;
    }
}

public class Main {
    public static void main(String[] args) {
        Day day = Day.MONDAY;

        switch (day) {
            case MONDAY:
                System.out.println("Начало недели!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Выходной!");
                break;
            default:
                System.out.println("Обычный день.");
                break;
        }

        if (day.isWeekend()) {
            System.out.println(day + " - это выходной.");
        } else {
            System.out.println(day + " - это рабочий день.");
        }
    }
}

```
