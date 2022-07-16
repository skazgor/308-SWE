package com.company.builder;

import com.company.processor.RaspberryFactory;
import com.company.processor.processorFactory;
import com.company.processor.processor;
import com.company.Display.Display;
import com.company.Display.DisplayFactory;
import com.company.Display.LCDFactory;
import com.company.QueueManagement.Delux;
import com.company.QueueManagement.QueueManage;
import com.company.application.Application;
import com.company.communication.Communication;
import com.company.communication.CommunicationFactory;
import com.company.communication.SimFactory;
import com.company.communication.WIfiFactory;
import com.company.listClass.ListClass;

public class DeluxBuilder implements Builder {
    Delux delux;
    int number;
    String connectionType;
    public DeluxBuilder(int number, String connection){
        delux=new Delux();
        this.number=number;
        connectionType=connection;
    }
    @Override
    public void addDisplay() {
        Display display;
        DisplayFactory factory=new LCDFactory();
        display= factory.crateDisplay();
        delux.add(new ListClass(number,display,300," LCD Display"));
    }

    @Override
    public void createApplication() {
        Application application=new Application();
        delux.add(new ListClass(1,application,700," Control Application"));
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
        delux.add(new ListClass(1,communication,150,(connectionType+" base Connection established")));
    }

    @Override
    public void addProcessor() {
        processor pro;
        processorFactory factory;
        factory=new RaspberryFactory();
        pro= factory.createProcessor();
        delux.add(new ListClass(number,pro,800," Raspberry Pi Processor"));
    }

    @Override
    public QueueManage getPackage() {
        return delux;
    }
}
