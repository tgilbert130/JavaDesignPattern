package com.designpatterns.decorator;

import.com.designpatterns.base.AbstractBike;
import com.designpatterns.base.AbstractBike;
import com.designpatterns.base.BikeInterface;


public class AnstractBikeoption extends AbstractBike {

    protected BikeInterface decoratedBike;
    public AnstractBikeoption(BikeInterface bike) {
    super(bike.getwheel());

    this.decoratedBike=bike;
     }
}


}

