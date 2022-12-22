package exercise.javadoc;

/**
 * @author Mia
 * Main Class "Tester"
 * I'm going to print WordGames methods
 */
public class Tester {

    public static void main(String[] args) {

        /**
         * new object "wordGames" of WordGames Class
         * Called back WordGames methods
         */
        WordGames wordGames = new WordGames();
        System.out.println(wordGames.addHelloWord("Hello Word"));
        System.out.println(wordGames.getFullName("Mia ", "Smaldone"));
    }
}

    /*create a class called Tester that has the main method where you:
        create a new WordGames object
        print in console the result of the addHelloWord method invocation
        print in console the result of the getFullName method invocation
        add Javadoc comments to:
        the 2 classes with a short description and the author
        the 3 methods with a short description, the parameters and the return*/
