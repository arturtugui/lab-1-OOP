package task4;

import enums.Intensity;
import task4_failed_casting_attempt.Cappuccino;

public class PumpkinSpiceLatte extends Cappuccino {
    protected int mgOfPumpkinSpice;

    protected PumpkinSpiceLatte(String name, Intensity intensity, int mlOfMilk, int mgOfPumpkinSpice) {
        super(name, intensity, mlOfMilk);
        setMgOfPumpkinSpice(mgOfPumpkinSpice);
    }

    protected void setMgOfPumpkinSpice(int mgOfPumpkinSpice) {
        this.mgOfPumpkinSpice = mgOfPumpkinSpice;
    }

    public int getMgOfPumpkinSpice() {
        return mgOfPumpkinSpice;
    }



    @Override
    public void printDetails(){
        super.printDetails(); //of cappucino
        System.out.println("Pumpkin spice: " + getMgOfPumpkinSpice() + " mg");
    }

    public static PumpkinSpiceLatte makePumpkinSpiceLatte(String name, Intensity intensity, int mlOfMilk, int mgOfPumpkinSpice) {
        PumpkinSpiceLatte pumpkinSpiceLatte = new PumpkinSpiceLatte(name, intensity, mlOfMilk, mgOfPumpkinSpice);

        System.out.println("\nMaking: " + pumpkinSpiceLatte.getName());
        System.out.println("Intensity set to " + pumpkinSpiceLatte.getIntensity());
        System.out.println("Adding " + pumpkinSpiceLatte.getMlOfMilk() + " mls of milk");
        System.out.println("Adding " + pumpkinSpiceLatte.getMgOfPumpkinSpice() + " mg of pumpkin spice");

        return pumpkinSpiceLatte;
    }
}
