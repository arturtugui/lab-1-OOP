package Task_1;

public interface Queue<T> {
    boolean isEmpty();
    void enqueue(T item);
    T dequeue();
    T peek();
    int queueSize();
    void display();
}
