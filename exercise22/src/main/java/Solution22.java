/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 22
 *  Copyright 2021 Trae Roy
 */

import java.util.Scanner;

public class Solution22{
    /*
     * make constant scanner 'input'
     * make method for scanning input 'inputMethod'
     * make calc max number method 'maxNumber'
     * make 'app' variable
     * declare Integer [] array 'numbers' = new Integer array of size '3'
     * declare integer variable 'num1' = scan in number 1 using 'inputMethod' method
     * store 'num1' in 'numbers' array index 0
     * declare integer variable 'num2' = scan in number 2 using 'inputMethod' method
     * store 'num2' in 'numbers' array index 1
     * declare integer variable 'num3' = scan in number 3 using 'inputMethod' method
     * store 'num3' in 'numbers' array index 2
     * declare integer variable 'max' = get max number using 'maxNumber' method
     * print 'The largest number is 'max'.'
     */

    private static final Scanner input = new Scanner(System.in);

    private int inputMethod(String prompt) {
        System.out.println(prompt);
        return input.nextInt();
    }

     int maxNumber(Integer[] numbers) {
        int max = numbers[0];
        for(int i = 0; i < 3; i++){
            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Solution22 app = new Solution22();

        Integer [] numbers = new Integer[3];

        int num1 = app.inputMethod("Enter the first number ");
        numbers[0] = num1;
        int num2 = app.inputMethod("Enter the second number ");
        numbers[1] = num2;
        int num3 = app.inputMethod("Enter the third number ");
        numbers[2] = num3;

        int max = app.maxNumber(numbers);
        System.out.println("The largest number is "+ max + ".");
    }
}

