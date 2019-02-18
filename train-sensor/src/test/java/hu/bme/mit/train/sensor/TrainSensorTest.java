package hu.bme.mit.train.sensor;

import hu.bme.mit.train.interfaces.TrainController;
import hu.bme.mit.train.interfaces.TrainSensor;
import hu.bme.mit.train.interfaces.TrainUser;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;

public class TrainSensorTest {

    @Before
    public void before() {

    }

    @Test
    public void ThisIsAnExampleTestStub() {
        // TODO Delete this and add test cases based on the issues
    }

    @Test
    public void TestDefaultSpeedLimit() {
        TrainSensor testSensor = new TrainSensorImpl(mock(TrainController.class), mock(TrainUser.class));
        assert testSensor.getSpeedLimit() == 4;
    }
}
