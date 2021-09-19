/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 16
 *  Copyright 2021 Trae Roy
 */

import java.util.Scanner;

public class Solution16 {
    /*
     * make constant scanner 'input'
     * make method for scanning input 'inputMethod'
     * make method for returning output in case is true 'outputMethod'
     * make method for returning output in case is false 'outputMethod2'
     * make 'app' variable
     * int 'age' = scan in age using 'inputMethod' method
     * if(age >= 16) if legal print output using 'outputMethod'
        * else not legal print using 'outputMethod2'
     */

    private static final Scanner input = new Scanner(System.in);

    private int inputMethod() {
        System.out.println("What is your age? ");
        return input.nextInt();
    }

    void outputMethod() {
        System.out.println("You are old enough to legally drive. ");
    }

    void outputMethod2() {
        System.out.println( "You are not old enough to legally drive. ");
    }

    public static void main(String[] args) {
        Solution16 app = new Solution16();

        int age = app.inputMethod();
        if(age >= 16){
            app.outputMethod();
        }
        else{
            app.outputMethod2();
        }
    }
}

