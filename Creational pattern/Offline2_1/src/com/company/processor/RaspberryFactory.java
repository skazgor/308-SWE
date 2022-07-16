package com.company.processor;

public class RaspberryFactory extends processorFactory{

    @Override
    public processor createProcessor() {
        return new RaspberryPi();
    }
}
