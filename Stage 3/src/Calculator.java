import java.util.Scanner;
public class Calculator {
        public static void main(String[] args) {
        System.out.println("");
        System.out.println("|<>[+]<>[-]<>(◕‿◕)<>[*]<>[/]<>|");
        System.out.println("Консольный калькулятор на Java.");
        System.out.println("");
        Scanner scan = new Scanner(System.in);
        System.out.print("(◕‿◕) Введите выражение: ");
        String input = scan.nextLine();
        scan.close();
        String[] elements = input.split(" ");
        if (elements.length != 3) {
            System.out.println("(х_х) ОШИБКА! Формат математической операции, не удовлетворяет заданию.");
            System.out.println("(◕‿◕) Повторите ввод...");
            return;
        }
        int a;
        int b;
        try {
            a = Integer.parseInt(elements[0]);
            b = Integer.parseInt(elements[2]);
        } catch (NumberFormatException e) {
            System.out.println("(х_х) ОШИБКА! Введено не корректное число.");
            System.out.println("(◕‿◕) Повторите ввод...");
            return;
        }
        if (a > 10 || b > 10) {
            System.out.println("(х_х) ОШИБКА! Введённое число – болmше 10.");
            System.out.println("(◕‿◕) Повторите ввод...");
            return;
        }
        int result;
        switch (elements[1]) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if (b == 0) {
                    System.out.println("(х_х) ОШИБКА! На ноль делить нельзя.");
                    System.out.println("(◕‿◕) Повторите ввод...");
                    return;
                }
                result = a / b;
                break;
            default:
                System.out.println("(х_х) ОШИБКА! Введён не корректный оператор.");
                System.out.println("(◕‿◕) Повторите ввод...");
                return;
        }
        System.out.println("(◕‿◕) Результат: " + result);
    }
}
