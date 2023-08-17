public class Lesson_1_3 {
    public static void main(String[] args) {
        Person_1_3 person1 = new Person_1_3();
        person1.name = "Олег";
        person1.age = 45;
        int year1 = person1.howLongBeforeRetirement();
        System.out.println(person1.name + ", " + person1.age + " лет – до пенсии осталось " + year1 + " лет.");
        Person_1_3 person2 = new Person_1_3();
        person2.name = "Егор";
        person2.age = 30;
        int year2 = person2.howLongBeforeRetirement();
        System.out.println(person2.name + ", " + person2.age + " лет – до пенсии осталось " + year2 + " лет.");
    }
}

// У класса могут быть:
// 1. Поля (данные);
// 2. Действия (методы).

// Рассмотрим данные классов.
class Person_1_3 {
    String name;
    int age;

    // Метод void, ни чего не возвращает, поэтому заменим его на другой (например на int).
    int howLongBeforeRetirement() {
        int years = 65 - age;
        return years;
    }
}