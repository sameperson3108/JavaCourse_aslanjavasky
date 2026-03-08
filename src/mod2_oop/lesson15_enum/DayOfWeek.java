package mod2_oop.lesson15_enum;

public enum DayOfWeek {
    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота"),
    SUNDAY("Воскресенье");

    private final String RUSSIANDAYOFWEEK;

    DayOfWeek(String russianDayOfWeek) {
        this.RUSSIANDAYOFWEEK = russianDayOfWeek;
    }

    public String getRussianTranslate() {
        return this.RUSSIANDAYOFWEEK;
    }

}
