package test.com.ci1330.ecci.ucr.ac.cr;

import test.com.ci1330.ecci.ucr.ac.cr.Brand;

public class Rim {
    private Brand brand;

    public Rim(){}

    public Rim(Brand brand) {
        this.brand = brand;
    }

    public Brand getBrand() {
        return brand;
    }

    public void defaultInitMethod(){
        System.out.println("Printing default init method for test.com.ci1330.ecci.ucr.ac.cr.Rim");
    }

    public void defaultDestroyMethod(){
        System.out.println("Printing default destroy method for test.com.ci1330.ecci.ucr.ac.cr.Rim");
    }
}
