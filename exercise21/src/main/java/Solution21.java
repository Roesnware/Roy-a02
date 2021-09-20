/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 21
 *  Copyright 2021 Trae Roy
 */

import java.util.Scanner;

public class Solution21 {
    /*
     * make constant scanner 'input'
     * make method for scanning input 'inputMethod'
     * printOutput
     * make 'app' variable
     * declare integer variable 'monthNumber' = scan in month number using 'inputMethod' method
     * declare String variable 'month'
     * switch case()
        * case 1 -> month = "January"
        * etc... for every month
     * print output using 'printOutput' method
     */

    private static final Scanner input = new Scanner(System.in);

    private int inputMethod() {
        System.out.println("What is the month number? ");
        return input.nextInt();
    }

    void printOutput(String month){
        System.out.printf("The name of the month is, %s", month);
    }
    public static void main(String[] args) {
        Solution21 app = new Solution21();

        int monthNumber = app.inputMethod();
        String month;

        switch(monthNumber){
            case 1 -> month = "January";
            case 2 -> month = "February";
            case 3 -> month = "March";
            case 4 -> month = "April";
            case 5 -> month = "May";
            case 6 -> month = "June";
            case 7 -> month = "July";
            case 8 -> month = "August";
            case 9 -> month = "September";
            case 10 -> month = "October";
            case 11 -> month = "November";
            case 12 -> month = "December";
            default -> month = "Please Enter a valid month number";
        }
       app.printOutput(month);
    }
}

