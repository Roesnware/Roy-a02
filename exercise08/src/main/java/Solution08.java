/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Trae Roy
 */

import java.util.Scanner;

public class Solution08 {
    /*
     * declare constant scanner for input
     * make private method for 'inputMethod' scanning input
     * declare application variable 'app'
     * declare int method 'calcLeftovers' return 'numSlices' % 'numPeople' using mod for remainder
     * declare int method 'calcSlicePerPerson' return 'numSlices' / 'numPeople' using division
     * print 'How many people?'
     * declare integer variable 'numPeople' = scan in # people using scanner method
     * print 'How many pizzas do you have?'
     * declare integer variable 'numPizzas' = scan in # pizzas using scanner method
     * print 'How many slices per pizza?'
     * declare integer variable 'numSlicesEach' = scan in # slices per pizza using scanner method
     * declare integer variable 'numSlices' = 'numSlicesEach' * 'numPizzas'
     * declare integer variable 'slicePerPerson' = using 'calcSlicePerPerson' function
     * declare integer variable 'leftovers' = using 'calcLeftovers' function
     * print ''numPeople' people with 'numPizzas' pizzas ('numSlices' slices)'
     * print 'Each person gets 'slicePerPerson' pieces of pizza.'
     * print 'There are 'leftovers' leftover pieces.'
     */
    private static final Scanner input = new Scanner(System.in);

    private int inputMethod(String prompt){
        System.out.println(prompt);
        return input.nextInt();
    }
    int calcLeftovers(int numSlices, int numPeople){
        return (numSlices)%(numPeople);
    }
    int calcSlicePerPerson(int numSlices, int numPeople){
        return (numSlices)/(numPeople);
    }
    public static void main(String[] args) {
        Solution08 app = new Solution08();

        int numPeople = app.inputMethod("How many people? ");
        int numPizzas = app.inputMethod("How many pizzas do you have? ");
        int numSlicesEach = app.inputMethod("How many slices per pizza? ");
        int numSlices = (numSlicesEach * numPizzas);

        int slicePerPerson = app.calcSlicePerPerson(numSlices, numPeople);
        int leftovers = app.calcLeftovers(numSlices, numPeople);

        System.out.printf("%d people with %d pizzas (%d slices)", numPeople, numPizzas, numSlices);
        System.out.printf("Each person gets %d pieces of pizza.", slicePerPerson);
        System.out.printf("There are %d leftover pieces.", leftovers);
    }
}
