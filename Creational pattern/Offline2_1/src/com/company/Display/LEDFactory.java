package com.company.Display;

public class LEDFactory extends DisplayFactory{
    @Override
    public Display crateDisplay() {
        return new LED();
    }
}
