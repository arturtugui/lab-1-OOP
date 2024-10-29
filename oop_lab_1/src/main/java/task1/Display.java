package task1;

public class Display {
    private int width;
    private int height;
    private int ppi;
    private String model;

    //constructor
    public Display(int width, int height, int ppi, String model) {
        this.width = width;
        this.height = height;
        this.ppi = ppi;
        this.model = model;
    }

    //setters and getters
    public void setWidth(int width) {
        this.width = width;
    }
    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public int getHeight() {
        return height;
    }

    public void setPpi(int ppi) {
        this.ppi = ppi;
    }
    public int getPpi() {
        return ppi;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }

    //methods
    public void compareSize(Display m){
        float thisArea = this.getWidth() * this.getHeight();
        float otherArea = m.getWidth() * m.getHeight();

        if(thisArea > otherArea){
            System.out.println("The size of the display \"" + this.getModel() + "\" is greater than the size of the display \"" + m.getModel() + "\"");
        }
        else if(thisArea < otherArea){
            System.out.println("The size of the display \"" + this.getModel() + "\" is smaller than the size of the display \"" + m.getModel() + "\"");
        }
        else {
            System.out.println("The displays \"" + this.getModel() + "\" and \"" + m.getModel() + "\" are the same size");
        }
    }

    public void compareSharpness(Display m){

        if(this.getPpi() > m.getPpi()){
            System.out.println("The display \"" + this.getModel() + "\" is sharper than the display \"" + m.getModel() + "\"");
        }
        else if(this.getPpi() < m.getPpi()){
            System.out.println("The display \"" + this.getModel() + "\" is less sharper than the display \"" + m.getModel() + "\"");
        }
        else {
            System.out.println("The displays \"" + this.getModel() + "\" and \"" + m.getModel() + "\" have the same sharpness");
        }
    }

    public void compareWithMonitor(Display m){
        this.compareSize(m);
        this.compareSharpness(m);
    }

    //showing
    public void showDisplay(){
        System.out.println("Characteristics of the display \"" + this.getModel() + "\":");
        System.out.println("\t Size: " + this.getWidth()+ " x " + this.getHeight() + " cm");
        System.out.println("\t Pixels per inch: " + this.getPpi());
        System.out.println("\n");
    }

}
