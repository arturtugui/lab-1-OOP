package task3;

import task1.Display;
import java.util.ArrayList;
import java.util.List;

public class Assistant {
    private String assistantName;
    private List<Display> assignedDisplays;

    Assistant(String name){
        this.assistantName = name;
        this.assignedDisplays = new ArrayList<>();
    }

    public void assignDisplay(Display d){
        this.assignedDisplays.add(d);
        System.out.println("Successfully added display \"" + d.getModel() + "\"");
        System.out.println("\n");
    }

    public void assist(){
        if(this.assignedDisplays.size() == 0){
            System.out.println("Comparison impossible. No assigned displays found");
            System.out.println("\n");
            return;
        }

        if(this.assignedDisplays.size() == 1){
            System.out.println("Comparison impossible. Only 1 assigned display found");
            System.out.println("\n");
            return;
        }

        for (int i = 0; i < assignedDisplays.size(); i++) {
            Display d1 = assignedDisplays.get(i);
            for (int j = i + 1; j < assignedDisplays.size(); j++) {
                Display d2 = assignedDisplays.get(j);

                System.out.println("Comparing Display \"" + d1.getModel() + "\" and Display \"" + d2.getModel() + "\"");
                d1.compareWithMonitor(d2);
                System.out.println("\n");
            }
        }
        System.out.println("\n");
    }

    public Display buyDisplay(Display d){
        this.assignedDisplays.remove(d);
        System.out.println("Successfully removed display \"" + d.getModel() + "\"");
        System.out.println("\n");
        return d;
    }
}
