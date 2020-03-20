package com.company;

public class Decaf extends Beverage {
    SizeType size;
    public Decaf(SizeType size) {
        description="Decaf "+size;
        this.size=size;
    }

    @Override
    public double cost()
    {
        if(size.equals(SizeType.Small)){
            return 1.05;
        }else if(size.equals(SizeType.Medium)){
            return 2.05;
        }else{
            return 3.05;
        }

    }
}
