package homework_nr_6;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void displayDate() {
        System.out.printf("%02d", day);
//        System.out.print("/");
        System.out.printf("/%02d", month);
//        System.out.print("/");
        System.out.printf("/%04d", year);
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day > 0 && day < 32) this.day = day;
        else System.out.println("Day must be from 1 to 31. Please, enter correct day!");
        displayDate();
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month > 0 && month < 13) this.month = month;
        else System.out.println("Month must be from 1 to 12. Please, enter correct month!");
        displayDate();
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
