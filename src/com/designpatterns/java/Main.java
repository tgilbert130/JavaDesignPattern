package com.designpatterns.java;

import com.designpatterns.abstractfactory.*;
import com.designpatterns.adapter.UltraWheel;
import com.designpatterns.adapter.UltraWheelAdapter;
import com.designpatterns.base.NarrowWheel;
import com.designpatterns.base.WheelInterface;
import com.designpatterns.base.WideWheel;

import java.util.ArrayList;
import java.util.List;

public class

Main {

    public static void main(String[] args) {
        abstractFactoryExample();

    }// end Main method

    // private static void builderExample
    private static void abstractFactoryExample() {
        AbstractBikeFactory factory = new RoadBikeFactory();

        BikeFrameInterface frame = factory.createFrame();
        BikeSeatInterface seat = factory.createSeat();

        System.out.println(frame.getFrameParts());
        System.out.println(seat.getSeatParts());
    }


    private static void adapterExample() {
        UltraWheel ultrawheel = new UltraWheel(28);
        List<WheelInterface> wheels = new ArrayList<>();
        wheels.add(new NarrowWheel(24));
        wheels.add(new NarrowWheel(20));
        wheels.add(new WideWheel(24));
        wheels.add(new UltraWheelAdapter(ultrawheel));
        wheels.add(new UltraWheelAdapter(new UltraWheel(26)));
        for (WheelInterface wheel : wheels) {
            System.out.println(wheel);
        }
    }



    private static void singletonExample() {
        System.out.println("Generating Serial Number");
    }


}//end class

