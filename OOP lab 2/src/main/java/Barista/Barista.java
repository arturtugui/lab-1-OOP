package Barista;

import java.util.ArrayList;
import java.util.Scanner;
import enums.Intensity;
import enums.SyrupType;
import task4.Coffee;
import task4.Americano;
import task4.Cappuccino;
import task4.PumpkinSpiceLatte;
import task4.SyrupCappuccino;

public class Barista {
    private ArrayList<String> coffeeList;

    public Barista(ArrayList<String> coffeeList) {
        this.coffeeList = coffeeList;
    }

    public void work() {
        Scanner scanner = new Scanner(System.in);

        for (String coffee : coffeeList) {
            System.out.println("\n\nEnter details for: " + coffee);
            Intensity intensity = askIntensity();

            if(coffee.equals("Coffee")) {
                brewCoffee(intensity);
            }
            if(coffee.equals("Americano")) {
                int water = askWaterAmount();
                brewAmericano(intensity, water);
            }
            if(coffee.equals("Cappuccino")) {
                int milk = askMilkAmount();
                brewCappuccino(intensity, milk);
            }
            if(coffee.equals("Pumpkin Spice Latte")) {
                int milk = askMilkAmount();
                int ps = askPumpkinSpiceAmount();
                brewPumpkinSpiceLatte(intensity, milk, ps);
            }
            if(coffee.equals("Syrup Cappuccino")) {
                int milk = askMilkAmount();
                SyrupType type = askSyrupType();
                brewSyrupCappuccino(intensity, milk, type);
            }
        }
    }

    public Intensity askIntensity() {
        Scanner scanner = new Scanner(System.in);
        Intensity intensity = null;
        boolean validInput = false;

        while (!validInput) {
            System.out.println("\nSelect coffee intensity:");
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
            System.out.print("Enter the amount of water in ml for Americano (max 2000 ml): ");
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
            System.out.print("Enter the amount of milk in ml for Cappuccino (max 2000 ml): ");
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

    public void brewCoffee(Intensity intensity){
        Coffee coffee = Coffee.makeCoffee("Coffee", intensity);
        coffee.printDetails();
    }

    public void brewAmericano(Intensity intensity, int mlOfWater){
        Americano americano = Americano.makeAmericano("Americano", intensity, mlOfWater);
        americano.printDetails();
    }

    public void brewCappuccino(Intensity intensity, int mlOfMilk){
        Cappuccino cappuccino = Cappuccino.makeCappuccino("Cappuccino", intensity, mlOfMilk);
        cappuccino.printDetails();
    }

    public void brewPumpkinSpiceLatte(Intensity intensity, int mlOfMilk, int mgOfPumpkinSpice){
        PumpkinSpiceLatte pumpkinSpiceLatte = PumpkinSpiceLatte.makePumpkinSpiceLatte("Pumpkin Spice Latte", intensity, mlOfMilk, mgOfPumpkinSpice);
        pumpkinSpiceLatte.printDetails();
    }

    public void brewSyrupCappuccino(Intensity intensity, int mlOfMilk, SyrupType type){
        SyrupCappuccino syrupCappuccino = SyrupCappuccino.makeSyrupCappuccino("SyrupCappuccino", intensity, mlOfMilk, type);
        syrupCappuccino.printDetails();
    }

}

