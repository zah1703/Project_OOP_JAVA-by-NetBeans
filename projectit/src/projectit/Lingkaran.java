/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectit;

/**
 *
 * @author Zahrotul Hidayah
 */

public class Lingkaran {
    private int r;

    public Lingkaran() {
        this.r = 2;
    }

    public Lingkaran(int r){
        this.r = r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public double getLuas(){
        return Math.PI * r * r;
    }

    public double getKeliling(){
        return Math.PI * 2 * r;
    }    

    @Override
    public String toString() {
        return "Lingkaran{" + "r=" + r + '}';
    }
    
}