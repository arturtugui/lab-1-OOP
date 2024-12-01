package Task_2;

import Task_2.Refuelables.*;
import org.junit.Test;

public class TestRefuelable {
    @Test
    public void testRefuelable() {
        GasStation gs = new GasStation();
        ElectricStation es = new ElectricStation();

        gs.refuel("1");
        es.refuel("2");
    }
}
