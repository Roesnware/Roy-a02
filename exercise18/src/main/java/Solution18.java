/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 18
 *  Copyright 2021 Trae Roy
 */

import java.util.Objects;
import java.util.Scanner;

public class Solution18 {
    /*
     * make constant scanner 'input'
     * make method for scanning integer input 'inputMethod'
     * make method for scanning string input 'inputMethod2'
     * make method for calc fahrenheit temp calcFar
     * make method for calc celsius temp calcCel
     * String 'identifier' = scan in c or f using 'inputMethod2' method
     * if "f"
        * declare int variable 'c' = scan in temperature using 'inputMethod' method
        * declare int variable 'temperatureInFar' = calc temp in Far using 'calcFar' method
        * print 'The temperature in Fahrenheit is 'temperatureInFar''
     * else repeat using 'calcCel'
     * make 'app' variable
     */

    private static final Scanner input = new Scanner(System.in);

    private int inputMethod(String prompt) {
        System.out.println(prompt);
        return input.nextInt();
    }

    private String inputMethod2() {
        System.out.println("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit.");
        return input.next();
    }

    int calcFar(int c){
        return (c * 9 / 5) + 32;
    }

    int calcCel(int f){
        return (f - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Solution18 app = new Solution18();

        String identifier = app.inputMethod2();
        System.out.printf("Your choice: %s\n", identifier);
        if (Objects.equals(identifier, "F")){
            int c = app.inputMethod("Please enter the temperature in Celsius: ");
            int temperatureInFar = app.calcFar(c);
            System.out.printf("The temperature in Fahrenheit is %d", temperatureInFar);

        }
        else {
            int f = app.inputMethod("Please enter the temperature in Fahrenheit:");
            int temperatureInCel = app.calcCel(f);
            System.out.printf("The temperature in Celsius is %d", temperatureInCel);
            }
    }
}

