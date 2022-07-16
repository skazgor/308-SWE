package com.company.director;

import com.company.QueueManagement.QueueManage;
import com.company.builder.Builder;

public class DeluxDirector extends Director{
    @Override
    public QueueManage instruct(Builder builder) {
        builder.addDisplay();;
        builder.addProcessor();
        builder.createApplication();
        builder.selectCommunication();
        return builder.getPackage();
    }
}
