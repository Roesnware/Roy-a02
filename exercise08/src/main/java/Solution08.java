/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Trae Roy
 */

import java.util.Scanner;

public class Solution08 {
    /*
     * Scanner 'peopleInput' = new Scanner to scan number of people eating pizza input
     * Scanner 'pizzaInput' = new Scanner to scan number of pizzas input
     * Scanner 'sliceInput' = new Scanner to scan number of slices each pizza has input
     * print 'How many people?'
     * declare integer variable 'numPeople' = scan in # people using 'peopleInput' scanner
     * print 'How many pizzas do you have?'
     * declare integer variable 'numPizzas' = scan in # pizzas using 'pizzaInput' scanner
     * print 'How many slices per pizza?'
     * declare integer variable 'numSlicesEach' = scan in # slices per pizza using 'slicePerPizzaInput' scanner
     * declare integer variable 'numSlices' = 'numSlicesEach' * 'numPizzas'
     * declare integer variable 'slicePerPerson' = 'numSlices' / 'numPeople' using division
     * declare integer variable 'leftovers' = 'numSlices' % 'numPeople' using mod for remainder
     * print ''numPeople' people with 'numPizzas' pizzas ('numSlices' slices)'
     * print 'Each person gets 'slicePerPerson' pieces of pizza.'
     * print 'There are 'leftovers' leftover pieces.'
     */
    public static void main(String[] args) {
        Scanner peopleInput = new Scanner(System.in);
        Scanner pizzaInput = new Scanner(System.in);
        Scanner slicePerPizzaInput = new Scanner(System.in);

        System.out.print("How many people? ");
        int numPeople = peopleInput.nextInt();

        System.out.print("How many pizzas do you have? ");
        int numPizzas = pizzaInput.nextInt();

        System.out.print("How many slices per pizza? ");
        int numSlicesEach = slicePerPizzaInput.nextInt();
        int numSlices = (numSlicesEach * numPizzas);

        int slicePerPerson = (numSlices)/(numPeople);
        int leftovers = (numSlices)%(numPeople);

        System.out.printf("%d people with %d pizzas (%d slices)", numPeople, numPizzas, numSlices);
        System.out.printf("Each person gets %d pieces of pizza.", slicePerPerson);
        System.out.printf("There are %d leftover pieces.", leftovers);
    }
}
