package task1;

import enums.Intensity;

public class PumpkinSpiceLatte extends Cappuccino{
    int mgOfPumpkinSpice;

    PumpkinSpiceLatte(String name, Intensity intensity, int mlOfMilk, int mgOfPumpkinSpice) {
        super(name, intensity, mlOfMilk);
        setMgOfPumpkinSpice(mgOfPumpkinSpice);
    }

    public void setMgOfPumpkinSpice(int mgOfPumpkinSpice) {
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

    public PumpkinSpiceLatte makePumpkinSpiceLatte() {
        super.makeCappuccino();
        System.out.println("Adding " + getMgOfPumpkinSpice() + " mg of pumpkin spice");

        return this;
    }
}
