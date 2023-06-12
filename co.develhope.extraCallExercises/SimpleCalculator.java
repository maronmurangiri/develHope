package co.develhope.extraCallExercises;

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String args[]) {

        //create a new scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Kindly enter the first integer operand: ");
        int operand1 = Integer.parseInt(input.next());


        System.out.println("Kindly enter the second operand: ");
        int operand2 = Integer.parseInt(input.next());


        System.out.println("Kindly enter the operator: ");
        String operator = input.next();

        input.close();

        if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/") || operator.equals("%")) {
            calculate(operator,operand1, operand2);
        } else {
            System.out.println("Kindly enter a valid operator");
        }


    }

    public static int calculate ( String operator, int operand1, int operand2){
        int result = 0;

        switch (operator) {
            case "+" ->result =operand1 + operand2;
            case "-" -> result = operand1-operand2;
            case "*" -> result =   operand1 * operand2;
            case "/" -> result =operand1 / operand2;
            case "%" -> result =  operand1 % operand2;
            default -> result = 0;

        }

        return result;
    }
}
