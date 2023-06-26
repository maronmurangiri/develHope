package co.develhope.introduction;

/**
 * The class WordGames has two methods that returns the greetings and the names respectively
 *@Author Maron
 */
class WorldGames{

    /**
     *
     * @param word
     * @return string formed by concatenating "Hello" to the word parameter
     */
    public String addHelloWord(String word){
     return "Hello " + word;
    }

    /**
     * This method concatenate the two parameters to form a return fullname
     * @param name
     * @param surname
     * @return fullName- name and surname concatenated
     */
    public String getFullName(String name, String surname){
        return name + surname;
    }

}

/**
 * This class is used to test the WordGame class
 * @Author Maron
 */
public class WordGamesTester {

    /**
     * This is the main method that instantiate the worldGame class.
     * creates an instance of the WordGame class and print out the two methods return statements
     * @param args
     */
    public static void main(String[] args){
        WorldGames worldGames = new WorldGames();
        System.out.println(worldGames.addHelloWord("Mike"));
        System.out.println(worldGames.getFullName("Silvester","Maiba"));
    }
}
