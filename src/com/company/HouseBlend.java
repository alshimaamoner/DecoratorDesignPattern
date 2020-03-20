package com.company;

public class HouseBlend extends Beverage {
    SizeType size;

    public HouseBlend(SizeType size){
        description="HouseBlend "+size;
        this.size=size;
    }
    @Override
    public double cost() {
        if(size.equals(SizeType.Small)){
            return 0.89;
        }else if(size.equals(SizeType.Medium)){
            return 1.89;
        }else{
            return 2.89;
        }

    }
}
