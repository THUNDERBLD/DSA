// An enum (enumeration) in Java is a special data type used to define a collection of constants. 
// It is useful when you need a fixed set of predefined values (e.g., days of the week, directions, months, etc.).

// basically u can say that enum is type of select tag from html, from where u can only select from the given options

public class enums {
    enum Day {
        // types of these enum constants are Day
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY  // these are called enum constants and by default they are public static and final
                                                                        // since its final therefore u cannot create child enums 
    }

    public static void main(String[] args) {
        Day today = Day.SATURDAY;
        System.out.println("Today is: " + today);

        // Looping through enum values
        for (Day d : Day.values()) {
            System.out.println(d);
        }
    }
}
