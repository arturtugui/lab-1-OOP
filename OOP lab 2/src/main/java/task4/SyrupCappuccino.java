package task4;

import enums.Intensity;
import enums.SyrupType;
import task4_v2_proper_typeCasting.Cappuccino;

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
        super.printDetails(); //of cappucino
        System.out.println("Syrup type: " + getSyrup() + " mg");
    }

    public static SyrupCappuccino makeSyrupCappuccino(String name, Intensity intensity, int mlOfMilk, SyrupType syrup) {
        SyrupCappuccino syrupCappuccino = new SyrupCappuccino(name, intensity, mlOfMilk, syrup);

        System.out.println("\nMaking: " + syrupCappuccino.getName());
        System.out.println("Intensity set to " + syrupCappuccino.getIntensity());
        System.out.println("Adding " + syrupCappuccino.getMlOfMilk() + " mls of milk");
        System.out.println("Adding " + syrupCappuccino.getSyrup());

        return syrupCappuccino;
    }
}