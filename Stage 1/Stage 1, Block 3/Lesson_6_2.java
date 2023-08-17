import java.util.Scanner;

public class Lesson_6_2 {
    public static void main(String[] args) {

        // Тоже самое можно делать и со строчными т.д.

        Scanner scan = new Scanner(System.in);
        System.out.println("Укажите ваш возраст: ");
        String age = scan.nextLine();

        switch (age) {
            case "ноль" :
                System.out.println("Ты родился...");
                break; // После каждого case(а), нужно ставить break, для прерывания цикла и блока switch.
            case "семь" :
                System.out.println("Ты пошёл в школу...");
                break;
            case "восемнадцать" :
                System.out.println("Ты стал совершеннолетним...");
                break;
            default:
                System.out.println("Совпадений не найдено...");
        }
    }
}