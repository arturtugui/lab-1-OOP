package Task_1;

import java.util.ArrayList;

public class CheckoutConveyor implements Queue<Float>{
    ArrayList<Float> itemPrices;

    public CheckoutConveyor() {
        itemPrices = new ArrayList<>();
    }



    @Override
    public boolean isEmpty() {
        return itemPrices.isEmpty();
    }

    @Override
    public void enqueue(Float itemPrice) {
        if (itemPrice == null) {
            throw new IllegalArgumentException("Null values are not allowed in the queue");
        }

        itemPrices.add(itemPrice);
        System.out.println("An item with price " + itemPrice + " was added on the CheckoutConveyor");
    }

    @Override
    public Float dequeue() {
        if (itemPrices.isEmpty()) {
            System.out.println("Dequeue impossible. No items on CheckoutConveyor");
            return null;
        }

        Float dequeueItem = itemPrices.getFirst();
        itemPrices.removeFirst();

        System.out.println("Removed item with price " + dequeueItem + " from the CheckoutConveyor");
        return dequeueItem;
    }

    @Override
    public Float peek() {
        if (itemPrices.isEmpty()) {
            System.out.println("No items on CheckoutConveyor");
            return null;
        }

        System.out.println("Next is item with price " + itemPrices.getFirst() + " on the CheckoutConveyor");
        return itemPrices.getFirst();
    }

    @Override
    public int queueSize() {
        return itemPrices.size();
    }

    @Override
    public void display() {
        if (itemPrices.isEmpty()) {
            System.out.println("No items on CheckoutConveyor");
            return;
        }

        System.out.println("Items on CheckoutConveyor:");
        for(Float itemPrice : itemPrices) {
            System.out.print(itemPrice + "   ");
        }
        System.out.println();
    }

}
