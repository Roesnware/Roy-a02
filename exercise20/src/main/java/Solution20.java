/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 20
 *  Copyright 2021 Trae Roy
 */

import java.util.Objects;
import java.util.Scanner;

public class Solution20 {
    /*
     * make constant scanner 'input'
     * make method for scanning integer input 'inputMethod'
     * make method for scanning String input 'inputMethod2'
     * make method for printing output 'printOutput'
     * make method for total 'calcTotal'
     * make method for calc tax rates form county input 'getTax'
     * make 'app' variable
     * declare String variable 'stateTax1' = "Illinois" for 1st taxxed state
     * declare String variable 'stateTax2' = "Wisconsin" for 2nd taxxed state
     * declare float variable 'tax' = 0
     * declare float variable 'orderAmount' = scan in orderAmount using 'inputMethod'
     * declare String variable 'state' = scan in state using 'inputMethod2'
     * if state entered == taxxed states
        * state == illinois
            * additional tax of 0.08
            * calc total using 'calcTotal' method
            * print output using 'printOutput' method
        * state == wisconsin
            * get 'county'
            * compare county to set county strings with more tax
            * if one of the set counties add additional tax and return it
            * calc total using 'calcTotal'
            * print output using 'printOutput'
     * otherwise no tax
     * calc total using 'calcTotal'
     * print output using 'printOutput'
     */

    private static final Scanner input = new Scanner(System.in);

    private int inputMethod() {
        System.out.println("What is the order amount? ");
        return input.nextInt();
    }

    private String inputMethod2(String prompt) {
        System.out.println(prompt);
        return input.next();
    }

    void printOutput(float tax, float total) {
        System.out.printf("The tax is $%.2f\nThe total is $%.2f", tax, total);
    }

    float calcTotal(float tax, float orderAmount) {
        return tax + orderAmount;
    }

    float getTax(float orderAmount, float taxes, String county){
        String countyTax1 = "Eau Claire";
        String countyTax2 = "Dunn";

        if(Objects.equals(countyTax2, county)){
            taxes = (float) (.055 * orderAmount);
        }
        else if(Objects.equals(countyTax1, county)){
            taxes = (float) (.054 * orderAmount);
        }
        else{
            taxes = (float) (.05 * orderAmount);
        }
        return taxes;
    }

    public static void main(String[] args) {
        Solution20 app = new Solution20();

        String stateTax1 = "Illinois";
        String stateTax2 = "Wisconsin";
        float tax = 0;

        float orderAmount = app.inputMethod();
        String state = app.inputMethod2("What state do you live in? ");

        if(Objects.equals(stateTax1, state)|| Objects.equals(stateTax2, state)){
            if(Objects.equals(stateTax1, state)){
                tax = (float) 0.08 * orderAmount;
                float total = app.calcTotal(tax, orderAmount);
                app.printOutput(tax, total);
            }
            else{
                String county = app.inputMethod2("What county do you live in? ");
                tax = app.getTax(orderAmount, tax, county);
                float total = app.calcTotal(tax, orderAmount);
                app.printOutput(tax, total);
            }
        }
        else {
            float total = app.calcTotal(tax, orderAmount);
            app.printOutput(tax, total);
        }
    }
}

