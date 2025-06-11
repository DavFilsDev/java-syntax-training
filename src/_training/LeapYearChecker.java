package _training;

/**
 * Checks if a given year is a leap year.
 */
public class LeapYearChecker {

    /**
     * Returns true if the year is a leap year, false otherwise.
     *
     * @param year the year to check
     * @return boolean indicating leap year
     */
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        int[] years = {1900, 2000, 2004, 2019};
        for (int year : years) {
            System.out.println(year + " is leap year? " + isLeapYear(year));
        }
    }
}
