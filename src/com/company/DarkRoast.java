package com.company;

public class DarkRoast extends Beverage {
    SizeType size;
    public DarkRoast(SizeType size) {
        description="DarkRoast "+size;
        this.size=size;
    }

    @Override
    public double cost() {
        if(size.equals(SizeType.Small)){
            return 0.99;
        }else if(size.equals(SizeType.Medium)){
            return 1.99;
        }else{
            return 2.99;
        }

    }
}
