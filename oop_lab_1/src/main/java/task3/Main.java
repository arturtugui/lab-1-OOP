package task3;
import task1.Display;

public class Main {
    public static void main(String[] args) {
        Display m1 = new Display(612, 442, 109, "Dell UltraSharp UP2716D");
        Display m2 = new Display(617, 460, 163, "LG 27UD88-W");
        Display m3 = new Display(615, 490, 140, "ASUS ROG Swift PG27AQ");
        Display m4 = new Display(608, 396, 138, "BenQ PD3200U");
        Display m5 = new Display(614, 409, 160, "Samsung U28E590D");

        Assistant assistant = new Assistant("Connor");

        assistant.assist();
        assistant.assignDisplay(m1);

        assistant.assist();
        assistant.assignDisplay(m2);

        assistant.assignDisplay(m3);
        assistant.assignDisplay(m4);
        assistant.assignDisplay(m5);
        assistant.assist();

        assistant.buyDisplay(m5).showDisplay();
    }
}
