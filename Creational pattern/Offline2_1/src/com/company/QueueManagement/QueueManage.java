package com.company.QueueManagement;

import com.company.listClass.ListClass;

import java.util.LinkedList;

public abstract class QueueManage {
     private LinkedList<ListClass> parts;
     public QueueManage(){
         parts=new LinkedList<ListClass>();
     }
     public void add(ListClass part){
         parts.addLast(part);
     }
     public void showProduct(){
         int totalCost=0;
         System.out.println("This are the description with price");
         for (ListClass part:
              parts) {
             System.out.println(part.description+"    " + part.numberUnit+"*"+part.price+"= "+(part.price*part.numberUnit));
             totalCost+=part.price*part.numberUnit;
         }
         System.out.println(" Yearly cost 1000$");
         System.out.println("Total cost:"+ (totalCost+1000));
     }
}
