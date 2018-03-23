package com.epam.dmitriy_abdulin.java.lesson1.task1;

import java.util.*;

public class ArrayProcessing {
    public void startApplication() {
        /*Generation of the source array*/
        ArrayList<Integer> arr = new ArrayList<>();
        int c = 0;
        while (c != 20) {
            arr.add((int) (Math.random() * 20 - 10));
            c++;
        }
        System.out.println("Source array: " + arr);

        swapMaximumAndMinimum(arr);
        sumOfElementsOnTheEvenPositions(arr);
        replacementOfNegativeNumbersByZeros(arr);
        tripleEachPositiveElementBeforeTheNegativeElement(arr);
        differenceBetweenTheArithmeticMeanAndTheMinimumElement(arr);
        outputAllElementsThatOccurMoreThanOnceAndWhosIndicesAreEven(arr);
    }

    /*Task 1_1*/
    public void swapMaximumAndMinimum(ArrayList<Integer> arr) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.addAll(arr);
        int max = -10;
        int pos1 = 0;
        int pos2 = 0;
        int min = 10;
        for (int i = 0; i < arr1.size(); i++) {
            if (arr1.get(i) < 0 && arr1.get(i) > max) {
                max = arr1.get(i);
                pos1 = i;
            }
            if (arr1.get(i) > 0 && arr1.get(i) < min) {
                min = arr1.get(i);
                pos2 = i;
            }
        }
        Collections.swap(arr1, pos1, pos2);
        System.out.println("Result 1: " + arr1);
    }

    /*Task 1_2*/
    public void sumOfElementsOnTheEvenPositions(ArrayList<Integer> arr) {
        int sumOfElements = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (i % 2 == 0)
                sumOfElements += arr.get(i);
        }
        System.out.println("Result 2: " + sumOfElements);
    }

    /*Task 1_3*/
    public void replacementOfNegativeNumbersByZeros(ArrayList<Integer> arr) {
        ArrayList<Integer> arr3 = new ArrayList<>();
        arr3.addAll(arr);
        for (int i = 0; i < arr3.size(); i++) {
            if (arr3.get(i) < 0)
                arr3.set(i, 0);
        }
        System.out.println("Result 3: " + arr3);
    }

    /*Task 1_4*/
    public void tripleEachPositiveElementBeforeTheNegativeElement(ArrayList<Integer> arr) {
        ArrayList<Integer> arr4 = new ArrayList<>();
        arr4.addAll(arr);
        for (int i = 0; i + 1 < arr4.size(); i++) {
            if (arr4.get(i) > 0 && arr4.get(i + 1) < 0)
                arr4.set(i, 3 * arr4.get(i));
        }
        System.out.println("Result 4: " + arr4);
    }

    /*Task 1_5*/
    public void differenceBetweenTheArithmeticMeanAndTheMinimumElement(ArrayList<Integer> arr) {
        int sumAll = 0;
        for (int i = 0; i < arr.size(); i++) {
            sumAll += arr.get(i);
        }
        int medium = sumAll / arr.size();
        int minElem = Collections.min(arr);
        System.out.println("Result 5: " + Math.abs(medium - minElem));
    }

    /*Task 1_6*/
    public void outputAllElementsThatOccurMoreThanOnceAndWhosIndicesAreEven(ArrayList<Integer> arr) {
        HashMap<Integer, Integer> p = new HashMap<>();
        for (int i = 0; i < arr.size(); i++) {
            if (p.containsKey(arr.get(i))) {
                p.put(arr.get(i), p.get(arr.get(i)) + 1);
            } else
                p.put(arr.get(i), 1);
        }
        System.out.print("Result 6: ");
        for (HashMap.Entry entry : p.entrySet()) {
            if (!entry.getValue().equals(1))
                for (int i = 0; i < arr.size(); i++) {
                    if (arr.get(i) == entry.getKey() && i % 2 == 1)
                        System.out.print(arr.get(i) + ", ");
                }
        }
    }
}
