package com.company.processor;

public class AtmegaFactory  extends processorFactory{
    @Override
    public processor createProcessor() {
        return new Atmega32();
    }
}
