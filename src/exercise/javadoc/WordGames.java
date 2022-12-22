package exercise.javadoc;

/**
 * @author Mia
 * Created a class with two methods in it
 */
public class WordGames {
    /**
     * Created a method added to Tester Class
     * @param word as String
     * @return word as String
     */
    public String addHelloWord(String word){
        return word;
    }

    /**
     * Created a method added to Tester Class
     * @param name my name
     * @param surname my surname
     * @return name + surname
     */
    public String getFullName(String name, String surname){
        return name.concat(surname);
    }


}

    /*create a class called WordGames that has two methods:
        addHelloWord method that takes one parameter as input called word and returns the String Hello [wordHere]
        getFullName method that takes two parameters as input called name and surname and returns their concatenation
        create a class called Tester that has the main method where you:
        create a new WordGames object
        print in console the result of the addHelloWord method invocation
        print in console the result of the getFullName method invocation
        add Javadoc comments to:
        the 2 classes with a short description and the author
        the 3 methods with a short description, the parameters and the return*/
