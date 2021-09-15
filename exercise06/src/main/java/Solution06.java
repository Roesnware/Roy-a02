
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Trae Roy
 */

import java.time.Year;
import java.util.Scanner;

public class Solution06 {
    /*
    * *Create a program
    * Initialize scanner 'currAgeInput' = new Scanner(system.in) for current age
    * Initialize scanner 'retAgeInput' = new Scanner(system.in) for retired age
    * print "What is your current age? "
    * declare integer variable 'currAge' = using 'currAgeInput' scanner
    * print "At what age would you like to retire? "
    * declare integer variable 'retAge' = using 'retAgeInput' scanner
    * declare integer variable 'yearsLeft' = 'retAge' - 'currAge'
    * print "You have 'yearsLeft' years left until you can retire."
    * declare a Year variable 'currYear' = Year.now function for current year
    * declare a Year variable 'retYear' = currYear.plusYears('yearsLeft') to get retirement year
      add years left plus current year for retired year
    * print "It's 'cureYear', so you can retire in 'retYear'."
    */
    public static void main(String[] args) {
        Scanner currAgeInput = new Scanner(System.in);
        Scanner retAgeInput = new Scanner(System.in);

        System.out.println("What is your current age? ");
        int currAge = currAgeInput.nextInt();

        System.out.println("At what age would you like to retire? ");
        int retAge = retAgeInput.nextInt();

        int yearsLeft = retAge - currAge;
        System.out.println("You have " +yearsLeft+ " years left until you can retire.");

        Year currYear = Year.now();
        Year retYear = currYear.plusYears(yearsLeft);

        System.out.printf("It's %s, so you can retire in %s.", currYear, retYear);
    }
}
