/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectvehicles;

/**
 *
 * @author ASUS
 */
public class Vehicle {

    private String name;
    private int currentSpeed;
    private int currentDirection;

    public Vehicle(String name, int currentSpeed, int currentDirection) {
        this.name = name;
        this.currentSpeed = currentSpeed;
        this.currentDirection = currentDirection;
    }
    public Vehicle(String name) {
        this.name = name;
        this.currentSpeed= 0;
        this.currentDirection=0;
    }
    
    public void steer( int direction){
        this.currentDirection += direction;
        System.out.println("Steering at " + currentDirection + "degrees");
    }
    public void move(int speed, int direction){
        currentSpeed = speed;
        currentDirection = direction;
        System.out.println("moving at " + currentSpeed + "in direction" + currentDirection);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }
    public void stop(){
        this.currentSpeed=0;
        System.out.println("Mesin berhenti");
    }
}
