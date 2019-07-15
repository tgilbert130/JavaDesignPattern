package com.designpatterns.abstractfactory;

public class RoadBikeFactory extends AbstractBikeFactory {
    @Override
    BikeFrameInterface createFrame() {
        return new RoadFrame();
    }

    @Override
    BikeSeatInterface createSeat() {
        return new RoadSeat();
    }
}
