import java.util.Scanner;
public class Main {
    public static String calc(String input) {
        return input;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input: ");
        String input = scan.nextLine();
        scan.close();
        String[] elements = input.split(" ");
        if (elements.length != 3 & elements.length < 3) {
            System.out.println("Output: строка не является математической операцией.");
            return;
        }
        if (elements.length != 3 & elements.length > 3) {
            System.out.println("Output: формат математической операции, не удовлетворяет заданию – два операнда и один оператор.");
            return;
        }
        int a;
        int b;
        try {
            a = Integer.parseInt(elements[0]);
            b = Integer.parseInt(elements[2]);
        } catch (NumberFormatException e) {
            System.out.println("Output: введено не корректное число.");
            return;
        }
        if (a > 10 || b > 10) {
            System.out.println("Output: формат математической операции, не удовлетворяет заданию – только числа от 1 до 10 включительно.");
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
                    System.out.println("Output: на ноль делить нельзя.");
                    return;
                }
                result = a / b;
                break;
            default:
                System.out.println("Output: введён не корректный оператор.");
                return;
        }
        System.out.println("Output: " + result);
    }
}
