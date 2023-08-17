public class Lesson_1_1 {
    public static void main(String[] args) {

        // Переменные, предназначенные для работы с целыми числами:
        int myInt = 12345; // Переменная вмещает только 32-х битные числа.
        short myShort = 123; // Переменная вмещает только 16-ти битные числа.
        long myLong = 1234567; // Переменная позволяет работать с большими числами.
        System.out.println(myInt);
        System.out.println(myShort);
        System.out.println(myLong);
        System.out.println(myInt + ", " + myShort + ", " + myLong);

        // Переменные, предназначенные для работы с вещественными числами:
        double myDouble = 1.2; // 64-х битные числа. По умолчанию, всегда "double".
        float myFloat = 1.2f; // 32-х битные числа. Обязательно в конце буква "f".
        System.out.println(myDouble);
        System.out.println(myFloat);

        // Переменные, предназначенные для работы с единичными символами (например буквами):
        char myChar = 'a'; // Значение переменной записывается в одинарных кавычках.
        System.out.println(myChar);

        // Переменные, предназначенные для работы со строчными типами данных:
        String myString = "abc"; // Значение переменной записывается в двойных кавычках.
        System.out.println(myString);

        // Переменные, предназначенные для работы с логическими типами данных (булевыми):
        boolean myBooleanT = true;
        boolean myBooleanF = false;
        System.out.println(myBooleanT);
        System.out.println(myBooleanF);

        // Переменные, предназначенные для работы с байтами.
        // Этот тип данных, вмещает в себя только 8 бит (1 байт) информации.
        byte myByte = 127; // Для работы с маленькими числами (от -128 до 127).
        System.out.println(myByte);
    }
}