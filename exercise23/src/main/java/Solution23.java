/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 23
 *  Copyright 2021 Trae Roy
 */

import java.util.Objects;
import java.util.Scanner;

public class Solution23 {
    /*
     * make constant scanner 'input'
     * make method for scanning input 'inputMethod'
     * make car troubleshooting method to draw tree and help customer 'carTroubleShooting'
        * follow tree template
     * make 'app' variable
     * declare String variable 'temp' = scan in initial temp answer using 'inputMethod' method
     * run troubleshoot void using 'getSolution' method
     */

    private static final Scanner input = new Scanner(System.in);

    private String inputMethod() {
        System.out.println("Is the car silent when you turn the key? ");
        return input.next();
    }

    void printOutput(String prompt){
        System.out.println(prompt);
    }

    void carTroubleShooting(String answer){
        String expected = "yes";

        if(Objects.equals(answer, expected)){
            printOutput("Are the battery terminals corroded? ");
            answer = input.next();
            if(Objects.equals(answer, expected)){
                printOutput("Clean terminals and try starting again. ");
            }else
                printOutput("Replace cables and try again. ");
        }
        else{
            printOutput("Does the car make a slicking noise? ");
            answer = input.next();
            if(Objects.equals(answer, expected)){
                printOutput("replace the battery. ");
            }
            else{
                printOutput("Does the car crank up but fail to start? ");
                answer = input.next();
                if(Objects.equals(answer, expected)){
                    printOutput("Check spark plug connections. ");
                }
                else {
                    printOutput("Does the engine start and then die? ");
                    answer = input.next();
                    if (Objects.equals(answer, expected)) {
                        printOutput("Does you car have fuel injection? ");
                        answer = input.next();
                        if (Objects.equals(answer, expected)) {
                            printOutput("Get it in for service. ");
                        }
                        else{
                            printOutput("Check to ensure the choke is opening and closing. ");
                        }
                    }
                    else {
                        printOutput("This should not be possible. ");
                    }
                }
            }
        }
    }



    public static void main(String[] args) {
        Solution23 app = new Solution23();

        String temp = app.inputMethod();

        app.carTroubleShooting(temp);
    }
}

