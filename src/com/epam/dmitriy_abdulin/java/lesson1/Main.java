package com.epam.dmitriy_abdulin.java.lesson1;

import com.epam.dmitriy_abdulin.java.lesson1.task1.ArrayProcessing;
import com.epam.dmitriy_abdulin.java.lesson1.task2.StringProcessing;
import com.epam.dmitriy_abdulin.java.lesson1.task3.Calculator;

import java.util.Scanner;

/**
 * Created by dima7 on 23.03.2018.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for task1, 2 for task2, 3 for task3");
        int choice = sc.nextInt();
        switch (choice) {
            /*task1*/
            case 1: {
                ArrayProcessing app = new ArrayProcessing();
                app.startApplication();
                break;
            }
            /*task2*/
            case 2: {
                StringProcessing app = new StringProcessing();
                app.startApplication();
                break;
            }
            /*task3*/
            case 3: {
                Calculator app = new Calculator();
                app.startApplication();
                break;
            }
        }
    }
}
