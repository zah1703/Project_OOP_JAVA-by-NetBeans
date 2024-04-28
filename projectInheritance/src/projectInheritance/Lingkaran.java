package projectinheritance;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Lingkaran {
    double r;

    //public Lingkaran(){
    //    this.r = 2;
    //}
    
    public Lingkaran(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getDiameter(){
        return 2 * r;
        
    }
    public double getKeliling(){
        return Math.PI * 2 * r;
    }
    
    public double getLuas(){
        return Math.PI * r * r;
    }
    @Override
    public String toString() {
        return "Lingkaran{" + "r=" + r + '}';
    }
    
    
    
}
