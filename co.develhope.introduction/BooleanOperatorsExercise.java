package co.develhope.introduction;

public class BooleanOperatorsExercise {
    public static void main(String args[]){

        //declaring and asigning boolean A - D to test their  validity
        boolean A = 2 <= 2 && !true;
        boolean B = !false && 3 > 2;
        boolean t = false;
        boolean f = true;
        boolean C = !(!t || f);
        boolean D = 6 > 6 ^ !(true && true);

        //print out the value of boolean algebra A - D
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
        System.out.println("D: " + D);
    }
}
