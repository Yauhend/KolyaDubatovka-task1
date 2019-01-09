package com.epam.kdubka.service;

import java.io.*;
import java.util.ArrayList;


public class ArrayListCreator {
    public ArrayList<Float> readFile(String directory) {
        ArrayList<Float> numbers = new ArrayList<>();
        FileValidator linesValidator = new FileValidator();

        try {
            BufferedReader buff = new BufferedReader(new InputStreamReader(new FileInputStream(getClass().getResource(directory).getFile())));
            String line;
            while ((line = buff.readLine()) != null) {
                String[] stringHolder = linesValidator.validate(line);
                if (stringHolder != null) {
                    for (String strings : stringHolder) {
                        numbers.add(Float.parseFloat(strings));
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("catched " + e);
        } catch (IOException e) {
            System.out.println(e.getCause());
        }
        return numbers;
    }
}

