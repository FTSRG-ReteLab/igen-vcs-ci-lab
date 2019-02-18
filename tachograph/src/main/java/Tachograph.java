import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

import java.util.Date;

public class Tachograph {

    public Table<Date, Integer, Integer> log = HashBasedTable.create();

    public void addLog(Date d, int joystick, int speed) {
        log.put(d, joystick, speed);
    }

}
