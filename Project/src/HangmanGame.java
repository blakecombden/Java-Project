import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class HangmanGame {

    public static void main(String[] args) {

        try {

            // scan words.txt for list of words to guess
            Scanner scanner = new Scanner(new File("src/words.txt"));

            // initialize lists for each difficulty setting
            List<String> easyWords = new ArrayList<>();
            List<String> normalWords = new ArrayList<>();
            List<String> hardWords = new ArrayList<>();

            // loop until all words have been read
            while (scanner.hasNext()) {

                // add word to each list based on length
                String word = scanner.nextLine();

                if (word.length() < 5){
                    easyWords.add(word);
                } else if (word.length() < 9) {
                    normalWords.add(word);
                } else {
                    hardWords.add(word);
                }
            }

            System.out.println("**********************************************************");
            System.out.println("Welcome to Hangman! Try and guess a word, if you dare....");
            System.out.println("**********************************************************");

            // initialize boolean to determine if user wants to keep playing
            boolean playing = true;
            // initialize string that will be the word used and therefore removed from list after a game
            String wordUsed = "";

            do {

                // list difficulties and use list based on selection
                // return word used and remove it for list
                System.out.println("\nPlease select a difficulty:\n1 = Easy\n2 = Normal\n3 = Hard\nx = Exit");
                Scanner input = new Scanner(System.in);
                String difficultySelection = input.next();

                if (difficultySelection.equals("1")) {
                    System.out.println("Easy Mode selected.");
                    wordUsed = PlayGame.guessWord(easyWords);
                    easyWords.remove(wordUsed);
                }

                else if (difficultySelection.equals("2")) {
                    System.out.println("Normal Mode selected.");
                    wordUsed = PlayGame.guessWord(normalWords);
                    normalWords.remove(wordUsed);
                }

                else if (difficultySelection.equals("3")) {
                    System.out.println("Hard Mode selected.");
                    wordUsed = PlayGame.guessWord(hardWords);
                    hardWords.remove(wordUsed);
                }

                // Let user type "X" or "x" to exit
                else if (difficultySelection.equals("x") || difficultySelection.equals("X")) {
                    break;
                }

                // any invalid entries will let them try again
                else {
                    System.out.println("Invalid selection. Please try again.");
                    continue;
                }

                // ask user to play again
                System.out.println("\nPlay again?\nY or y = Yes\nAny key = No");
                Scanner playAgain = new Scanner(System.in);
                String cont = playAgain.next();
                if (!cont.equals("y") && !cont.equals("Y")) {
                    playing = false;
                }

            } while (playing);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(1); // terminate program
        }
        System.out.println("Thanks for playing.");
    }
}
