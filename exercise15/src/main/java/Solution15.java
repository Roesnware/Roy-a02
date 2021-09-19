/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 15
 *  Copyright 2021 Trae Roy
 */

import java.util.Objects;
import java.util.Scanner;

public class Solution15 {
    /*
     * make constant scanner 'input'
     * make method for scanning String input 'inputMethod'
     * make method for returning known output 'outputMethod'
     * make method for returning unknown output 'outputMethod2'
     * make 'app' variable
     * declare String variable 'known' = "roya-02" for known password to compare
     * declare String variable 'username' = scan username input string using 'inputMethod' method
     * declare String variable 'password' = scan password input string using 'inputMethod' method
     * if statement print greeting using 'outputMethod' method
        * else print else output using 'outputMethod2' method
     */

    private static final Scanner input = new Scanner(System.in);

    private String inputMethod(String prompt) {
        System.out.println(prompt);
        return input.next();
    }

    void outputMethod() {
        System.out.println("Welcome! ");
    }

    void outputMethod2() {
        System.out.println("I don't know you. ");
    }

    public static void main(String[] args) {
        Solution15 app = new Solution15();

        String known = "roya-02";
        String username = app.inputMethod("What is the username: ");
        String password =  app.inputMethod("What is the password: ");

        if(Objects.equals(password, known)) {
            app.outputMethod();
        }
        else {
            app.outputMethod2();
        }
    }
}

