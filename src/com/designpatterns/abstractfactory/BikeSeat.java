package com.designpatterns.abstractfactory;

public class BikeSeat implements BikeSeatInterface {
    @Override
    public String getSeatParts(){
        return "Seat Parts for the Mountain Bike.";
    }
}
