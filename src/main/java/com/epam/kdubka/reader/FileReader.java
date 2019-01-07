package com.epam.kdubka.reader;

import com.epam.kdubka.helper.ListHelper;

import java.util.ArrayList;


public class FileReader {
    public void reader(ArrayList<Float> list, String path) {

        ListHelper helper = new ListHelper();
        helper.setPath(path);
        FileValidator validator = new FileValidator();
        ArrayList<Float> strings = validator.validator(path, list);
        System.out.println("Массив " + path + " " + strings);


    }
}

