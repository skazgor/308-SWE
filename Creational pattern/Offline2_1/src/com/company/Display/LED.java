package com.company.Display;

public class LED extends Display{
    protected LED(){
        System.out.println(" LED screen crating ......");
    }
    @Override
    protected void aboutMe() {
        System.out.println(" LED Display");
    }
}
