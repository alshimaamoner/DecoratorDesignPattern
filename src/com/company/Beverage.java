package com.company;

public abstract class Beverage {
    enum SizeType{Small,Medium,Large}
    String description="UnKnown Beverage";
    String size="Non";
    public String getDescription(){
        return description;
    }
    public String getSize(){
        return size;
    }
    public abstract double cost();
}
