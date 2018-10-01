package test.com.ci1330.ecci.ucr.ac.cr;

public class Wheel {

    public Rim rim;

    public Wheel() {
    }

    public Wheel(Rim rim) {
        this.rim = rim;
    }

    public void defaultInitMethod(){
        System.out.println("Printing default init method for test.com.ci1330.ecci.ucr.ac.cr.Wheel");
    }

    public void defaultDestroyMethod(){
        System.out.println("Printing default destroy method for test.com.ci1330.ecci.ucr.ac.cr.Wheel");
    }

    public void setRim(Rim rim) {
        this.rim = rim;
    }

    public Rim getRim() {
        return rim;
    }
}
