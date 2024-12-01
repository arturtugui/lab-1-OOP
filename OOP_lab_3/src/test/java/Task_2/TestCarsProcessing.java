package Task_2;

import Task_2.CarsProcessing.*;
import org.junit.Test;
import java.io.File;
import java.io.IOException;

import static org.junit.Assert.*;

public class TestCarsProcessing {
    @Test
    public void testReadCar1() throws IOException {
        File jsonFile = new File("C:\\Users\\Admin\\Desktop\\OOP\\OOP lab 3\\lab-1-OOP\\OOP_lab_3\\src\\test\\CarsExamples\\queue\\Car1.json");
        ReadJSON reader = new ReadJSON();

        // Read JSON and assert values
        Car car = reader.readJSON(jsonFile);

        assertNotNull(car);
        assertEquals(1, car.getId());
        assertEquals("ELECTRIC", car.getType());
        assertEquals("ROBOTS", car.getPassengers());
        assertTrue(car.isDining());
        assertEquals(11, car.getConsumption());
    }
}
