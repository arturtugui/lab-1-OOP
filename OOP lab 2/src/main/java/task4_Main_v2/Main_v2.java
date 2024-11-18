package task4_Main_v2;

import java.util.ArrayList;
import java.util.Scanner;

import Barista_v2.Barista_v2;
import enums.Intensity;
import enums.SyrupType;
import task4_v2_proper_typeCasting.*;

public class Main_v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Coffee> coffeeList = new ArrayList<>();

        boolean workflow = true;
        int choice;

        Barista_v2 barista = new Barista_v2(coffeeList);

        Intensity intensity;
        int mlOfWater, mlOfMilk, mgOfPumpkinSpice;
        SyrupType syrupType;

        while (workflow) {
            displayCoffeeMenu();

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    intensity = barista.askIntensity();

                    coffeeList.add(Coffee.makeCoffee("Coffee", intensity));
                    break;

                case 2:
                    intensity = barista.askIntensity();
                    mlOfWater = barista.askWaterAmount();

                    coffeeList.add(Americano.makeAmericano("Americano", intensity, mlOfWater));
                    break;

                case 3:
                    intensity = barista.askIntensity();
                    mlOfMilk = barista.askMilkAmount();

                    coffeeList.add(Cappuccino.makeCappuccino("Cappuccino", intensity, mlOfMilk));
                    break;

                case 4:
                    intensity = barista.askIntensity();
                    mlOfMilk = barista.askMilkAmount();
                    mgOfPumpkinSpice = barista.askPumpkinSpiceAmount();

                    coffeeList.add(PumpkinSpiceLatte.makePumpkinSpiceLatte("Pumpkin Spice Latte", intensity, mlOfMilk, mgOfPumpkinSpice));
                    break;

                case 5:
                    intensity = barista.askIntensity();
                    mlOfMilk = barista.askMilkAmount();
                    syrupType = barista.askSyrupType();

                    coffeeList.add(SyrupCappuccino.makeSyrupCappuccino("Syrup Cappuccino", intensity, mlOfMilk, syrupType));
                    break;

                case 6:
                    if(!coffeeList.isEmpty()) {
                        System.out.println("\nCurrent coffee list:");
                        for(Coffee c : coffeeList){
                            System.out.print(c.getName() + "    ");
                        }
                        System.out.print("\n");
                    }
                    else{
                        System.out.println("The list is empty");
                    }
                    break;

                case 7:
                    if(!coffeeList.isEmpty()) {
                        barista.serveOrder();
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

        scanner.close();
    }

    private static void displayCoffeeMenu() {
        System.out.println("\nSelect coffee type to order (enter nr.):\n");
        System.out.println("\t1. Coffee");
        System.out.println("\t2. Americano");
        System.out.println("\t3. Cappuccino");
        System.out.println("\t4. Pumpkin Spice Latte");
        System.out.println("\t5. Syrup Cappuccino");

        System.out.println("\t6. Display the order so far");
        System.out.println("\t7. Finish ordering");
    }
}
