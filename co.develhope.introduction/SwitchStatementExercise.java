package co.develhope.introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

public class SwitchStatementExercise {
    public static void main(String args[]) throws IOException {

        //create new scanner
        Scanner sc = new Scanner(System.in);

        //create an infinite for loop
       for (;;){

           //prompt the user to enter a number between 1 and 10
           System.out.println("kindly enter a number between 1 - 10: " );

           //receive and asign the unputed number into variable number
           int number = sc.nextInt();

           //check if the number entered is within the range of 1 and 10 all-inclusive
           if (number >= 1 && number <= 10){

               //assign the number entered to its corresponding name
               switch (number){
                   case 1 -> System.out.println(number +" -> one");
                   case 2 -> System.out.println(number + " -> two");
                   case 3 -> System.out.println(number + " -> three");
                   case 4 -> System.out.println(number + " -> four");
                   case 5 -> System.out.println(number + " -> five");
                   case 6 -> System.out.println(number + " -> six");
                   case 7 -> System.out.println(number + " -> seven");
                   case 8 -> System.out.println(number + " -> eight");
                   case 9 -> System.out.println(number + " -> nine");
                   default -> System.out.println(number + " -> ten");
               }
           }
           else{
               System.out.println("Cannot give you the name");
           }
       }
    }
}
