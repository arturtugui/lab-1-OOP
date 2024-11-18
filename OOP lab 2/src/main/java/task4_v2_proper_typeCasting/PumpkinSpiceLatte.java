package task4_v2_proper_typeCasting;

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
    public void printDetails(){
        super.printDetails(); //of cappuccino
        System.out.println("Pumpkin spice: " + getMgOfPumpkinSpice() + " mg");
    }

    protected static void makePumpkinSpiceLattePrint(PumpkinSpiceLatte pumpkinSpiceLatte){
        makeCappuccinoPrint(pumpkinSpiceLatte);
        System.out.println("Adding " + pumpkinSpiceLatte.getMgOfPumpkinSpice() + " mg of pumpkin spice");
    }

    public static PumpkinSpiceLatte makePumpkinSpiceLatte(String name, Intensity intensity, int mlOfMilk, int mgOfPumpkinSpice) {
        PumpkinSpiceLatte pumpkinSpiceLatte = new PumpkinSpiceLatte(name, intensity, mlOfMilk, mgOfPumpkinSpice);

        makePumpkinSpiceLattePrint(pumpkinSpiceLatte);

        return pumpkinSpiceLatte;
    }
}
