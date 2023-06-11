package com.variablesAndDaTaTypeExercises;

import java.util.Scanner;

public class PrintYourAgeFromInput {
    public static void main(String args[]){

       //create a new scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: ");

        //read the integer output from the user
        int age = input.nextInt();

        System.out.println("Your age is: " + age);

        //close the scanner
        input.close();
    }
}
