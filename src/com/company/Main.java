package com.company;

public class Main {

    public static void main(String[] args) {
//        Cat cat = new Cat();
//        System.out.println(cat.getColor());
//        System.out.println(cat.getLegs());
//        System.out.println(cat.isFur());

        Pencil pencil = new Pencil(.7,"papermate",true,"yellow",true);
        Pencil pencil1 = new Pencil(.8,"Dixon",false,"Black",true);

        System.out.println("This is pencil:" + pencil.getColor());
        System.out.println("This is pencil 1:" + pencil1.getColor());



    }
}
