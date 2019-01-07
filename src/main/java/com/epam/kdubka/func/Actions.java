package com.epam.kdubka.func;

import java.util.ArrayList;
import java.util.Collections;

public class Actions {
    public void sort(ArrayList<Float> list) {
        System.out.println("\nСортировка массива ");
        Collections.sort(list);

    }

    public float getMin(ArrayList<Float> list) {
        return list.get(0);

    }

    public float getMax(ArrayList<Float> list) {
        return list.get(list.size() - 1);

    }

    public float getMiddle(ArrayList<Float> list) {
        float sum = 0;
        for (float number : list) {
            sum = +number;
        }
        sum = sum / list.size();
        return sum;

    }
}
