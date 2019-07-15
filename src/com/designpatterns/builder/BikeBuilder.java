package com.designpatterns.builder;

import com.designpatterns.abstractfactory.BikeSeatInterface;

public abstract class BikeBuilder {

    public abstract BikeSeatInterface getBike();

    public void buildStreetTires() {
    }

    public void buildWideTires() {
    }

    public void buildHandleBars() {
    }


} //end class
