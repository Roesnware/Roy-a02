
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Trae Roy
 */

import java.time.Year;
import java.util.Scanner;

public class Solution06 {
    /*
    * Create a program
    * make constant scanner
    * make 'inputMethod' method for scanning input
    * integer function method for calculating 'yearsLeft'
    * print "What is your current age? "
    * declare integer variable 'currAge' = using scanner 'inputMethod'
    * print "At what age would you like to retire? "
    * declare integer variable 'retAge' = using scanner 'inputMethod'
    * declare integer variable 'yearsLeft' = 'calcYearsLeft' method
    * print "You have 'yearsLeft' years left until you can retire."
    * declare a Year variable 'currYear' = Year.now function for current year
    * declare a Year variable 'retYear' = currYear.plusYears('yearsLeft') to get retirement year
      add years left plus current year for retired year
    * print "It's 'cureYear', so you can retire in 'retYear'."
    */
    private static final Scanner input = new Scanner(System.in);

    private int inputMethod(String prompt){
        System.out.println(prompt);
        return input.nextInt();
    }
    int calcYearsLeft(int retire, int current){
        return retire - current;
    }

    public static void main(String[] args) {
        Solution06 app = new Solution06();

        int currAge = app.inputMethod("What is your current age? ");
        int retAge = app.inputMethod("At what age would you like to retire? ");

        int yearsLeft = app.calcYearsLeft(retAge, currAge);
        System.out.println("You have " +yearsLeft+ " years left until you can retire.");

        Year currYear = Year.now();
        Year retYear = currYear.plusYears(yearsLeft);

        System.out.printf("It's %s, so you can retire in %s.", currYear, retYear);
    }
}
