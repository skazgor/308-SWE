package com.company;
import com.company.editor.Parser;
import com.company.editor.Editor;
import com.company.editor.Font;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String line = scanner.next();
        String[] string = line.split("[.]");
        Editor editor=Editor.getEditor();
        editor.setEnvironment(string[1]);
        Parser parser= editor.getParser();
        Font font= editor.getFont();
        parser.parse();
        font.font();
    }
}
