package mod2_oop.lesson15_enum;

public class EnumDemo {
    static void main() {
        DayOfWeek today = DayOfWeek.SUNDAY;

        if (today == DayOfWeek.SATURDAY || today == DayOfWeek.SUNDAY) {
            System.out.println("It's the weekend");
        } else {
            System.out.println("It's a weekday");
        }


        System.out.println(DayOfWeek.FRIDAY + " on russian is " + DayOfWeek.FRIDAY.getRussianTranslate());
    }
}
