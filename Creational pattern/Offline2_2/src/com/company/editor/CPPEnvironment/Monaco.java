package com.company.editor.CPPEnvironment;

import com.company.editor.Font;

public class Monaco implements Font {
    @Override
    public void font() {
        System.out.println("Selected Font: Monaco");
    }

    @Override
    public String toString() {
        return "Monaco";
    }
}
