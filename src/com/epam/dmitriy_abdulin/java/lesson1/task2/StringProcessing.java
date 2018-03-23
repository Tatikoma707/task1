package com.epam.dmitriy_abdulin.java.lesson1.task2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by dima7 on 11.02.2018.
 */
public class StringProcessing {
    public void startApplication() {
        System.out.println("Enter the number of strings");
        Scanner sc = new Scanner(System.in);
        /*Input strings*/
        ArrayList<String> arrayStrings = new ArrayList<>();
        int n = sc.nextInt();
        System.out.println("Enter strings");
        for (int i = 0; i < n; i++) {
            arrayStrings.add(sc.next());
        }
        searchEndOutputOfTheShortestAndLongestStringAndTheirLength(arrayStrings);
        outputOfLinesThatAreLongerThanTheAverageLengthAndTheirLength(arrayStrings);
        outputOfLinesWhoseLengthIsLessThanTheAverageLengthAndTheirLength(arrayStrings);
        searchEndOutputTheFirstWordInWhichTheNumberOfDifferentCharactersIsMinimally(arrayStrings);
        searchEndOutputTheFirstWordInWhichAllTheCharactersAreDifferent(arrayStrings);
        searchEndOutputWordFromNumbers(arrayStrings);
    }

    /*Task 2_1*/
    public void searchEndOutputOfTheShortestAndLongestStringAndTheirLength(ArrayList<String> arrayStrings) {
        String minLine = "";
        String maxLine = "";
        int minLength = 1000000000;
        int maxLength = 0;
        for (int i = 0; i < arrayStrings.size(); i++) {
            if (arrayStrings.get(i).length() < minLength) {
                minLine = arrayStrings.get(i);
                minLength = arrayStrings.get(i).length();
            }
            if (arrayStrings.get(i).length() > maxLength) {
                maxLine = arrayStrings.get(i);
                maxLength = arrayStrings.get(i).length();
            }
        }
        System.out.println("Result 1: short string: " + minLine + " with length " + minLength + ", long string: " + maxLine + " with length " + maxLength);
    }

    /*Task 2_2*/
    public void outputOfLinesThatAreLongerThanTheAverageLengthAndTheirLength(ArrayList<String> arrayStrings) {
        int sumLength = 0;
        for (int i = 0; i < arrayStrings.size(); i++) {
            sumLength += arrayStrings.get(i).length();
        }
        int averageLength = sumLength / arrayStrings.size();
        System.out.print("Result 2: ");
        for (int i = 0; i < arrayStrings.size(); i++) {
            if (arrayStrings.get(i).length() > averageLength)
                System.out.print(arrayStrings.get(i) + " - " + arrayStrings.get(i).length() + "; ");
        }
    }

    /*Task 2_3*/
    public void outputOfLinesWhoseLengthIsLessThanTheAverageLengthAndTheirLength(ArrayList<String> arrayStrings) {
        int sumLength = 0;
        for (int i = 0; i < arrayStrings.size(); i++) {
            sumLength += arrayStrings.get(i).length();
        }
        int averageLength = sumLength / arrayStrings.size();
        System.out.print("\nResult 3: ");
        for (int i = 0; i < arrayStrings.size(); i++) {
            if (arrayStrings.get(i).length() < averageLength)
                System.out.print(arrayStrings.get(i) + " - " + arrayStrings.get(i).length() + "; ");
        }
    }

    /*Task 2_4*/
    public void searchEndOutputTheFirstWordInWhichTheNumberOfDifferentCharactersIsMinimally(ArrayList<String> arrayStrings) {
        String word = "";
        int minDifChar = 10000;
        for (int i = 0; i < arrayStrings.size(); i++) {
            HashSet<Character> difChar = new HashSet<>();
            for (int j = 0; j < arrayStrings.get(i).length(); j++) {
                difChar.add(arrayStrings.get(i).charAt(j));
            }
            if (difChar.size() < minDifChar) {
                minDifChar = difChar.size();
                word = arrayStrings.get(i);
            }
        }
        System.out.println("\nResult 4: " + word);
    }

    /*Task 2_5*/
    public void searchEndOutputTheFirstWordInWhichAllTheCharactersAreDifferent(ArrayList<String> arrayStrings) {
        String word = "";
        for (int i = arrayStrings.size() - 1; i >= 0; i--) {
            HashSet<Character> difChar = new HashSet<>();
            for (int j = 0; j < arrayStrings.get(i).length(); j++) {
                difChar.add(arrayStrings.get(i).charAt(j));
            }
            if (difChar.size() == arrayStrings.get(i).length()) {
                word = arrayStrings.get(i);
            }
        }
        System.out.println("Result 5: " + word);
    }

    /*Task 2_6*/
    public void searchEndOutputWordFromNumbers(ArrayList<String> arrayStrings) {
        ArrayList<String> wordsDigit = new ArrayList<>();
        for (int i = 0; i < arrayStrings.size(); i++) {
            String wordDigit = "";
            for (int j = 0; j < arrayStrings.get(i).length(); j++) {
                if (Character.isDigit(arrayStrings.get(i).charAt(j)))
                    wordDigit += arrayStrings.get(i).charAt(j);
            }
            if (arrayStrings.get(i).length() == wordDigit.length())
                wordsDigit.add(wordDigit);
        }
        if (wordsDigit.size() > 1)
            System.out.println("Result 6: " + wordsDigit.get(1));
        else if (wordsDigit.size() == 1)
            System.out.println("Result 6: " + wordsDigit.get(0));
        else
            System.out.println("Result 6: Word not found");
    }
}
