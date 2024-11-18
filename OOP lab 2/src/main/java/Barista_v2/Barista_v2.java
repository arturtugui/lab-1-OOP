package Barista_v2;

import java.util.ArrayList;
import java.util.Scanner;

import enums.Intensity;
import enums.SyrupType;
import task4_v2_proper_typeCasting.*;

public class Barista_v2 {
    private ArrayList<Coffee> coffeeList;

    public Barista_v2(ArrayList<Coffee> coffeeList) {
        this.coffeeList = coffeeList;
    }

    public void serveOrder() {
        System.out.println("\nThank you for ordering coffee at our place! Here is your order:");

        for(Coffee coffee : coffeeList) {
            coffee.printDetails();
        }
    }

    public Intensity askIntensity() {
        Scanner scanner = new Scanner(System.in);
        Intensity intensity = null;
        boolean validInput = false;

        while (!validInput) {
            System.out.println("\nSelect intensity:");
            System.out.println("\t1. LIGHT");
            System.out.println("\t2. NORMAL");
            System.out.println("\t3. STRONG");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    intensity = Intensity.LIGHT;
                    validInput = true;
                    break;
                case 2:
                    intensity = Intensity.NORMAL;
                    validInput = true;
                    break;
                case 3:
                    intensity = Intensity.STRONG;
                    validInput = true;
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
        return intensity;
    }

    public int askWaterAmount() {
        Scanner scanner = new Scanner(System.in);
        int waterAmount = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Enter the amount of water in ml (max 2000 ml): ");
            waterAmount = scanner.nextInt();
            if (waterAmount > 0 && waterAmount <= 2000) {
                validInput = true;
            } else {
                System.out.println("Please enter a valid positive amount (1-2000 ml).");
            }
        }
        return waterAmount;
    }

    public int askMilkAmount() {
        Scanner scanner = new Scanner(System.in);
        int milkAmount = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Enter the amount of milk in ml (max 2000 ml): ");
            milkAmount = scanner.nextInt();
            if (milkAmount > 0 && milkAmount <= 2000) {
                validInput = true;
            } else {
                System.out.println("Please enter a valid positive amount (1-2000 ml).");
            }
        }
        return milkAmount;
    }

    public int askPumpkinSpiceAmount() {
        Scanner scanner = new Scanner(System.in);
        int pumpkinSpiceAmount = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Enter the amount of pumpkin spice in grams (max 1000 g): ");
            pumpkinSpiceAmount = scanner.nextInt();
            if (pumpkinSpiceAmount > 0 && pumpkinSpiceAmount < 1000) {
                validInput = true;
            } else {
                System.out.println("Please enter a valid positive amount (1-999 g).");
            }
        }
        return pumpkinSpiceAmount;
    }

    public SyrupType askSyrupType() {
        Scanner scanner = new Scanner(System.in);
        SyrupType syrupType = null;
        boolean validInput = false;

        while (!validInput) {
            System.out.println("\nSelect syrup type:");
            System.out.println("\t1. MACADAMIA");
            System.out.println("\t2. VANILLA");
            System.out.println("\t3. COCONUT");
            System.out.println("\t4. CARAMEL");
            System.out.println("\t5. CHOCOLATE");
            System.out.println("\t6. POPCORN");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    syrupType = SyrupType.MACADAMIA;
                    validInput = true;
                    break;

                case 2:
                    syrupType = SyrupType.VANILLA;
                    validInput = true;
                    break;

                case 3:
                    syrupType = SyrupType.COCONUT;
                    validInput = true;
                    break;

                case 4:
                    syrupType = SyrupType.CARAMEL;
                    validInput = true;
                    break;

                case 5:
                    syrupType = SyrupType.CHOCOLATE;
                    validInput = true;
                    break;

                case 6:
                    syrupType = SyrupType.POPCORN;
                    validInput = true;
                    break;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
        return syrupType;
    }
}



