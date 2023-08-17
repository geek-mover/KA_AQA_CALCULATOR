public enum Lesson_7_1_Enum_Animal { // Это не строки, это объекты данного класса.
    CAT("Кот."), DOG("Пёс."), FOX("Лис");

    // СОЗДАДИМ КОНСТРУКТОР.
    private String translation;
    Lesson_7_1_Enum_Animal(String translation) {
        this.translation = translation;
    }
    public String getTranslation() {
        return translation;
    }
    // Переопределим метод toString.
    public String toString() {
        return "Перевод на русский язык: " + translation;
    }
}