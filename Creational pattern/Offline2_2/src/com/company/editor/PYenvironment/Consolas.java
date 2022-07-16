package com.company.editor.PYenvironment;
import com.company.editor.Font;
public class Consolas implements Font{
    @Override
    public void font() {
        System.out.println("Selected Font: Consolas");
    }

    @Override
    public String toString() {
        return "Consolas";
    }
}
