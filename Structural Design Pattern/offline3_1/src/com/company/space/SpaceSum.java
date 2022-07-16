package com.company.space;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SpaceSum implements SpaceSumInterface{
    @Override
    public void about() {
        System.out.println("This is space separated integer sum class...");
    }

    @Override
    public int calculateSum(String fileName) throws FileNotFoundException {
        File file =new File(fileName);
        System.out.println(fileName);
        Scanner scanner=new Scanner(file);
        int sum=0;
        while(scanner.hasNextInt()){
            sum=sum+ scanner.nextInt();
        }
        return sum;
    }
}
