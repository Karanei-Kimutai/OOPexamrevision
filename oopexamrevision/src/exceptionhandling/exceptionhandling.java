package exceptionhandling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptionhandling {
    //There are three main errors one may come across:Syntax errors,Semantic errors and runtime errors
    //Syntax errors-errors that occur due to violation of java code syntax, code will not compile
    //Semantic errors-errors that occur due to wrong code logic leading to wrong results,code will compile but will yield wrong results
    //runtime errors-errors that occur as the program is running
    //Exception- an error that occurs during the execution of a program that disrupts the normal flow of instructions, causing the program to crash
    //Common causes of exceptions: when a user enters the wrong data, division by 0,memory issues
    //Exception handling prevents a program from crashing when exceptions occur
    public static void main(String[] args){
        Scanner inputscanner =new Scanner(System.in);
        int ID=0;
        boolean validinput= false;
        System.out.println("Enter your ID number here:");
        while(!validinput) {
            try {
                //Code that may throw an exception
                ID = inputscanner.nextInt();
               validinput = true;
            } catch (InputMismatchException e) {
                //code that executes in the case of an exception
                System.out.println("Enter a valid ID number:");
                inputscanner.nextLine();//Used to clear the scanner buffer
            }
       }
        System.out.println("Your ID number is:"+ID);



    }

}
