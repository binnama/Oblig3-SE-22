public class Main {

    public static void main(String[] args) {

    }

    // Changed from boolIsLeapYer to isLeapYear
    public static boolean isLeapYear(int year) {

        boolean leapYear = false;
        if (year % 4 == 0) {
            leapYear = year % 100 != 0;
        }

        if (year % 400 == 0) {
            leapYear = true;
        }

        if (year % 100 == 0) {
            if (year % 400 != 0) {
                leapYear = false;
            }
        }

        return leapYear;
    }
}