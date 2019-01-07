package com.epam.kdubka.reader;

import java.io.*;
import java.util.ArrayList;

public class FileValidator {

    public ArrayList<Float> validator(String Directory, ArrayList<Float> list)  {
        BufferedReader buff = null;
        String [] stringholder;

        try {
            buff = new BufferedReader(new InputStreamReader(new FileInputStream(getClass().getResource("test.txt").getFile())));
        } catch (FileNotFoundException e) {
            System.out.println("Не удается найти файл " + Directory);
            e.printStackTrace();
        }catch (NullPointerException e){
            System.out.println("Null catched ");
        }
        String line = null;

        try {
            while ((line = buff.readLine()) != null) {
                stringholder = line.split("[#$%а-яА-Яa-zA-Z@^&?!,:();{}.*~<>\\s]+");
                for (String strings : stringholder){
                   list.add(Float.parseFloat(strings));
                }

            }
            }catch (IOException e){
            System.out.println("Возникла ошибка " + e);
        }

          return list;
        }
}




