package com.company.builder;

import com.company.processor.ArduinoFactory;
import com.company.processor.processor;
import com.company.processor.processorFactory;
import com.company.Display.Display;
import com.company.Display.DisplayFactory;
import com.company.Display.LEDFactory;
import com.company.QueueManagement.Optimal;
import com.company.QueueManagement.QueueManage;
import com.company.application.Application;
import com.company.communication.Communication;
import com.company.communication.CommunicationFactory;
import com.company.communication.SimFactory;
import com.company.communication.WIfiFactory;
import com.company.listClass.ListClass;

public class OptimalBuilder implements Builder{
   Optimal optimal;
    int number;
    String connectionType;
    public OptimalBuilder(int number, String connection){
        optimal=new Optimal();
        this.number=number;
        connectionType=connection;
    }
    @Override
    public void addDisplay() {
        Display display;
        DisplayFactory factory=new LEDFactory();
        display= factory.crateDisplay();
        optimal.add(new ListClass(number,display,180,"LED Display"));
    }

    @Override
    public void createApplication() {
        Application application=new Application();
        optimal.add(new ListClass(1,application,400,"Control Application"));
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
        optimal.add(new ListClass(1,communication,150,(connectionType+" base Connection established")));
    }

    @Override
    public void addProcessor() {
        processor pro;
        processorFactory factory=new ArduinoFactory();
        pro= factory.createProcessor();
        optimal.add(new ListClass(number,pro,700,"Arduino Mega Processor"));
    }

    @Override
    public QueueManage getPackage() {
        return optimal;
    }
}
