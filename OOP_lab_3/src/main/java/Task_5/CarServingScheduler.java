package Task_5;

import Task_2.CarsProcessing.Car;
import Task_2.CarsProcessing.ReadJSON;
import Task_2.Dineables.DineableStats;
import Task_2.Refuelables.RefuelableStats;
import Task_4.PassengersStats;
import Task_4.Semaphore;

import java.io.File;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.io.IOException;

public class CarServingScheduler {
    private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2); // Use a pool of 2 threads
    private final File queueFolder = new File("C:\\Users\\Admin\\Desktop\\OOP\\OOP lab 3\\lab-1-OOP\\OOP_lab_3\\src\\generator\\queue");
    private  Semaphore semaphore;

    public CarServingScheduler(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    public void startScheduling() {
        deleteQueueFolder();

        startPythonGenerator();

        //Thread #1: Read cars from the queue folder
        scheduler.scheduleAtFixedRate(this::processCarFiles, 5, 5, TimeUnit.SECONDS);

        //Thread #2: Serve cars
        scheduler.scheduleAtFixedRate(this::serveCars, 7, 5, TimeUnit.SECONDS);
    }

    private void deleteQueueFolder() {
        if (queueFolder.exists() && queueFolder.isDirectory()) {
            File[] files = queueFolder.listFiles();

            if (files != null) {
                for (File file : files) {
                    if (file.isFile()) {
                        file.delete();
                    }
                }
            }

            queueFolder.delete();
            System.out.println("Deleted the 'queue' folder and its contents.");
        }
    }

    private void startPythonGenerator() {
        String command = "python C:\\Users\\Admin\\Desktop\\OOP\\OOP lab 3\\lab-1-OOP\\OOP_lab_3\\src\\generator\\generator.py";

        ProcessBuilder processBuilder = new ProcessBuilder(command.split(" "));

        try {
            Process process = processBuilder.start();
            System.out.println("Python generator script started...");


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void processCarFiles () {
        ReadJSON reader = new ReadJSON();
        File[] files = queueFolder.listFiles((dir, name) -> name.endsWith(".json"));

        if (files != null && files.length > 0) {
            for (File file : files) {
                try {
                    Car car = reader.readJSON(file);
                    semaphore.addCarToQueue(car);
                } catch (IOException e) {
                    // Log the error and continue processing other files
                    System.err.println("Failed to read file: " + file.getName());
                    e.printStackTrace();
                }
            }

            semaphore.routeCars();
        }
    }

    private void serveCars() {
        semaphore.getPeopleElectricService().serveCars();
        semaphore.getPeopleGasService().serveCars();
        semaphore.getRobotElectricService().serveCars();
        semaphore.getRobotGasService().serveCars();
    }

    public static void printStats() {
        int diningCount = DineableStats.getPeopleServedCount() + DineableStats.getRobotsServedCount();
        int notDiningCount = PassengersStats.getPeopleTotalCount() + PassengersStats.getRobotsTotalCount() - diningCount;

        System.out.println();
        System.out.print("{");
        System.out.print("  \"ELECTRIC\": " + RefuelableStats.getElectricCarsServedCount() + ",");
        System.out.print("  \"GAS\": " + RefuelableStats.getGasCarsServedCount() + ",");
        System.out.print("  \"PEOPLE\": " + PassengersStats.getPeopleTotalCount() + ",");
        System.out.print("  \"ROBOTS\": " + PassengersStats.getRobotsTotalCount() + ",");
        System.out.print("  \"DINING\": " + diningCount + ",");
        System.out.print("  \"NOT_DINING\": " + notDiningCount + ",");
        System.out.print("  \"CONSUMPTION\": {");
        System.out.print("    \"ELECTRIC\": " + RefuelableStats.getElectricCarsServedCountFuel() + ",");
        System.out.print("    \"GAS\": " + RefuelableStats.getGasCarsServedCountFuel());
        System.out.print("  }");
        System.out.print("}");
        System.out.println();
    }
}
