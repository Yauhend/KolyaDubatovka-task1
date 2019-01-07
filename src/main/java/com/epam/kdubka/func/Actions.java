package com.epam.kdubka.func;

import java.util.ArrayList;
import java.util.Collections;

public class Actions {
    public void sort(ArrayList<Float> list) {
        System.out.println("\nСортировка массива " );
        Collections.sort(list);
        System.out.println(list + "\n");

    }

    public void min(ArrayList<Float> list) {
        System.out.println("max value is " + list.get(0) + "\n");

    }

    public void max(ArrayList<Float> list) {
        System.out.println("minimum value is " + list.get(list.size() - 1));

    }

    public void middle(ArrayList<Float> list) {
        float sum = 0;
        for (float number : list) {
            sum = +number;
        }
        sum = sum / list.size();
        System.out.println("sum of array elements is " + sum);
        ;
    }
}
