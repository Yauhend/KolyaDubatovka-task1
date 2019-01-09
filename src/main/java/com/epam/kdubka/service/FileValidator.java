package com.epam.kdubka.service;

public class FileValidator {
    public String[] validate(String lines) {
        int x = 0;
        String[] stringsHolder = lines.split("\\s");
        try {
            for (String line : stringsHolder) {
                Float.parseFloat(line);
            }
            return stringsHolder;
        } catch (NumberFormatException e) {
            return null;
        }
    }


}








