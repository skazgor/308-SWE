package com.company.editor.CEnvironment;
import com.company.editor.Font;
import  com.company.editor.EnvironmentFactory;
import com.company.editor.Parser;

public class CFactory extends EnvironmentFactory {

    public CFactory(){
        System.out.println(" You are creating C Environment");
    }
    @Override
    protected Font crateFont() {
        return new CourierNew();
    }

    @Override
    protected Parser createParser() {
        return new CParser();
    }
}
