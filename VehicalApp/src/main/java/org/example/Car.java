package org.example;

public class Car extends Vehical {
    private  int wheel;
    private String type;
    private int door;
    private int gear;
    private boolean manual;
    private int currentGear;

    public Car(String name , int wheel , int door , int gear, boolean manual, String type){
        super(name);
        this.type=type;
        this.gear = gear;
        this.door = door;
        this.wheel = wheel;
        this.manual = manual;
        currentGear = 1; //default value
    }

    public void changeGear(int newGear){
        this.currentGear = newGear;
        System.out.println("change gear method called : Changed to "+this.currentGear+ "gear");

    }
    public void  changeSpeed(int newSpeed , int newDirection)
    {
       move(newSpeed , newDirection);
        System.out.println("change speed method called: change to  "+newSpeed+ "direction is "+newDirection);


    }

}
