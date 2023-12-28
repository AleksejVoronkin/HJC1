package Tools;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Time {
    public static String getCurrentTimeStamp() {
        SimpleDateFormat sdfDate = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        Date now = new Date();
        return sdfDate.format(now);
    }
}
