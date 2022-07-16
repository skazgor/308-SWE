package com.company.builder;

import com.company.Display.Display;
import com.company.Display.DisplayFactory;
import com.company.Display.LEDFactory;
import com.company.application.Application;
import com.company.processor.AtmegaFactory;
import com.company.processor.processor;
import com.company.processor.processorFactory;
import com.company.QueueManagement.Poor;
import com.company.QueueManagement.QueueManage;
import com.company.communication.Communication;
import com.company.communication.CommunicationFactory;
import com.company.communication.SimFactory;
import com.company.communication.WIfiFactory;
import com.company.listClass.ListClass;

public class PoorBuilder implements Builder {
    Poor poor;
    int number;
    String connectionType;
    public PoorBuilder(int number, String connection){
        poor=new Poor();
        this.number=number;
        connectionType=connection;
    }
    @Override
    public void addDisplay() {
        Display display;
        DisplayFactory factory=new LEDFactory();
        display= factory.crateDisplay();
        poor.add(new ListClass(number,display,180,"LED Display"));
    }

    @Override
    public void createApplication() {
        Application application=new Application();
        poor.add(new ListClass(1,application,400,"Control Application"));
    }

    @Override
    public void selectCommunication() {
        Communication communication;
        CommunicationFactory factory=null;
        if(connectionType.equalsIgnoreCase("wifi")){
            factory=new WIfiFactory();
        } else if (connectionType.equalsIgnoreCase("Sim")) {
            factory=new SimFactory();
        }
        communication= factory.createCom();
        poor.add(new ListClass(1,communication,150,(connectionType+" base Connection established")));
    }

    @Override
    public void addProcessor() {
        processor pro;
        processorFactory factory=new AtmegaFactory();
        pro= factory.createProcessor();
        poor.add(new ListClass(number,pro,700,"Atmega32 Processor "));
    }

    @Override
    public QueueManage getPackage() {
        return poor;
    }
}
