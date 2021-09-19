/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Trae Roy
 */

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution11 {
    /*
     * make constant scanner 'input'
     * make method for float input 'inputMethod'
     * make method for scanning integer input 'inputMethod2'
     * make 'app' variable
     * declare integer variable 'euros' = scan in number of euros they are exchanging using 'inputMethod2'
     * declare float variable 'exchangeRate' = scan in exchange rate using 'inputMethod'
     * decalre float variable 'dollars' = calculate dollar conversion using 'toDollars' method
     * implement rounding system
     * print ''euros' Euros at an exchange rate of 'exchangeRate' is 'dollarConvert' U.S. dollars.'
     */

    private static final Scanner input = new Scanner(System.in);

    private float inputMethod(String prompt) {
        System.out.println(prompt);
        return input.nextFloat();
    }
    private int inputMethod2(String prompt) {
        System.out.println(prompt);
        return input.nextInt();
    }

    float toDollars(int euros, float exchangeRate){
        return (euros * exchangeRate);
    }

    public static void main(String[] args) {
        Solution11 app = new Solution11();

        int euros = app.inputMethod2("How many euros are you exchanging? ");
        float exchangeRate = app.inputMethod("What is the exchange rate? ");

        float dollars = app.toDollars(euros, exchangeRate);

        DecimalFormat round = new DecimalFormat("#.##");
        round.setRoundingMode(RoundingMode.CEILING);
        String dollarConvert = round.format(dollars);

        System.out.printf("%d Euros at an exchange rate of %f is %s U.S. dollars.", euros, exchangeRate, dollarConvert);
    }
}

