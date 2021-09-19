/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Trae Roy
 */

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Objects;
import java.util.Scanner;

public class Solution14 {
    /*
     * make constant scanner 'input'
     * make method for scanning integer input 'inputMethod'
     * make method for scanning float input 'inputMethod2'
     * make method for calc tax 'calcTax'
     * make method for calc total 'calcTotal'
     * make 'app' variable
     * declare float variable 'dollarAmount' = scan dollarAmount input using 'inputMethod' method
     * declare String variable 'state' = scan state input using 'inputMethod2' method
     * declare String variable 'compare' = "WI" for comparison string
     * declare double variable 'tax' = calc tax using 'calcTax' method
     * declare double variable 'grandTotal' = calc grand total using 'calcTotal' method
     * implement rounding system
     * create if statement to compare state strings
            * if state strings equal add 'tax' and return 'grandTotal' else:
     * print 'The total is 'total''
     */

    private static final Scanner input = new Scanner(System.in);

    private int inputMethod() {
        System.out.println("What is the order amount? ");
        return input.nextInt();
    }

    private String inputMethod2() {
        System.out.println("What is the state? ");
        return input.next();
    }

    double calcTax(float amount){
        return .055 * amount;
    }

    double calcTotal(float amount, double tax){
        return amount + tax;
    }

    public static void main(String[] args) {
        Solution14 app = new Solution14();

        float dollarAmount = app.inputMethod();
        String state = app.inputMethod2();
        String compare = "WI";

        double tax = app.calcTax(dollarAmount);
        double grandTotal = app.calcTotal(dollarAmount, tax);

        DecimalFormat round = new DecimalFormat("#.##");
        round.setRoundingMode(RoundingMode.FLOOR);
        String total = round.format(dollarAmount);
        String taxTotal = round.format(tax);
        String res = round.format(grandTotal);

        if(Objects.equals(state, compare)){
            total = "The subtotal is $"+ total +".\nThe tax is $"+ taxTotal +".\nThe total is $"+ res +".";
        }
        System.out.printf("The total is %s.00", total);
    }
}

