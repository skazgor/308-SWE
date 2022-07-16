package com.company;

import com.company.QueueManagement.QueueManage;
import com.company.builder.Builder;
import com.company.builder.DeluxBuilder;
import com.company.builder.OptimalBuilder;
import com.company.builder.PoorBuilder;
import com.company.director.DeluxDirector;
import com.company.director.Director;
import com.company.director.OptimalDirector;
import com.company.director.PoorDirector;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        QueueManage queueManage=null;
        Director director;
        Builder builder;
        String string=scanner.next();
        int number= scanner.nextInt();
        String connection=scanner.next();
        if(string.equalsIgnoreCase("delux")){
            builder =new DeluxBuilder(number,connection);
            director =new DeluxDirector();
            queueManage= director.instruct(builder);
        }
        else if(string.equalsIgnoreCase("optimal")){
            builder =new OptimalBuilder(number,connection);
            director =new OptimalDirector();
            queueManage= director.instruct(builder);
        }
        else if(string.equalsIgnoreCase("poor")){

            builder =new PoorBuilder(number,connection);
      director =new PoorDirector();
       queueManage= director.instruct(builder);
        }
        queueManage.showProduct();
    }
}
