package com.company.Display;

public class LCDFactory extends DisplayFactory {
    @Override
    public Display crateDisplay() {
        return new LCD();
    }
}
