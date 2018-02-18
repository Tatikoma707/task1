package com.epam.dmitriy_abdulin.java.lesson1.task1;

import java.util.*;

public class Array_processing {
    public static void main(String[] args) {
        Array_processing app = new Array_processing();
        app.startApplication();
    }

    public void startApplication() {
        ArrayList<Integer> InitialArray = new ArrayList<Integer>(20);
        Integer count = 0;
        while (count != 20) {
            InitialArray.add(-10 + (int) (Math.random() * 20));
            count++;
        }
        System.out.println("Initial Array\n" + InitialArray);
        //1
        Integer idxMaxNeg = null;
        Integer idxMinPos = null;
        Integer tempNeg = -10;
        Integer tempPos = 11;
        for (int i = 0; i < 20; i++) {
            if (InitialArray.get(i) > tempNeg && InitialArray.get(i) < 0) {
                tempNeg = InitialArray.get(i);
                idxMaxNeg = i;
                continue;
            }
            if (InitialArray.get(i) < tempPos && InitialArray.get(i) > 0) {
                tempPos = InitialArray.get(i);
                idxMinPos = i;
                continue;
            }
        }
        if (idxMaxNeg==null || idxMinPos==null)
            System.out.println("There are no positive or negative elements in the array");
        else {
            ArrayList<Integer> Array_1 = new ArrayList<>(20);
            Array_1.addAll(InitialArray);
            Collections.swap(Array_1, idxMaxNeg, idxMinPos);
            System.out.println("An array in which the maximum negative and minimum positive elements are interchanged\n"+Array_1);
        }
        //2
        Integer SumElements = 0;
        for (int i = 1; i < 20; i = i + 2) {
            SumElements += InitialArray.get(i);
        }
        System.out.println("The sum of elements standing on even places\n" + SumElements);
        //3
        ArrayList<Integer> Array_2 = new ArrayList<>(20);
        Array_2.addAll(InitialArray);
        for (int i = 0; i < 20; i++) {
            if (Array_2.get(i) < 0)
                Array_2.set(i, 0);
        }
        System.out.println("Array without negative values\n" + Array_2);
        //4
        ArrayList<Integer> Array_3 = new ArrayList<>(20);
        Array_3.addAll(InitialArray);
        for (int i = 1; i < 20; i++) {
            if (Array_3.get(i) > 0 && Array_3.get(i - 1) < 0)
                Array_3.set(i, Array_3.get(i) * 3);
        }
        System.out.println("An array with triple positive values\n" + Array_3);
        //5
        Integer Arithmetic_mean = 0;
        for (int i = 0; i < 20; i++) {
            Arithmetic_mean += InitialArray.get(i);
        }
        Arithmetic_mean /= 20;
        Integer MinElement = Collections.min(InitialArray);
        System.out.println("The difference between the arithmetic mean and the minimum element\n" + (Arithmetic_mean - MinElement));
        //6
        Set<Integer> Elements = new HashSet<>();
        for (int i = 1; i < 20; i = i + 2) {
            for (int j = i + 2; j < 20; j = j + 2) {
                if (InitialArray.get(i) == InitialArray.get(j)) {
                    Elements.add(InitialArray.get(i));
                    break;
                }
            }
        }
        System.out.println("Elements that occur more than once with odd indices\n" + Elements);

    }
}
