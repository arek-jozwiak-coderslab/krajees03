package com.company;

public class Main {

    public static void main(String[] args) {
        Car passat = new Car();
        Car seicento = new Car();
        Car aston = new Car();
        aston.color = "red";
        aston.maxSpeed = 200;
        seicento.capacity = 12;
        aston.capacity = 4;

        Button b1 = new Button();
        Button[] buttonsAston = new Button[2];
        buttonsAston[0] = b1;

        aston.buttons = buttonsAston;

        aston.honk();


        String desc = aston.getDesctiption("black");
        System.out.println(desc);


    }
}
