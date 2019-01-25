package com.epam.kdubka.service;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.IOException;

public class ArrayListCreator {
    public ArrayList<Float> readFile(String directory) {
        ArrayList<Float> numbers = new ArrayList<>();
        ValidationSerivice linesValidator = new ValidationSerivice();
        BufferedReader buff = null;
        try {
            buff = new BufferedReader(new InputStreamReader(new FileInputStream(getClass().getResource(directory).getFile())));
            String line;
            while ((line = buff.readLine()) != null) {
                numbers.addAll(linesValidator.validate(line));


            }

        } catch (FileNotFoundException e) {
            System.out.println("catched " + e);
        } catch (NullPointerException e) {
            System.out.println("catched " + e);
        } catch (IOException e) {
            System.out.println("catched " + e);
        } finally {
            if (buff != null) {
                try {
                    buff.close();
                } catch (IOException e) {
                    System.out.println("catched " + e);
                }
            }
        }
        return numbers;
    }
}




