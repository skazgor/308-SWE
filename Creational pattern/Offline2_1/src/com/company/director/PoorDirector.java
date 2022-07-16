package com.company.director;

import com.company.QueueManagement.QueueManage;
import com.company.builder.Builder;

public class PoorDirector extends Director{
    @Override
    public QueueManage instruct(Builder builder) {
        builder.addDisplay();;

        builder.createApplication();
        builder.addProcessor();
        builder.selectCommunication();
        return builder.getPackage();
    }
}
