public class Lesson_3_1 {
    public static void main(String[] args) {

        // Пример 1.
        String s = "Hello, World!"; // Относится к группе Ссылочных типов данных и пишется с заглавной буквы, потому что, по сути, является не просто типом данных, а классом.
        System.out.println(s);

        // Пример 2.
        String hello = "Hello";
        String symbol = ", ";
        String name = "Bob!";
        System.out.println(hello + symbol + name);

        // Пример 3.
        int x = 5;
        System.out.println("Ваш номер в очереди – " + x + ".");
    }
}