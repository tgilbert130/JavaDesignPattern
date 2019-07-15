package com.designpatterns.builder;

import com.designpatterns.base.BikeInterface;

public class MountainBikeDirector extends BikeDirector{


}@Override
public BikeInterface build(BikeBuilder builder) {
    builder.buildHandlebars();
    builder.buildwideTires();
    return builder.getBike();
}//end method
}//end class


