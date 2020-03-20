package com.company;

public class Espresso extends Beverage {
  SizeType size;
  public  Espresso(SizeType size){
        description="Espersso "+size;
        this.size=size;

    }


  @Override
    public double cost() {
    if(size.equals(SizeType.Small)){
      return 1.99;
    }else if(size.equals(SizeType.Medium)){
      return 2.99;
    }else{
      return 3.99;
    }

    }
}
