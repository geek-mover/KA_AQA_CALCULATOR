public class Lesson_3_2 {
    public static void main(String[] args) {
        // Метод 2. copyValueOf – данный метод принимает массив char(ов) и преобразует их в строку.
        String str1 = new String("Hot, Java!");
        String str2 = "82";
        char [] chars = str1.toCharArray();
        String str3 = String.copyValueOf(chars);
        System.out.println(str3);
    }
}