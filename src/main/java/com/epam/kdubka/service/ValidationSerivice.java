package com.epam.kdubka.service;

import java.util.ArrayList;

public class ValidationSerivice {

    public boolean validate(String line) {
        String[] stringsHolder = line.split("\\s");
        ArrayList<Float> numbers = new ArrayList<>(stringsHolder.length);
        try {
            for (String element : stringsHolder) {
                numbers.add(Float.parseFloat(element));
            }
            return true;
        } catch (NumberFormatException e) {
            System.out.println("invalid line is" + line);
            return false;
        }
    }
}












