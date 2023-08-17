public class Lesson_4_5 {
    public static void main(String[] args) {

        Person_4_5 person1 = new Person_4_5();
        person1.setNameAge("Олег",45);
        person1.greeting();
        String p2 = "Егор";
        Person_4_5 person2 = new Person_4_5();
        person2.setNameAge(p2,30);
        person2.greeting();
    }
}
class Person_4_5{
    String name;
    int age;

    void setNameAge(String userName, int userAge){
        name = userName;
        age = userAge;
    }
    void greeting (){
        System.out.println("Привет! Меня зовут " + name + ", " + "мне " + age + " лет.");
    }
}