package com.epam.kdubka.creator;

import java.io.*;
import java.util.ArrayList;


public class ArrayListCreator {
    public ArrayList<Float> readFile() {
        ArrayList<Float> numbers = new ArrayList<>();
        FileValidator linesValidator = new FileValidator();
        String filePath = "/test.txt";
        BufferedReader buff = null;
        String[] stringHolder;

        try {
            buff = new BufferedReader(new InputStreamReader(new FileInputStream(getClass().getResource(filePath).getFile())));
        } catch (FileNotFoundException e) {
            System.out.println("File not found " + filePath);
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println("Null catched");
        }
        String line = null;
        try {
            while ((line = buff.readLine()) != null) {//вот тут что-то с чем-то :)
                boolean result = linesValidator.validate(line);
                if (result == true){
                    stringHolder = line.split(" ");
                    for (String strings: stringHolder) {
                        numbers.add(Float.parseFloat(strings));

                    }
                }



            }
        } catch (IOException e) {
            System.out.println("Возникла ошибка " + e);
        }
        System.out.println(numbers);
        return numbers;
    }
}

