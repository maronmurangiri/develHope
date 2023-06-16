package co.develhope.introduction;

import java.util.Arrays;

public class ArraysTesting {
    public static void main(String[] args){
        //defining carBrands array and populating it  with 5 famous car brand names
         String[] carBrands = {"Jeep","Bmw","Land Rover", "Toyota","Volvo"};

         //printing the number of items in the carBrand array
        System.out.println(carBrands.length);

        //printing the number third item in the carBrand array.
        System.out.println(carBrands[2]);

        //declaring an empty prime numbers array with a size limit of 6 and assigning the first 6 prime numbers
        int[] primeNumbers = new int[6];
        primeNumbers[0] = 2;
        primeNumbers[1] = 3;
        primeNumbers[2] = 5;
        primeNumbers[3] = 7;
        primeNumbers[4] = 11;
        primeNumbers[5] = 13;

        //printing the content of the array using the array method .toString
        System.out.println(Arrays.toString(primeNumbers));

        //printing the content of the array using a for each loop
        for(int primeN : primeNumbers) {
            System.out.println(primeN);
        }


    }
}