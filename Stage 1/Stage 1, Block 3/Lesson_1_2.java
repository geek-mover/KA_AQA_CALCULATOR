public class Lesson_1_2 {
    public static void main(String[] args) {
        Person_1_2 person1 = new Person_1_2();
        person1.name = "Олег";
        person1.age = 45;
        person1.greeting();
        person1.welcome();
        Person_1_2 person2 = new Person_1_2();
        person2.name = "Егор";
        person2.age = 30;
        person2.greeting();
        person2.welcome();
    }
}

// У класса могут быть:
// 1. Поля (данные);
// 2. Действия (методы).

// Рассмотрим данные классов.
class Person_1_2 {
    String name;
    int age;

// Рассмотрим методы классов.
    void greeting(){
        for(int i = 0; i < 2; i++){ // Благодаря этому циклу, вывод данных удвоится.
        System.out.println("Привет! Меня зовут " + name + ", " + "мне " + age + " лет.");}
    }
    void welcome(){
        System.out.println("Добро пожаловать на курс по AQA!");
    }
}