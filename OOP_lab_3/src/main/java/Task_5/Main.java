package Task_5;

import Task_4.Semaphore;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        Semaphore semaphore = Semaphore.createSemaphore();

        CarServingScheduler scheduler = new CarServingScheduler(semaphore);

        scheduler.startScheduling();

        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
