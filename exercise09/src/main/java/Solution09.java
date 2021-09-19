/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Trae Roy
 */

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.Math;

public class Solution09 {
    /*
    * make a private input method to scan in variables
    * make 'inputMethod' method to scan input
    * declare an application variable Solution09 'app' = new Solution09
    * int 'length' = app.'inputMethod'"Enter length: " scan in length using private method
    * int 'width' = app.'inputMethod'"Enter width: " scan in width using private method
    *
    *
    * print 'You will need to purchase 'numGallons' gallons of paint to cover 'squareFeet' square feet.'
    */
    private static final Scanner input = new Scanner(System.in);
    private int inputMethod(String prompt){
        System.out.println(prompt);
        return input.nextInt();
        }
    public static void main(String[] args) {
        Solution09 app = new Solution09();
        int length = app.inputMethod("Enter length: ");
        int width = app.inputMethod("Enter width: ");

        int squareFeet = length * width;
        float numGallons = (float)(squareFeet)/350;

        DecimalFormat round = new DecimalFormat("#.");
        round.setRoundingMode(RoundingMode.CEILING);
        String gallons =  round.format(numGallons);

        System.out.printf("You will need to purchase %s gallons of paint to cover %d square feet. ", gallons, squareFeet);
    }
}
