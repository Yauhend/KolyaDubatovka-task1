package com.epam.kdubka.main;


import com.epam.kdubka.func.Actions;
import com.epam.kdubka.creator.ArrayListCreator;

import java.util.ArrayList;

class Test {
    public static void main(String[] args) {
        ArrayListCreator scann = new ArrayListCreator();
        ArrayList<Float> numbers = scann.readFile();
        Actions act = new Actions();
        act.sort(numbers);

        float minValue = act.getMin(numbers);
        float maxValue = act.getMax(numbers);
        float middleValue = act.getMiddle(numbers);
        System.out.println(numbers);
        System.out.println("min value is " + minValue);
        System.out.println("max value is " + maxValue);
        System.out.println("middle value is " + middleValue);


    }
}
