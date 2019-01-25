package com.epam.kdubka.service;

import java.util.ArrayList;

public class MergeSort {
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
}
