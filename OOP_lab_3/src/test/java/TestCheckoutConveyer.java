import Task_1.CheckoutConveyor;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestCheckoutConveyer {
    @Test
    public void testEnqueue() {
        CheckoutConveyor cc = new CheckoutConveyor();

        assertTrue(cc.isEmpty());

        assertEquals(0, cc.queueSize());

        cc.enqueue(75f);
        assertEquals(1, cc.queueSize());

        cc.enqueue(50.7f);
        assertEquals(2, cc.queueSize());
    }

    @Test
    public void testDequeue() {
        CheckoutConveyor cc = new CheckoutConveyor();

        Float el1 = 75f, el2 = 50.7f;
        cc.enqueue(el1);
        cc.enqueue(el2);

        Float removedItem = cc.dequeue();
        assertEquals(el1, removedItem);

        assertEquals(1, cc.queueSize());

        removedItem = cc.dequeue();
        assertEquals(el2, removedItem);

        assertTrue(cc.isEmpty());
    }

    @Test
    public void testPeek() {
        CheckoutConveyor cc = new CheckoutConveyor();

        assertNull(cc.peek());

        Float el1 = 75f, el2 = 50.7f;
        cc.enqueue(el1);
        cc.enqueue(el2);

        assertEquals(el1, cc.peek());
        cc.dequeue();

        assertEquals(el2, cc.peek());

        assertNotNull(cc.peek());

    }

    @Test
    public void testDisplay() {
        CheckoutConveyor cc = new CheckoutConveyor();

        Float el1 = 75f, el2 = 50.7f;
        cc.enqueue(el1);
        cc.enqueue(el2);

        cc.display();

        cc.dequeue();
        cc.dequeue();

        cc.display();
    }


}
