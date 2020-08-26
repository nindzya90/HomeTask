package com.company.task3;

public class task3 {
    public static void main(String[] args) {

        double result = evaluateExpression (2,5,4,3);
        System.out.println(result);
        }

    private static double evaluateExpression (int a, int b, int c, int d) {


        return a * (b + (c / d));
    }
}
