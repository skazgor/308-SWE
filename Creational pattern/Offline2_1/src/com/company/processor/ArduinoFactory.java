package com.company.processor;

public class ArduinoFactory extends processorFactory{
    @Override
    public processor createProcessor() {
        return new ArduinoMega();
    }
}
