package com.company;

public class GradeCalculation {
    public enum credit {three,four}
    public static String gradeCalculation(String mark,credit cre){
        String s=null;
        double markDouble;
        try{
            markDouble=Double.parseDouble(mark);
        }catch (NumberFormatException e){
            return "Non Number input";
        }
        int intMark = (int) Math.round(markDouble);
        switch (cre){
            case three ->{
                if(intMark<0 | intMark>300){
                    s="Invalid Number";
                }
                else if(intMark<180){
                    s="F";
                }
                else if(intMark<210){
                    s="C";
                }
                else if(intMark<240){
                    s="B";
                }
                else s="A";
                break;
            }
            case four -> {
                if(intMark<0 | intMark>400){
                    s="Invalid Number";
                }
                else if(intMark<240){
                    s="F";
                }
                else if(intMark<280){
                    s="C";
                }
                else if(intMark<320){
                    s="B";
                }
                else s="A";
            }
        }
         return s;
    }
}
