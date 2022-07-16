package com.company.editor.CPPEnvironment;
import com.company.editor.Font;
import  com.company.editor.EnvironmentFactory;
import com.company.editor.Parser;


public class CppFactory extends EnvironmentFactory{
    public CppFactory(){
        System.out.println(" You are creating Cpp Environment");
    }
    @Override
    protected Font crateFont() {
        return new Monaco();
    }

    @Override
    protected Parser createParser() {
        return new CppParser();
    }
}
