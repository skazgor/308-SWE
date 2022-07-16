package com.company;

import com.company.space.SpaceSum;
import com.company.space.SpaceSumInterface;
import com.company.tilde.TildeSum;
import com.company.tilde.TildeSumInterface;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        TildeSumInterface tildeSum=new TildeSum();
        SpaceSumInterface spaceSum;
        spaceSum=new Adapter(tildeSum);
        spaceSum.about();
       int number= spaceSum.calculateSum("F:\\3-1\\SE\\Lab\\offline3_1\\input.txt");
        System.out.println("Sum :"+ number);
    }
}
