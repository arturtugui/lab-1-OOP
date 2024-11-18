package task4_Main;

import java.util.ArrayList;
import java.util.Scanner;
import Barista.Barista;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> coffeeList = new ArrayList<>();

        boolean workflow = true;
        int choice;

        while (workflow) {
            displayCoffeeMenu();

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    coffeeList.add("Coffee");
                    break;

                case 2:
                    coffeeList.add("Americano");
                    break;

                case 3:
                    coffeeList.add("Cappuccino");
                    break;

                case 4:
                    coffeeList.add("Pumpkin Spice Latte");
                    break;

                case 5:
                    coffeeList.add("Syrup Cappuccino");
                    break;

                case 6:
                    if(!coffeeList.isEmpty()) {
                        System.out.println("Current coffee list:\n" + coffeeList);
                    }
                    else{
                        System.out.println("The list is empty");
                    }
                    break;

                case 7:
                    if(!coffeeList.isEmpty()) {
                        workflow = false;
                    }
                    else{
                        System.out.println("Cannot proceed further, the list is empty");
                    }
                    break;

                default:
                    System.out.println("Invalid number, try again");
            }
        }


        Barista barista = new Barista(coffeeList);
        barista.work();

        scanner.close();
    }

    private static void displayCoffeeMenu() {
        System.out.println("\nSelect coffee type to add to list (enter nr.):\n");
        System.out.println("\t1. Coffee");
        System.out.println("\t2. Americano");
        System.out.println("\t3. Cappuccino");
        System.out.println("\t4. Pumpkin Spice Latte");
        System.out.println("\t5. Syrup Cappuccino");
        System.out.println("\t6. Display current list");
        System.out.println("\t7. Done");
    }
}
