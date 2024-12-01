package Task_1;

import java.util.ArrayList;

public class LuggageCheckingMachine  implements Queue<Color>{
    ArrayList<Color> luggages;

    public LuggageCheckingMachine() {
        luggages = new ArrayList<>();
    }

    @Override
    public boolean isEmpty() {
        return luggages.isEmpty();
    }

    @Override
    public void enqueue(Color item) {
        luggages.add(item);
        System.out.println("A " + item + " luggage was added on the conveyor");
    }

    @Override
    public Color dequeue() {
        if (luggages.isEmpty()) {
            System.out.println("Scanning impossible. No luggages are currently on the conveyor");
            return null;
        }

        Color dequeueItem = luggages.getFirst();
        luggages.removeFirst();

        System.out.println("Succesfully scanned a " + dequeueItem + " luggage");
        return dequeueItem;
    }

    @Override
    public Color peek() {
        if (luggages.isEmpty()) {
            System.out.println("No luggages are currently on the conveyor");
            return null;
        }

        System.out.println("Next luggage to be scanned is " + luggages.getFirst());
        return luggages.getFirst();
    }

    @Override
    public int queueSize() {
        return luggages.size();
    }

    @Override
    public void display() {
        if (luggages.isEmpty()) {
            System.out.println("No luggages are currently on the conveyor");
            return;
        }

        System.out.println("Luggages on conveyor:");
        for(Color item : luggages) {
            System.out.print(item + " luggage    ");
        }
        System.out.println();
    }
}
