package com.company.editor.PYenvironment;
import com.company.editor.Font;
import  com.company.editor.EnvironmentFactory;
import com.company.editor.Parser;
public class PYFactory extends EnvironmentFactory {
    public PYFactory(){
        System.out.println(" You are creating Py Environment");
    }
    @Override
    protected Font crateFont() {
        return new Consolas();
    }

    @Override
   protected Parser createParser() {
        return new PyParser();
    }
}
