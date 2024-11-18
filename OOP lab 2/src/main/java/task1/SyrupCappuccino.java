package task1;

import enums.Intensity;
import enums.SyrupType;

public class SyrupCappuccino extends Cappuccino {
    SyrupType syrup;

    SyrupCappuccino(String name, Intensity intensity, int mlOfMilk, SyrupType syrup) {
        super(name, intensity, mlOfMilk);
        setSyrup(syrup);
    }

    public void setSyrup(SyrupType syrup) {
        this.syrup = syrup;
    }

    public SyrupType getSyrup() {
        return syrup;
    }



    @Override
    public void printDetails(){
        super.printDetails(); //of cappucino
        System.out.println("Syrup type: " + getSyrup() + " mg");
    }

    public SyrupCappuccino makeSyrupCappuccino() {
        super.makeCappuccino();
        System.out.println("Adding " + getSyrup());
        return this;
    }
}