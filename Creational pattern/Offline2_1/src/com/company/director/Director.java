package com.company.director;

import com.company.QueueManagement.QueueManage;
import com.company.builder.Builder;

public abstract class Director {
    public abstract QueueManage instruct(Builder builder);
}
