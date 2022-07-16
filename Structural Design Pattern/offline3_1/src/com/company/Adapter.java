package com.company;

import com.company.space.SpaceSumInterface;
import com.company.tilde.TildeSumInterface;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Adapter implements SpaceSumInterface {
    TildeSumInterface tildeSum;
    public Adapter(TildeSumInterface tildeSum){
        this.tildeSum=tildeSum;
    }
    @Override
    public void about() {
        tildeSum.about();
    }

    @Override
    public int calculateSum(String fileName) throws IOException {
        return tildeSum.calculateSum(fileName);
    }
}
