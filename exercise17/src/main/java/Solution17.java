/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 17
 *  Copyright 2021 Trae Roy
 */

import java.util.Scanner;

public class Solution17 {
    /*
     * make constant scanner 'input'
     * make method for scanning integer input 'inputMethod'
     * make method for scanning float input 'inputMethod2'
     * make method for calc BAC content 'calcBac'
     * make method for printing true statement output 'outputMethod'
     * make method for printing false statement output 'outputMethod2'
     * make method for printing BAC output 'printBac'
     * make 'app' variable
     * declare integer variable 'gender' = scan in 'gender' using 'inputMethod'
     * declare float variable 'ounce' = scan in 'ounce' using 'inputMethod2'
     * declare float variable 'weight' = scan in 'weight' using 'inputMethod2'
     * declare float variable 'hours' = scan in 'hours' using 'inputMethod2'
     * declare float variable 'ratio' = 0.73 for male ratio
     * declare float variable 'ratio2' = 0.66 for female ratio
     * if male
        * declare double variable Bac = calculate BAC using 'calcBac' method with male ratio
            * if Bac > .08
            * not eligible
            * print 'Your BAC is 'Bac'.'
            * print output statement using 'outputMethod2'
            * else
            * eligible
            * print 'Your BAC is 'Bac'.'
            * print output statement using 'outputMethod'
     * else repeat for female with female ratio
     */

    private static final Scanner input = new Scanner(System.in);

    private int inputMethod() {
        System.out.println("Enter a 1 if you are a male or a 2 if you are a female: ");
        return input.nextInt();
    }

    private float inputMethod2(String prompt) {
        System.out.println(prompt);
        return input.nextFloat();
    }

    double calcBac(float alc, float weight, float ratio, float hours){
        float a = (float) (alc * 5.14/weight * ratio);
        return (float) (a - (.015 * hours));
    }

    void outputMethod(){
        System.out.println("It is legal for you to drive. ");
    }

    void outputMethod2(){
        System.out.println("It is not legal for you to drive. ");
    }

    void printBac(float Bac){
        System.out.println("\nYour BAC is "+ Bac + ".");
    }

    public static void main(String[] args){
        Solution17 app = new Solution17();

        int gender = app.inputMethod();
        float ounce = app.inputMethod2("How many ounces of alcohol did you have? ");
        float weight = app.inputMethod2("What is your weight, in pounds? ");
        float hours = app.inputMethod2("How many hours has it been since your last drink? ");


        float ratio = (float) 0.73;
        float ratio2 = (float) 0.66;

        if(gender == 1){
            double Bac = app.calcBac(ounce, weight, ratio, hours);
            if(Bac > .08){
                app.printBac((float) Bac);
                app.outputMethod2();
            }
            else{
                app.printBac((float) Bac);
                app.outputMethod();
            }
        }

        else{
            double Bac2 = app.calcBac(ounce, weight, ratio2, hours);
            if(Bac2 > .08){
                app.printBac((float) Bac2);
                app.outputMethod2();
            }
            else{
                app.printBac((float) Bac2);
                app.outputMethod();
            }
        }
    }
}

