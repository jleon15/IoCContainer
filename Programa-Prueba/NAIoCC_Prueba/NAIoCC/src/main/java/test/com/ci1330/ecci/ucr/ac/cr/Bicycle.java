package test.com.ci1330.ecci.ucr.ac.cr;

public class Bicycle {
    private Wheel firstWheel;
    private Wheel secondWheel;

    public Bicycle(){}

    public void setFirstWheel(Wheel firstWheel) {
        this.firstWheel = firstWheel;
    }

    public void setSecondWheel(Wheel secondWheel) {
        this.secondWheel = secondWheel;
    }

    public Wheel getFirstWheel() {
        return firstWheel;
    }

    public Wheel getSecondWheel() {
        return secondWheel;
    }

    public void defaultInitMethod(){
        System.out.println("Printing default init method for test.com.ci1330.ecci.ucr.ac.cr.Bicycle");
    }

    public void defaultDestroyMethod(){
        System.out.println("Printing default destroy method for test.com.ci1330.ecci.ucr.ac.cr.Bicycle");
    }
}
