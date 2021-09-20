/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 19
 *  Copyright 2021 Trae Roy
 */

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution19 {
    /*
     * make constant scanner 'input'
     * make method for scanning string input 'inputMethod'
     * make method for calc bmi based on height and weight 'calcBmi'
     * make method for printing output for under weight 'underweightBmi'
     * make method for printing output for over weight 'overweightBmi'
     * make method for printing output for ideal weight 'rightweightBmi'
     * make 'app' variable
     * print 'Enter your weight, in pounds: '
     * while loop to confirm inout is an integer
        * if it isn't then print 'Please enter a valid number. '
        * scan for next input
     * scan in correct input using 'inputMethod' to 'weight' variable
     * repeat with 'height' variable
     * declare float variable 'bmi' = calc bmi using 'calcBmi' method
     * implement rounding system
     * if bmi is under 18.5 underweight
        * print output using 'underweightBmi' method
     * else in between 18.5 and 25 ideal weight
        * print output using 'rightweightBmi' method
     * else above 25 overweight
        * print output using 'overweightBmi' method
     */

    private static final Scanner input = new Scanner(System.in);

    private int inputMethod() {
        return input.nextInt();
    }

    float calcBmi(float weight, float height){
        return (weight / (height * height)) * 703;
    }

    void underweightBmi(String bmi){
        System.out.printf("Your BMI is %s\nYou are underweight. You should see your doctor. ", bmi);
    }

    void overweightBmi(String bmi){
        System.out.printf("Your BMI is %s\nYou are overweight. You should see your doctor. ", bmi);
    }

    void rightweightBmi(String bmi){
        System.out.printf("Your BMI is %s\nYou are within the ideal weight range. ", bmi);
    }

    public static void main(String[] args) {
        Solution19 app = new Solution19();

        System.out.println("Enter your weight, in pounds: ");
        while (!input.hasNextInt()) {
            System.out.println("Please enter a valid number. ");
            input.nextLine();
        }
        float weight = app.inputMethod();

        System.out.println("Enter your height, in inches: ");
        while (!input.hasNextInt()) {
            System.out.println("Please enter a valid number. ");
            input.nextLine();
        }
        float height = app.inputMethod();

        float bmi = app.calcBmi(weight, height);

        DecimalFormat round = new DecimalFormat("#.##");
        round.setRoundingMode(RoundingMode.CEILING);
        String BMI = round.format(bmi);

        if(bmi < 18.5){
            app.underweightBmi(BMI);
        }
        else if(bmi >= 18.5 && bmi <= 25){
            app.rightweightBmi(BMI);
        }
        else{
            app.overweightBmi(BMI);
        }
    }
}

