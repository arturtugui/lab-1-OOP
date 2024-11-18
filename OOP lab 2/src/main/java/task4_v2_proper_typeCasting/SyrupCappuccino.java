package task4_v2_proper_typeCasting;

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
    public void printDetails(){
        super.printDetails(); //of cappuccino
        System.out.println("Syrup type: " + getSyrup());
    }

    protected static void makeSyrupCappuccinoPrint(SyrupCappuccino syrupCappuccino){
        makeCappuccinoPrint(syrupCappuccino);
        System.out.println("Adding " + syrupCappuccino.getSyrup());
    }

    public static SyrupCappuccino makeSyrupCappuccino(String name, Intensity intensity, int mlOfMilk, SyrupType syrup) {
        SyrupCappuccino syrupCappuccino = new SyrupCappuccino(name, intensity, mlOfMilk, syrup);

        makeSyrupCappuccinoPrint(syrupCappuccino);

        return syrupCappuccino;
    }
}