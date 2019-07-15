package com.designpatterns.builder;

import com.designpatterns.base.BikeInterface;

public class RoadBikeDirector extends BikeDirector {


    @Overide
    public BikeInterface build(BikeBuilder builder) {
        builder.buildHandleBars();
        builder.buildStreetTires();
        rerurn builder.getBike();
    }//end method
} //end class

