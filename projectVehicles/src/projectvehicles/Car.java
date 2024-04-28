/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectvehicles;

/**
 *
 * @author ASUS
 */
public class Car extends Vehicle{
    private String type;
    private int wheels;
    private int doors;
//    int gears;
    private boolean isManual;
    int currentGear;

    public Car(String type,int wheels,  int doors, int gears, boolean isManual, String name) {
        super(name);
        this.wheels = wheels;
        this.type = type;
        this.doors = doors;
//        this.gears = gears;
        this.isManual = isManual;
        currentGear = 1;
    }
    public void changeGear(int newGear){
        this.currentGear= newGear;
        System.out.println("changed to" + this.currentGear + "gear");
    }
    public void changeSpeed (int newSpeed, int newDirection){
        move(newSpeed,newDirection);
        System.out.println("speed: " + newSpeed + "direction:" + newDirection);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

//    public int getGears() {
//        return gears;
//    }
//
//    public void setGears(int gears) {
//        this.gears = gears;
//    }

    public boolean isIsManual() {
        return isManual;
    }

    public void setIsManual(boolean isManual) {
        this.isManual = isManual;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }
    
}
