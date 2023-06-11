package co.develhope.introduction;

public class NumberOperationsTesting {
    public static void main(String args[]){

        //declaring and initializing a variable a to 15
        int a = 15;

        //Adding 5 to a
        a+=5;

        //subtracting 4  from a
        a-=4;

        //assigning the value of 'a' to int b
        int b = a;

        //incrementing b by 1
        b++;

        //checking if b is an odd number and the result of (b multiplied for b + 1) is a multiple of 3
        if((b%2 != 0) && (b*(b+1)%3 ==0) ){
            System.out.println("b is an odd number and (b multiplied for b + 1) is a multiple of 3");
        }
        else {
            System.out.println("The conditions are not satisfied");
        }
    }
}
