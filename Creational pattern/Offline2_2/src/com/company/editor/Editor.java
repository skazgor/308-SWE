package com.company.editor;

import com.company.editor.CEnvironment.CFactory;
import com.company.editor.CPPEnvironment.CppFactory;
import com.company.editor.PYenvironment.PYFactory;

public class Editor {
    private static Editor editor=null;
    private EnvironmentFactory environmentFactory=null;
    private Editor(){}
    public static Editor getEditor(){
        if(editor==null){
            System.out.println(" New editor crating.....");
            editor=new Editor();
        }
        else {
            System.out.println("You are already using a Editor");
        }
        return editor;
    }
    public void setEnvironment(String fileExtension){
        if(environmentFactory==null){
            if(fileExtension.equalsIgnoreCase("c")){
                environmentFactory=new CFactory();
            }
            else if(fileExtension.equalsIgnoreCase("cpp")){
                environmentFactory=new CppFactory();
            }
            else if(fileExtension.equalsIgnoreCase("py")){
                environmentFactory=new PYFactory();
            }
            else{
                System.out.println("No such Environment available");
            }
        }
        else{
            System.out.println("You are already in an Environment.close it before opening another");
        }

    }
    void closeEnvironment(){
        environmentFactory=null;
    }
    public Font getFont(){
        return environmentFactory.crateFont();
    }
    public Parser getParser(){
        return environmentFactory.createParser();
    }
}
