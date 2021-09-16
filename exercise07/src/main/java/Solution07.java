/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Trae Roy
 */

import java.util.Scanner;

public class Solution07 {
    /*
     * Initialize Scanner 'lengthInput' = for length
     * Initialize Scanner 'widthInput' = for width
     * print 'What is the length of the room in feet?'
     * declare integer variable 'length' = scan length using 'lengthInput' scanner
     * print 'What is the width of the room in feet?'
     * declare integer variable 'width' = scan width using 'widthInput' scanner
     * print 'You entered dimensions of 'length' feet by 'width' feet.'
     * declare integer variable 'areaFeet' = 'length' * 'width'
     * define constant final float variable 'toMeters' = 'areaFeet' * 0.09290304(conversion factor)
     * print 'The area is'
     * print ''areaFeet' square feet'
     * print ''toMeters' square meters'
    */
    public static void main(String[] args){
        Scanner lengthInput = new Scanner(System.in);
        Scanner widthInput = new Scanner(System.in);

        System.out.println("What is the length of the room in feet? ");
        int length = lengthInput.nextInt();

        System.out.println("What is the width of the room in feet? ");
        int width = widthInput.nextInt();

        System.out.println("You entered dimensions of " +length+ " feet by " +width+ " feet.");

        int areaFeet = length * width;
        final float toMeters = (float) (areaFeet * 0.09290304);

        System.out.println("The area is ");
        System.out.printf("%d square feet ", areaFeet);
        System.out.printf("%.3f square meters ", toMeters);
    }
}
