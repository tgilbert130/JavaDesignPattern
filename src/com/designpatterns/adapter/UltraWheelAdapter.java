package com.designpatterns.adapter;

import com.designpatterns.base.AbstractWheel;

public class UltraWheelAdapter extends AbstractWheel {
    public UltraWheelAdapter(UltraWheel ultrawheel) {
        super(ultrawheel.getWheelSize(), false);
    }
}
