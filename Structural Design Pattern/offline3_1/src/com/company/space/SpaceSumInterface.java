package com.company.space;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface SpaceSumInterface {
    void about();
    int calculateSum(String fileName) throws IOException;
}
