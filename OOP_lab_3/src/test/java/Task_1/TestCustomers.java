package Task_1;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestCustomers {

    @Test
    public void testEnqueue() {
        Customers queue = new Customers();

        assertTrue(queue.isEmpty());
        assertEquals(0, queue.queueSize());

        queue.enqueue(true);
        assertEquals(1, queue.queueSize());

        queue.enqueue(false);
        assertEquals(2, queue.queueSize());
    }

    @Test
    public void testDequeue() {
        Customers queue = new Customers();

        queue.enqueue(true);
        queue.enqueue(false);

        Boolean servedCustomer = queue.dequeue();
        assertTrue(servedCustomer);

        assertEquals(1, queue.queueSize());

        servedCustomer = queue.dequeue();
        assertFalse(servedCustomer);

        assertTrue(queue.isEmpty());
    }

    @Test
    public void testPeek() {
        Customers queue = new Customers();

        assertNull(queue.peek());

        queue.enqueue(true);
        queue.enqueue(false);

        assertTrue(queue.peek());
        assertEquals(2, queue.queueSize());
    }

    @Test
    public void testMenAndWomenCount() {
        Customers queue = new Customers();

        queue.enqueue(true);
        queue.enqueue(true);
        queue.enqueue(false);

        assertEquals(3, queue.queueSize());
        assertEquals(2, queue.menCount());
        assertEquals(1, queue.womenCount());

        queue.dequeue();
        assertEquals(2, queue.queueSize());
        assertEquals(1, queue.menCount());
        assertEquals(1, queue.womenCount());
    }

    @Test
    public void testDisplay() {
        Customers queue = new Customers();

        queue.enqueue(true);
        queue.enqueue(false);
        queue.enqueue(true);

        queue.display();

        queue.dequeue();
        queue.display();

        queue.dequeue();
        queue.dequeue();
        queue.display();
    }
}

