/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Trae Roy
 */

import java.util.Scanner;

public class Solution10 {
    /*
    * make constant scanner 'input'
    * make method for scanning input 'inputMethod'
    * make method for calc subtotals 'subtotal'
    * make method for calc final subtotal 'totalofSub'
    * make method for applying tax 'getTax'
    * make method for calc final total 'getFinalTotal'
    * make 'app' variable
    * declare float variables 'priceOne', 'priceTwo', 'priceThree' = scan in float price for each using 'inputMethod2' method
    * declare integer variables 'quantityOne', 'quantityTwo', 'quantityThree' = scan in quantity of each using 'inputMethod' method
    * declare double variables 'sub1', 'sub2', 'sub3' = calc subtotal of all 3 individually using 'subtotal' method
    * declare double variable 'subtotal' = calc total of all subtotals using 'totalofSub' method
    * declare double variable 'tax' = calc tax on good using 'getTax' method
    * declare double variable 'total' = calc final total using 'getFinalTotal' method
    */

    private static final Scanner input = new Scanner(System.in);

    private int inputMethod(String prompt) {
        System.out.println(prompt);
        return input.nextInt();
    }

    private float inputMethod2(String prompt) {
        System.out.println(prompt);
        return input.nextFloat();
    }

    double subtotal(float price,int quantity){
        return price * quantity;
    }

    double totalofSub(double sub1, double sub2, double sub3){
        return sub1 + sub2 + sub3;
    }

    double getTax(double subtotal){
        return subtotal * 0.055;
    }

    double getFinalTotal(double tax, double subtotal){
        return tax + subtotal;
    }

    public static void main(String[] args) {
        Solution10 app = new Solution10();

        float priceOne = app.inputMethod2("Enter the price of item 1: ");
        int quantityOne = app.inputMethod("Enter the quantity of item 1: ");
        double sub1 = app.subtotal(priceOne, quantityOne);

        float priceTwo = app.inputMethod2("Enter the price of item 2: ");
        int quantityTwo = app.inputMethod("Enter the quantity of item 2: ");
        double sub2 = app.subtotal(priceTwo, quantityTwo);

        float priceThree = app.inputMethod2("Enter the price of item 3: ");
        int quantityThree = app.inputMethod("Enter the quantity of item 3: ");
        double sub3 = app.subtotal(priceThree, quantityThree);

        double subtotal = app.totalofSub(sub1, sub2, sub3);
        double tax = app.getTax(subtotal);

        double total = app.getFinalTotal(tax, subtotal);

        System.out.printf("Subtotal: $%.2f\nTax: $%.2f\nTotal: $%.2f", subtotal, tax, total);
    }
}

