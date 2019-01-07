package com.epam.kdubka.reader;

import java.util.ArrayList;


public class FileReader {
    public ArrayList<Float> reader() {
        String path = "/test.txt";
        FileValidator validator = new FileValidator();
        ArrayList<Float> strings = validator.validator(path);
        System.out.println("Массив " + path + " " + strings);
        return strings;


    }
}

