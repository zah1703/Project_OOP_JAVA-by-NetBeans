 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectvehicles;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args){
        
        SUV fortuner = new SUV("fortuner", false);
        fortuner.move(40, 0);
        fortuner.accelerate(20);
//        fortuner.accelerate(-60);
        System.out.println("Current Gear: " + fortuner.getCurrentGear());
        System.out.println("Current Speed: " + fortuner.getCurrentSpeed());
    }
}

