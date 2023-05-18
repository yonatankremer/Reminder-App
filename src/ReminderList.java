import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.LinkedList;
import java.util.Timer;
import java.util.TimerTask;

public class ReminderList {
   
    public static final int MS_IN_MINUTE = 60000;
    private LinkedList<Reminder> list = new LinkedList<Reminder>();

    public void app() {
        //change method of reciving seconds passed in minute
        
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                for (int i=0; i<list.size(); i++) {
                    Reminder current = list.get(i);
                    LocalDateTime now = LocalDateTime.now();
                    if (current.isRemind(now.truncatedTo(ChronoUnit.MINUTES)))
                        current.remind();
                }
            }
        };
        
        long initialDelayMillis = MS_IN_MINUTE - ((System.currentTimeMillis()%MS_IN_MINUTE));
        timer.scheduleAtFixedRate(task, initialDelayMillis, MS_IN_MINUTE);

    } 

    public LinkedList<Reminder> getList() {return list;}
}
