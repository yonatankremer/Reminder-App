import java.util.Date;
import java.util.Scanner;
import java.util.Calendar;
import java.time.*;

public class Reminder {

    private int year, month, day, hour, minute; //used for storage and copy construction

    private LocalDate date;
    private LocalTime time;
    private LocalDateTime ldt;

    private String message;

    public Reminder (int year, int month, int day, int hour, int minute, String message) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minute = minute;

        this.date = LocalDate.of(year, month, day);
        this.time = LocalTime.of(hour, minute, 0);
        this.ldt = LocalDateTime.of(date, time);
        this.message = message;
    }


    //copy contructor

    //default constructor


    public static Reminder creatReminder() {
        Scanner in = new Scanner(System.in);

        System.out.println("enter the desired year: ");
        int year = in.nextInt();
        System.out.println("enter the desired month: ");
        int month = in.nextInt();
        System.out.println("enter the desired day: ");
        int day = in.nextInt();
        System.out.println("enter the desired hour: ");
        int hour = in.nextInt();
        System.out.println("enter the desired minute: ");
        int minute = in.nextInt();
        System.out.println("enter the desired message: ");
        String message = in.nextLine();

        in.close();
        
        return new Reminder(year, month, day, hour, minute, message);
    }

    public void remind() {}

    public boolean isNotif(LocalDateTime l) {
        if (ldt.equals(l))
            return true;
            return false;
        }
         


    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return this.day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getHour() {
        return this.hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return this.time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public LocalDateTime getLdt() {
        return this.ldt;
    }

    public void setLdt(LocalDateTime ldt) {
        this.ldt = ldt;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    @Override
    public String toString() {
        return "{" +
            " year='" + getYear() + "'" +
            ", month='" + getMonth() + "'" +
            ", day='" + getDay() + "'" +
            ", hour='" + getHour() + "'" +
            ", minute='" + getMinute() + "'" +
            ", date='" + getDate() + "'" +
            ", time='" + getTime() + "'" +
            ", ldt='" + getLdt() + "'" +
            ", message='" + getMessage() + "'" +
            "}";
    }

}