import java.io.IOException;
import java.util.Scanner;

public class Lesson_8_2 {
    public static void main(String[] args) throws Lesson_8_2_ScannerException {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            int x = Integer.parseInt(scanner.nextLine());
            if(x != 0) { // Другой вариант выбрасывания исключения.
                throw new Lesson_8_2_ScannerException("Введено не допустимое значение!");
            }
        }
    }
}