package com.designpatterns.builder;

import com.designpatterns.abstractfactory.BikeSeatInterface;

public class RoadBikeBuilder extends BikeBuilder {


        private RoadBike bikeInProgress;
        this.bikeInProgess=bike;
        @Override
        public BikeInterfacegetBike() {
            return bikeInProgess;
        }

    @Override
    public BikeSeatInterface getBike() {
        return bikeInProgress;

    @Override
            public void buildhandleBars(){
        System.out.println("Building Handle Bars");


        Override
                public void buildwideTires(){
            System.out.println("Building Wide Tires");
            }
        }// end class
}
