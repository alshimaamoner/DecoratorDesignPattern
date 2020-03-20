package com.company;

public class Main {

    public static void main(String[] args) {
     Beverage beverage=new Espresso(Beverage.SizeType.Medium);
        System.out.println(beverage.getDescription()+" $"+beverage.cost());
        Beverage beverage2=new DarkRoast(Beverage.SizeType.Large);
        beverage2=new Mocha(beverage2);
        beverage2=new Mocha(beverage2);
        beverage2=new Whip(beverage2);
        System.out.println(beverage2.getDescription()+" $"+beverage2.cost());



    }
}
