import java.util.*;

public class Main {
    public static void main(String[] args) {

        ReminderList r = new ReminderList();
        r.getList().add(Reminder.createReminder());
        System.out.println(r.getList().getFirst());
        r.app();
    }
}