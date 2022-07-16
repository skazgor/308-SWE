package com.company.director;

import com.company.QueueManagement.QueueManage;
import com.company.builder.Builder;

public class OptimalDirector extends Director{
    @Override
    public QueueManage instruct(Builder builder) {
        builder.addDisplay();
        builder.selectCommunication();
        builder.addProcessor();
        builder.createApplication();

        return builder.getPackage();
    }
}
