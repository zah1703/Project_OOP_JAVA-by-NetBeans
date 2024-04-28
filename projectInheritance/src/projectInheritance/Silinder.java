/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectinheritance;

/**
 *
 * @author ASUS
 */
public class Silinder extends Lingkaran{
    private double t;

    public Silinder(double t) {
        super(2);
        this.t = t;
    }

    public Silinder(double t, double r) {
        super(r);
        this.t = t;
    }

    public double getT() {
        return t;
    }

    public void setT(double t) {
        this.t = t;
    }

    @Override
    public double getLuas() {
        return 2 * super.getLuas() + t * super.getKeliling(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    public double getVolume(){
        return t * super.getLuas();
    }

    @Override
    public String toString() {
        return "Silinder{" + "t="+ t + "r=" + this.r + '}'; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

}
