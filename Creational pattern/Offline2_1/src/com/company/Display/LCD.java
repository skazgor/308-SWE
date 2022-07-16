package com.company.Display;

public class LCD extends Display{

    protected LCD(){
        System.out.println(" Crating LCD Panel......");
    }
    @Override
    protected void aboutMe() {
        System.out.println(" LCD Panel");
    }
}
