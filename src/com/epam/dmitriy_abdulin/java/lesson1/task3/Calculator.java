package com.epam.dmitriy_abdulin.java.lesson1.task3;

import java.util.Scanner;

/**
 * Created by dima7 on 23.03.2018.
 */
public class Calculator {
    public void startApplication() {
        System.out.println("Enter number A");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("Enter number B");
        int b = sc.nextInt();

        System.out.println("Enter + for sum, - for dif, * for mult, / for div");
        String choice = sc.next();

        if (choice.equals("+"))
            getSum(a, b);
        if (choice.equals("-"))
            getDif(a, b);
        if (choice.equals("*"))
            getMult(a, b);
        if (choice.equals("/"))
            getDiv(a, b);
    }

    /*calculating the sum*/
    public void getSum(int a, int b) {
        int sum = a + b;
        System.out.println(+a + "+" + b + "=" + sum);
    }

    /*calculating the difference*/
    public void getDif(int a, int b) {
        int dif = a - b;
        System.out.println(a + "-" + b + "=" + dif);
    }

    /*calculating the multiplication*/
    public void getMult(int a, int b) {
        int mult = a * b;
        System.out.println(a + "*" + b + "=" + mult);
    }

    /*calculating the division*/
    public void getDiv(int a, int b) {
        int div = a / b;
        System.out.println(a + "/" + b + "=" + div);
    }
}
