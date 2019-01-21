package com.epam.kdubka.service;

import java.util.ArrayList;


public class ActionService {
    public float[] sort(ArrayList<Float> list) {
        float[] floats = new float[list.size()];
        int n = floats.length;
        for (int i = 0; i < list.size(); i++) {
            floats[i] = list.get(i);
        }
        mergeSort(floats, 0, n - 1);
        return floats;
    }

    public static void mergeSort(float[] numbers, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(numbers, low, mid);
            mergeSort(numbers, mid + 1, high);
            merge(numbers, low, mid, high);
        }
    }

    private static void merge(float[] buf, int low, int mid, int high) {
        int n = high - low + 1;
        float[] Temp = new float[n];
        int l = low, j = mid + 1;
        int k = 0;
        while (l <= mid || j <= high) {
            if (l > mid)
                Temp[k++] = buf[j++];
            else if (j > high)
                Temp[k++] = buf[l++];
            else if (buf[l] < buf[j])
                Temp[k++] = buf[l++];
            else
                Temp[k++] = buf[j++];
        }
        for (j = 0; j < n; j++)
            buf[low + j] = Temp[j];
    }


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




