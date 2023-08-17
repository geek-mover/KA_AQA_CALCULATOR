public class Lesson_14 {
    public static void main(String[] args) {
        Person_14 person1 = new Person_14();
        person1.name = "Олег";
        person1.age = 45;
        System.out.println("Привет! Меня зовут " + person1.name + ", " + "мне " + person1.age + " лет.");
        Person_14 person2 = new Person_14();
        person2.name = "Егор";
        person2.age = 30;
        System.out.println("Привет! Меня зовут " + person2.name + ", " + "мне " + person2.age + " лет.");
    }
}

// У класса могут быть:
// 1. Поля (данные);
// 2. Действия (методы).

// Рассмотрим данные классов.
class Person_14 {
    String name;
    int age;
}