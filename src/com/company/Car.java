package com.company;

public class Car {

    static int number = 0;
    String color;
    int maxSpeed;
    double fuelLevel;
    int capacity;
    Button[] buttons;

    public  Car(){
        buttons = new Button[12];
    }

    void honk(){
        System.out.println(" !!!!!!!!!!!!!!!!! ");
    }

    /**
     *
     * Java dock example
     * @param color
     * @return
     */
    public String getDesctiption(String color){
        return  "Car desc: color = "+this.color + " method color" + color;
    }


}
