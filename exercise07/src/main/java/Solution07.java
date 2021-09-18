/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Trae Roy
 */

import java.util.Scanner;

public class Solution07 {
    /*
     * declare constant scanner for input
     * make input method to take input
     * make 'getFeet' method to calc area in square feet
     * make application variable 'app'
     * print 'What is the length of the room in feet?'
     * declare integer variable 'length' = scan length using 'lengthInput' scanner
     * print 'What is the width of the room in feet?'
     * declare integer variable 'width' = scan width using 'widthInput' scanner
     * print 'You entered dimensions of 'length' feet by 'width' feet.'
     * declare integer variable 'areaFeet' = 'getFeet' method to calc area
     * define constant final float variable 'toMeters' = 'areaFeet' * 0.09290304(conversion factor)
     * print 'The area is'
     * print ''areaFeet' square feet'
     * print ''toMeters' square meters'
    */
    private static final Scanner input = new Scanner(System.in);

    private int inputMethod(String prompt){
        System.out.println(prompt);
        return input.nextInt();
    }

    int getFeet(int length, int width){
        return length * width;
    }

    public static void main(String[] args){
        Solution07 app = new Solution07();

        int length = app.inputMethod("What is the length of the room in feet? ");
        int width = app.inputMethod("What is the width of the room in feet? ");

        System.out.println("You entered dimensions of " +length+ " feet by " +width+ " feet.");

        int areaFeet = app.getFeet(length, width);
        final float toMeters = (float) (areaFeet * 0.09290304);

        System.out.println("The area is ");
        System.out.printf("%d square feet ", areaFeet);
        System.out.printf("%.3f square meters ", toMeters);
    }
}
