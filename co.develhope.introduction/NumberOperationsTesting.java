package co.develhope.introduction;

public class NumberOperationsTesting {
    public static void main(String args[]){
        int a = 15;
        a+=5;
        a-=4;
        int b = a;
        b++;

        if((b%2 != 0) && (b*(b+1)%3 ==0) ){
            System.out.println("b is an odd number and (b multiplied for b + 1) is a multiple of 3");
        }
        else {
            System.out.println("The conditions are not satisfied");
        }
    }
}
