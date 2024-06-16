package work.expertin.springboot21.core.feature;

/**
 * since JDK 12
 */
public class SwitchExpressionExample {

    public static void main(String[] args) {
        int day = 3;
        String dayName = switch (day) {
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            default -> throw new IllegalArgumentException("Invalid day : " + day);
        };

        System.out.println(dayName);
    }
}
