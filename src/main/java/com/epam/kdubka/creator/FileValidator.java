package com.epam.kdubka.creator;

public class FileValidator {
    public boolean validate(String lines) {
        String[] stringsHolder = lines.split(" ");

        try {
            for (String line : stringsHolder ) {
            Float.parseFloat(line);
            }
            return true;

        } catch (NumberFormatException e) {
            return false;
        }
    }


}








