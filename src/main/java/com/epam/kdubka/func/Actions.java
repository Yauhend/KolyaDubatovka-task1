package com.epam.kdubka.func;

import java.util.ArrayList;
import java.util.Collections;

public class Actions {
    public void sort(ArrayList<Float> list, String listname) {
        System.out.println("\nСортировка массива " + listname);
        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(500, 3);
                System.out.print("**");
            }
            System.out.println("");
        } catch (InterruptedException e) {
            System.out.println("Возникла ошибка + " + e);
            e.printStackTrace();
        }

        Collections.sort(list);
        System.out.println(list + "\n");

    }

    public void min(ArrayList<Float> list, String listname) {
        System.out.println("Находим minимальное значение массива");
        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(500, 3);
                System.out.print("**");
            }
            System.out.println("");
        } catch (InterruptedException e) {
            System.out.println("Возникла ошибка + " + e);
            e.printStackTrace();
        }

        System.out.println("min is " + list.get(0) + "\n");

    }

    public void max(ArrayList<Float> list, String listname) {
        System.out.println("Находим maxимальное значение массива");
        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(500, 3);
                System.out.print("**");
            }
            System.out.println("");
        } catch (InterruptedException e) {
            System.out.println("Возникла ошибка + " + e);
            e.printStackTrace();
        }

        System.out.println("max is " + list.get(list.size() - 1));

    }
    public void middle(ArrayList<Float> list, String listname) {
        float sum = 0;
        System.out.println("Находим среднее значение массива");
        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(500, 3);
                System.out.print("**");
            }
            System.out.println("");
        } catch (InterruptedException e) {
            System.out.println("Возникла ошибка + " + e);
            e.printStackTrace();
        }

        for ( float number : list) {
             sum =+ number;
        }
        sum = sum / list.size();
        System.out.println(sum);;
    }
}
