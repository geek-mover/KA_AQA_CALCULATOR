import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lesson_8_1 {
    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Обработка исключения в методе main.");
        }
    }
    public static void readFile() throws FileNotFoundException {
        File file = new File("abc"); // Не существующий файл.
        Scanner scanner = new Scanner(file);
    }
}