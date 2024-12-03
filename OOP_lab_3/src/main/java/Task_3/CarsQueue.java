package Task_3;

import Task_1.Queue;
import Task_2.CarsProcessing.Car;

import java.util.ArrayList;

public class CarsQueue implements Queue<Car> {
    ArrayList<Car> carsQueue;

    public CarsQueue() {
        this.carsQueue = new ArrayList<>();
    }

    @Override
    public boolean isEmpty() {
        return carsQueue.isEmpty();
    }

    @Override
    public void enqueue(Car item) {
        if(item == null) {
            throw new IllegalArgumentException("Null values are not allowed in the queue");
        }

        carsQueue.add(item);
        System.out.println("Car "+ item.getId() +" was added to the queue");
    }

    @Override
    public Car dequeue() {
        if(carsQueue.isEmpty()) {
            System.out.println("Cannot dequeue. Car queue is empty");
            return null;
        }

        Car dequeueItem = carsQueue.getFirst();
        carsQueue.removeFirst();

        System.out.println("Removed car " + dequeueItem.getId() + " from the queue");
        return dequeueItem;
    }

    @Override
    public Car peek() {
        if(carsQueue.isEmpty()) {
            System.out.println("Car queue is empty");
            return null;
        }

        System.out.println("Next in queue is Car " + carsQueue.getFirst().getId());
        return carsQueue.getFirst();
    }

    @Override
    public int queueSize() {
        return carsQueue.size();
    }

    @Override
    public void display() {
        if(carsQueue.isEmpty()) {
            System.out.println("Car queue is empty");
            return;
        }

        System.out.println("Cars in queue:");
        for(Car item : carsQueue) {
            System.out.print("Car " + item.getId() + "    ");
        }
        System.out.println();
    }
}
