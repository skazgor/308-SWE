package com.company.communication;

public class WIfiFactory extends CommunicationFactory{
    @Override
    public Communication createCom() {
        return new Wifi();
    }
}
