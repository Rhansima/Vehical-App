package org.example;

public class Vehical {
    private String name;
    private int currentSpeed;
    private int currentDirection;

    public Vehical(String name) {
        this.name = name;
        this.currentSpeed = 0;
        this.currentDirection = 0;
    }

    //method
    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("steer method called : Steering at " +currentDirection+ "degrees.");

    }

    public void move(int speed , int direction){
        this.currentSpeed = speed;
        this.currentDirection = direction;
        System.out.println("move method called  : Moving at "+currentSpeed+ "In direction "+currentDirection);

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
        this.currentSpeed = 0;
    }
}
