import Task_1.Color;
import Task_1.LuggageCheckingMachine;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestLuggageCheckingMachine {

    @Test
    public void testEnqueue() {
        LuggageCheckingMachine machine = new LuggageCheckingMachine();

        assertTrue(machine.isEmpty());
        assertEquals(0, machine.queueSize());

        machine.enqueue(Color.RED);
        assertFalse(machine.isEmpty());
        assertEquals(1, machine.queueSize());

        machine.enqueue(Color.BLUE);
        assertEquals(2, machine.queueSize());
    }

    @Test
    public void testDequeue() {
        LuggageCheckingMachine machine = new LuggageCheckingMachine();

        machine.enqueue(Color.RED);
        machine.enqueue(Color.GREEN);

        assertEquals(Color.RED, machine.dequeue());
        assertEquals(1, machine.queueSize());

        assertEquals(Color.GREEN, machine.dequeue());
        assertEquals(0, machine.queueSize());

        assertNull(machine.dequeue());
    }

    @Test
    public void testPeek() {
        LuggageCheckingMachine machine = new LuggageCheckingMachine();

        assertNull(machine.peek());

        machine.enqueue(Color.YELLOW);
        machine.enqueue(Color.ORANGE);

        assertEquals(Color.YELLOW, machine.peek());

        machine.dequeue();

        assertEquals(Color.ORANGE, machine.peek());

        machine.dequeue();

        assertNull(machine.peek());
    }

    @Test
    public void testDisplay() {
        LuggageCheckingMachine machine = new LuggageCheckingMachine();

        machine.display();

        machine.enqueue(Color.PURPLE);
        machine.enqueue(Color.MAGENTA);

        machine.display();

        machine.dequeue();
        machine.display();
    }
}