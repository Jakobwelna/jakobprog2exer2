import org.junit.Test;
import trafficlight.ctrl.TrafficLightCtrl;
import trafficlight.gui.TrafficLight;

import static org.junit.jupiter.api.Assertions.*;


public class TestTrafficLight {

    @Test
    public void SingletonTest(){
        TrafficLightCtrl ctrl = TrafficLightCtrl.getInstance();
        assertNotNull(ctrl);
    }


    @Test
    public void SingleTest2(){
        TrafficLightCtrl ctrl = TrafficLightCtrl.getInstance();
        TrafficLightCtrl ctrl2 = TrafficLightCtrl.getInstance();
        assertEquals(ctrl,ctrl2);
    }


}
