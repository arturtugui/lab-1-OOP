package task4_failed_casting_attempt;

import enums.Intensity;

public class PumpkinSpiceLatte extends Cappuccino{
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
    protected void printDetails(){
        super.printDetails(); //of cappucino
        System.out.println("Pumpkin spice: " + getMgOfPumpkinSpice() + " mg");
    }

    protected PumpkinSpiceLatte makePumpkinSpiceLatte() {
        //super.makeCappuccino();
        System.out.println("Adding " + getMgOfPumpkinSpice() + " mg of pumpkin spice");

        return this;
    }
}
