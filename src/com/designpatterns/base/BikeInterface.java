package com.designpatterns.base;

import com.designpatterns.java.BikeColor;

public interface BikeInterface {
    WheelInterface getwheel();
    BikeColor getColor();
float getPrice();
    void paint(BikeColor color);

}
