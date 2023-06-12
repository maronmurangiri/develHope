package co.develhope.introduction;

public class IfElseStatementExercise {
    public static void main(String args[]){

        //define and assigning myName variable
        String myName = "Maron";

        //Using if statement to chack and print if the number of letters in your name is even or odd
        if(myName.length() %2 == 0){
            System.out.println("The number of letters in the name : " + myName + " is even");
        }
        else {
            System.out.println("The number of letters in the name : " + myName + " is odd");
        }
    }
}
