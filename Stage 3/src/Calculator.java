import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) throws ArithmeticException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input:\n");
        String input = scan.nextLine();
        String result = calc(input);
        System.out.println(result);
    }
    public static String calc(String input) throws ArithmeticException {
        String[] elements = input.split(" ");
        if (elements.length != 3 & elements.length < 3) {
            System.out.println("Output:\nthrows Exception //т.к. строка не является математической операцией.");
            throw new ArithmeticException("Error! Details in the output!");
        }
        if (elements.length != 3 & elements.length > 3) {
            System.out.println("Output:\nthrows Exception //т.к. формат математической операции, не удовлетворяет заданию – два операнда и один оператор.");
            throw new ArithmeticException("Error! Details in the output!");
        }
        int a;
        int b;
        try {
            a = Integer.parseInt(elements[0]);
            b = Integer.parseInt(elements[2]);
        } catch (NumberFormatException e) {
            System.out.println("Output:\nthrows Exception //т.к. введено не корректное число.");
            throw new ArithmeticException("Error! Details in the output!");
        }
        String operator = elements[1];
        int result = switch (operator) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> {
                if (b == 0) {
                    System.out.println("Output:\nthrows Exception //т.к. на ноль делить нельзя.");
                    throw new ArithmeticException("Error! Details in the output!");
                }
                yield a / b;
            }
            default -> { System.out.println("Output:\nthrows Exception //т.к. введён не корректный оператор.");
                throw new ArithmeticException("Error! Details in the output!");
            }
        };
        if (a <= 0 || a > 10 || b <= 0 || b > 10) {
            System.out.println("Output:\nthrows Exception //т.к. формат математической операции, не удовлетворяет заданию – только числа от 1 до 10 включительно.");
            throw new ArithmeticException("Error! Details in the output!");
        }
        return "Output:\n" + result;
    }
}
