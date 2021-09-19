/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Trae Roy
 */

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution12 {
    /*
     * make constant scanner 'input'
     * make method for scanning integer input 'inputMethod'
     * make method for scanning in float input 'inputMethod2'
     * make method for converting rate to percent 'getPercent'
     * make method for getting final total after investment 'getTotal'
     * make 'app' variable
     * declare float variable 'Principal' = scan principal input using 'inputMethod2' method for float
     * declare float variable 'rate' = scan rate input using 'inputMethod2' method for float
     * declare int variable 'years' = scan years input using 'inputMethod' method for integer
     * declare float variable 'percent' = calc percent from rate using 'getPercent' method
     * declare float variable 'total' = calc total conversion using 'getTotal' method
     * implement rounding system
     * print 'After 'years' years at 'rate'%, the investment will be worth $'totalOfInvestment''
     */

    private static final Scanner input = new Scanner(System.in);

    private int inputMethod() {
        System.out.println("Enter the number of years: ");
        return input.nextInt();
    }

    private float inputMethod2(String prompt) {
        System.out.println(prompt);
        return input.nextFloat();
    }

    float getPercent(float rate){
        return rate/100;
    }

    float getTotal(float Principal, float percent, int years){
        return Principal * (1 + (percent * years));
    }

    public static void main(String[] args) {
        Solution12 app = new Solution12();

        float Principal = app.inputMethod2("Enter the principal: ");
        float rate = app.inputMethod2("Enter the rate of interest: ");
        int years = app.inputMethod();

        float percent = app.getPercent(rate);
        float total = app.getTotal(Principal, percent, years);

        DecimalFormat round = new DecimalFormat("#.##");
        round.setRoundingMode(RoundingMode.CEILING);
        String totalOfInvestment = round.format(total);

        System.out.printf("After %d years at %.2f%%, the investment will be worth $%s", years, rate, totalOfInvestment);
    }
}

