import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class TachographTest {

    @Test
    public void TestContains() {
        Tachograph t = new Tachograph();
        t.addLog(new Date(), 456, 456);
        assert t.log.size() > 0;
    }
}