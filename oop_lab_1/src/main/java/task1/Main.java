package task1;

public class Main {
    public static void main(String[] args) {
        Display m1, m2, m3;
        m1 = new Display(612, 442, 109, "Dell UltraSharp UP2716D");
        m2 = new Display(617, 460, 163, "LG 27UD88-W");
        m3 = new Display(615, 490, 140, "ASUS ROG Swift PG27AQ");

        m1.compareSize(m2);
        m2.compareSize(m3);
        m1.compareSize(m3);
        System.out.println("\n");

        m1.compareSharpness(m2);
        m2.compareSharpness(m3);
        m1.compareSharpness(m3);
        System.out.println("\n");

        m1.compareWithMonitor(m2);
        m2.compareWithMonitor(m3);
        m1.compareWithMonitor(m3);
    }
}
