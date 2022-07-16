package com.company.tilde;

import com.company.space.SpaceSum;
import com.company.space.SpaceSumInterface;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TildeSum implements TildeSumInterface{
    @Override
    public void about() {
        System.out.println("This is tilde separated integer sum class...");
    }

    @Override
    public int calculateSum(String filename) throws IOException {
        int sum=0;
        File file =new File(filename);
        FileWriter fileWriter=new FileWriter("F:\\3-1\\SE\\Lab\\offline3_1\\src\\output.txt");
        Scanner scanner=new Scanner(file);
       while(scanner.hasNextLine()){
           String string =scanner.nextLine();
           String[] strings=string.split("~");
           for (String s:
                   strings) {
               int number =Integer.parseInt(s);
               fileWriter.write(Integer.toString(number));
               fileWriter.write(" ");
               fileWriter.flush();
           }
       }
        fileWriter.close();
        SpaceSumInterface spaceSum=new SpaceSum();

        return spaceSum.calculateSum("F:\\3-1\\SE\\Lab\\offline3_1\\src\\output.txt");
    }
}
