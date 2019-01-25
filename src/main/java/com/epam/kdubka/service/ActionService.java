package com.epam.kdubka.service;

import java.util.ArrayList;


public class ActionService {
    public float getMin(ArrayList<Float> list) {
        try {
            float min = list.get(0);
            float max = list.get(0);

            for (Float i : list) {
                if (i < min)
                    min = i;
                if (i > max)
                    max = i;
            }
            return min;
        } catch (IndexOutOfBoundsException e) {
            return 0f;
        }
    }

    public float getMax(ArrayList<Float> list) {
        try {
            float min = list.get(0);
            float max = list.get(0);

            for (Float i : list) {
                if (i < min)
                    min = i;
                if (i > max)
                    max = i;
            }
            return max;
        } catch (IndexOutOfBoundsException e) {
            return 0.0f;
        }
    }

    public float getMiddle(ArrayList<Float> list) {
        float sum = 0;
        for (float number : list) {
            sum += number;
        }
        return sum / list.size();
    }
}




