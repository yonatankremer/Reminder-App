import java.util.*;


public class Main {
    public static void main(String[] args) {
        
        ReminderList r = new ReminderList();
        r.app();
        while (true) {
        r.getList().add(Reminder.createReminder());
        }
    }
}