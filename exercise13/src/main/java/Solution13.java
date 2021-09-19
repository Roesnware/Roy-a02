/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Trae Roy
 */

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution13 {
    /*
     * make constant scanner 'input'
     * make method for scanning integer input 'inputMethod'
     * make method for scanning float input 'inputMethod2'
     * make method to convert rate to percent 'getPercent'
     * make method to calc compounded interest 'calcCompoundInterest'
     * make 'app' variable
     * declare integer variable 'principal' = scan in 'principal' using 'inputMethod' method
     * declare float variable 'rate' = scan in 'rate' using 'inputMethod2' method
     * declare integer variable 'years' = scan in 'years' using 'inputMethod' method
     * declare integer variable 'compound' = scan in 'compound' using 'inputMethod' method
     * declare float variable 'percent' = convert rate to percent using 'getPercent' method
     * declare double variable compoundInterest = calcCompoundInterest
     * implement rounding system
     * print ''principal' invested at 'rate'%, for 'years' years compounded 'compound' times per year is $'finalInterest''
     */

    private static final Scanner input = new Scanner(System.in);

    private int inputMethod(String prompt) {
        System.out.println(prompt);
        return input.nextInt();
    }

    private float inputMethod2() {
        System.out.println("What is the rate? ");
        return input.nextFloat();
    }

    float getPercent(float rate){
        return rate/100;
    }

    double calcCompoundInterest(int principal, float percent, int compound, int years){
        return principal * Math.pow(1 + (percent / compound), compound * years);
    }

    public static void main(String[] args) {
        Solution13 app = new Solution13();

        int principal = app.inputMethod("What is the principal? ");
        float rate = app.inputMethod2();
        int years = app.inputMethod("What is the number of years? ");
        int compound = app.inputMethod("What is the number of times the interest is compounded per year?");

        float percent = app.getPercent(rate);
        double compoundInterest = app.calcCompoundInterest(principal, percent, compound, years);

        DecimalFormat round = new DecimalFormat("#.##");
        round.setRoundingMode(RoundingMode.CEILING);
        String finalInterest = round.format(compoundInterest);

        System.out.printf("%d invested at %.1f%%, for %d years compounded %d times per year is $%s.", principal, rate, years, compound, finalInterest);
    }
}

