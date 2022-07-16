package com.company.communication;

public class SimFactory extends CommunicationFactory{
    @Override
    public Communication createCom() {
        return new Sim();
    }
}
