package com.company.task8;

public class task8 {
    public static void main(String[] args) {
    printLeapYear(1);
    printLeapYear(4);
    printLeapYear(40);
    printLeapYear(100);
    printLeapYear(300);
    printLeapYear(400);
    printLeapYear(700);
    printLeapYear(2019);
    printLeapYear(2020);

    }
    public static void printLeapYear(int year){
        boolean isLeap = isLeapYear(year);
        if (isLeap){
            System.out.println(year + " is leap year\n");
        } else{
            System.out.println(year + " is not leap year\n");
        }


    }
    private static boolean isLeapYear(int year){

        if (year % 400 ==0){
            return true;
        }if (year % 100 ==0){

        }return year % 4 ==0;
    }

}
