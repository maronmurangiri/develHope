package co.develhope.introduction;

public class StringHandlingExercise {
    public static void main(String args[]){

        //declare and initialize string1 and string2
        String string1 = "Hello";
        String string2 = "How are you?";

        //create charArray of characters and fill it with string1 first two characters and string2 last two characters
        char[] charArray = {string1.charAt(0),string1.charAt(1),string2.charAt(string2.length()-2),string2.charAt(string2.length()-1)};

        //print out the charArray
        System.out.println(charArray);
    }
}
