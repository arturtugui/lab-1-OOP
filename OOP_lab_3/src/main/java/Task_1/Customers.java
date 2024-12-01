package Task_1;

import java.util.ArrayList;

public class Customers implements Queue<Boolean>{
    ArrayList<Boolean> Customers;

    public Customers() {
        Customers = new ArrayList<>();
    }

    @Override
    public boolean isEmpty() {
        return Customers.isEmpty();
    }

    @Override
    public void enqueue(Boolean item) {
        if (item == null) {
            throw new IllegalArgumentException("Null values are not allowed in the queue");
        }

        Customers.add(item);
        if(item){
            System.out.println("A " + "man" + " is waiting at the Checkout");
        }
        else{
            System.out.println("A " + "woman" + " is waiting at the Checkout");
        }
    }

    @Override
    public Boolean dequeue() {
        if (Customers.isEmpty()) {
            System.out.println("Dequeue impossible. No one is waiting at the Checkout");
            return null;
        }

        Boolean dequeueItem = Customers.getFirst();
        Customers.removeFirst();

        if(dequeueItem){
            System.out.println("A " + "man" + " was served at the Checkout");
        }
        else{
            System.out.println("A " + "woman" + " was served at the Checkout");
        }

        return dequeueItem;
    }

    @Override
    public Boolean peek() {
        if (Customers.isEmpty()) {
            System.out.println("No one is waiting at the Checkout");
            return null;
        }

        if(Customers.getFirst()){
            System.out.println("A " + "man" + " is next in line at the Checkout");
        }
        else{
            System.out.println("A " + "woman" + " is next in line at the Checkout");
        }

        return Customers.getFirst();
    }

    @Override
    public int queueSize() {
        return Customers.size();
    }

    @Override
    public void display() {
        if (Customers.isEmpty()) {
            System.out.println("No one is waiting at the Checkout");
            return;
        }

        System.out.println("Customers in line at Checkout:");
        for(Boolean human : Customers) {
            if(human){
                System.out.print("man  ");
            }
            else{
                System.out.print("woman  ");
            }
        }
        System.out.println();

    }

    public int menCount() {
        int count = 0;
        for (Boolean human : Customers) {
            if(human){
                count++;
            }
        }

        return count;
    }

    public int womenCount() {
        return this.queueSize() - this.menCount();
    }
}
