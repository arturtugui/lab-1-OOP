package task4_failed_casting_attempt;

import enums.Intensity;
import enums.SyrupType;

public class SyrupCappuccino extends Cappuccino {
    protected SyrupType syrup;

    protected SyrupCappuccino(String name, Intensity intensity, int mlOfMilk, SyrupType syrup) {
        super(name, intensity, mlOfMilk);
        setSyrup(syrup);
    }

    protected void setSyrup(SyrupType syrup) {
        this.syrup = syrup;
    }

    public SyrupType getSyrup() {
        return syrup;
    }



    @Override
    protected void printDetails(){
        super.printDetails(); //of cappucino
        System.out.println("Syrup type: " + getSyrup() + " mg");
    }

    protected SyrupCappuccino makeSyrupCappuccino() {
        //super.makeCappuccino();
        System.out.println("Adding " + getSyrup());
        return this;
    }
}