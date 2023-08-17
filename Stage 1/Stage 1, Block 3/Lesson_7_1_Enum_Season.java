public enum Lesson_7_1_Enum_Season {
    WINTER(-10), SPRING(10), SUMMER(20), AUTUMN(5);
    private int temperature;
    Lesson_7_1_Enum_Season(int temperature) {
        this.temperature = temperature;
    }
    public int getTemperature() {
        return temperature;
    }
}