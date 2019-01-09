package com.epam.kdubka.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.NoSuchElementException;


public class ActionService {
    public void sort(ArrayList<Float> list) {
        if (list.size() != 0) {
            System.out.println("list sorted ");
            Collections.sort(list);
        } else {
            System.out.println("list cannot be sorted, it is empty!");

        }

    }

    public float getMin(ArrayList<Float> list) {
        try {
            return Collections.min(list);
        } catch (NoSuchElementException e) {
            return 0.0f;
        }

    }

    public float getMax(ArrayList<Float> list) {
        try {
            return Collections.max(list);
        } catch (NoSuchElementException e) {
            return 0.0f;
        }
    }

    public float getMiddle(ArrayList<Float> list) {
        float sum = 0;
        for (float number : list) {
            sum += number;
        }
        sum = sum / list.size();
        return sum;
    }
}


