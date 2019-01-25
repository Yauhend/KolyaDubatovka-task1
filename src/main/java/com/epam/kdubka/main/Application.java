package com.epam.kdubka.main;

import com.epam.kdubka.service.ActionService;
import com.epam.kdubka.service.ArrayListCreator;
import com.epam.kdubka.service.MergeSort;
import java.util.ArrayList;
import java.util.Arrays;

class Application {
    public static void main(String[] args) {
        String filePath = "/files/test.txt";
        ArrayListCreator creator = new ArrayListCreator();
        ActionService action = new ActionService();
        MergeSort sorter = new MergeSort();
        ArrayList<Float> numbers = creator.readFile(filePath);
        System.out.println("Created list is "+ numbers);
        System.out.println("Sorted list is " + Arrays.toString((sorter.sort(numbers))));
        float minValue = action.getMin(numbers);
        float maxValue = action.getMax(numbers);
        float middleValue = action.getMiddle(numbers);
        System.out.println("min value is " + minValue);
        System.out.println("max value is " + maxValue);
        System.out.println("middle value is " + middleValue);


    }
}
