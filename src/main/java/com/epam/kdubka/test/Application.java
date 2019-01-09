package com.epam.kdubka.test;


import com.epam.kdubka.service.ActionService;
import com.epam.kdubka.service.ArrayListCreator;

import java.util.ArrayList;

class Application {
    public static void main(String[] args) {
        String filePath = "/test.txt";
        ArrayListCreator scann = new ArrayListCreator();
        ArrayList<Float> numbers = scann.readFile(filePath);
        System.out.println(numbers);
        ActionService action = new ActionService();
        action.sort(numbers);
        float minValue = action.getMin(numbers);
        float maxValue = action.getMax(numbers);
        float middleValue = action.getMiddle(numbers);
        System.out.println(numbers);
        System.out.println("min value is " + minValue);
        System.out.println("max value is " + maxValue);
        System.out.println("middle value is " + middleValue);


    }
}
