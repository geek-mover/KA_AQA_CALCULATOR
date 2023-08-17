public class Lesson_7_1 {
    public static void main(String[] args) {
        Lesson_7_1_Enum_Animal animal = Lesson_7_1_Enum_Animal.CAT;
        switch (animal) {
            case CAT:
                System.out.println("It's a cat.");
                break;
            case DOG:
                System.out.println("It's a dog.");
                break;
            case FOX:
                System.out.println("It's a fox.");
                break;
            default:
                System.out.println("Совпадений не найдено...");
        }
    }
}