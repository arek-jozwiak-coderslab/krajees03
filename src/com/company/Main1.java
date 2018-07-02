package com.company;

public class Main1 {

    public static void main(String[] args) {
        Cat c1 = new Cat();
        Cat c2 = new Cat();
        System.out.println(c1.publicId);

        c1.setId(Cat.number);

        Cat.number++;
        c2.setId(Cat.number);

        c1.setName("Puszek").setOwnerName("Arek");
        c2.setName("Puszek");
        c2.setOwnerName("Arek");

        System.out.println(c1==c2);
        System.out.println(c1.getName().equals(c2.getName()));


        System.out.println("cat 1 " + c1.getId());
        System.out.println("cat 2 " + c2.getId());
        System.out.println(c1);
    }
}
