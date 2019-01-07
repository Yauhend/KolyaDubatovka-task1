package com.epam.kdubka.main;


import com.epam.kdubka.func.Actions;
import com.epam.kdubka.reader.FileReader;

import java.util.ArrayList;

 class Test {
    public static void main(String[] args) {
        FileReader sc = new FileReader();
        ArrayList<Float> numbers = sc.reader();
        Actions act = new Actions();
        act.sort(numbers);
        act.min(numbers);
        act.max(numbers);
        act.middle(numbers);
    }
}
