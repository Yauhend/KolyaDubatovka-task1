package com.epam.kdubka.main;


import com.epam.kdubka.func.Actions;
import com.epam.kdubka.reader.FileReader;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<Float> numbers = new ArrayList<>();
        String path = "test";
        FileReader sc = new FileReader();
        sc.reader(numbers, path);
        Actions act = new Actions();
        act.sort(numbers, path);
        act.min(numbers, path);
        act.max(numbers, path);
        act.middle(numbers, path);
    }
}
