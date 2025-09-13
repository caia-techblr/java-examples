package datetime;

enum Season { WINTER, SPRING, SUMMER, FALL }

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public boolean isLeapYear() {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }   

    public int daysInMonth(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear() ? 29 : 28;
            default:
                throw new IllegalArgumentException("Invalid month: " + month);
        }
    }
    public int totalNumberOfDays() {
        int totalDays = 0;
        for (int m = 1; m < month; m++) {
            totalDays += daysInMonth(m, year);
        }
        totalDays += day;
        return totalDays;
    }
    public Season getSeason() {
        switch (month) {
            case 12: case 1: case 2:
                return Season.WINTER;
            case 3: case 4: case 5:
                return Season.SPRING;
            case 6: case 7: case 8:
                return Season.SUMMER;
            case 9: case 10: case 11:
                return Season.FALL;
            default:
                throw new IllegalArgumentException("Invalid month: " + month);
        }
    }       

    public String toString() {
        return String.format("%02d/%02d/%04d", day, month, year);
    }
}
