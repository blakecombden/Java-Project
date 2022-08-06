import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class HangmanGame {

    public static void main(String[] args) {

        try {

            Scanner scanner = new Scanner(new File("src/words.txt"));

            List<String> easyWords = new ArrayList<>();
            List<String> mediumWords = new ArrayList<>();
            List<String> hardWords = new ArrayList<>();

            while (scanner.hasNext()) {

                String word = scanner.nextLine();

                if (word.length() < 5){
                    easyWords.add(word);
                } else if (word.length() < 9) {
                    mediumWords.add(word);
                } else {
                    hardWords.add(word);
                }
            }

            System.out.println("**********************************************************");
            System.out.println("Welcome to Hangman! Try and guess a word...if you dare....");
            System.out.println("**********************************************************");
            System.out.println("Please select a difficulty:\n1. Easy\n2. Medium\n3. Hard");

            Scanner input = new Scanner(System.in);
            int difficultySelection = input.nextInt();

            int revealedLetters = 0;
            int errors = 0;
            int wordLength = 0;
            List<String> lettersGuessed = new ArrayList<>();
            Random rand = new Random();
            boolean validSelection = false;

            do {

                if (difficultySelection == 1) {
                    validSelection = true;
                    String randomWord = easyWords.get(rand.nextInt(348));
                    System.out.println(randomWord);
                    wordLength = randomWord.length();
                    DisplayGallows.displayGallows(errors);
                    DisplayWord.displayWord(wordLength);
                    DisplayLettersGuessed.displayLettersGuessed(lettersGuessed);
                    CheckLetter.checkLetter(randomWord, errors);

                } else if (difficultySelection == 2) {
                    validSelection = true;
                    String randomWord = mediumWords.get(rand.nextInt(449));
                    System.out.println(randomWord);
                    DisplayGallows.displayGallows(errors);
                    DisplayWord.displayWord(wordLength);
                    DisplayLettersGuessed.displayLettersGuessed(lettersGuessed);

                } else if (difficultySelection == 3) {
                    validSelection = true;
                    String randomWord = hardWords.get(rand.nextInt(52));
                    System.out.println(randomWord);
                    DisplayGallows.displayGallows(errors);
                    DisplayWord.displayWord(wordLength);
                    DisplayLettersGuessed.displayLettersGuessed(lettersGuessed);

                } else {
                    System.out.println("Invalid selection. Please try again.");
                }

            } while (!validSelection);

        } catch (FileNotFoundException e) {

            e.printStackTrace();
            System.exit(1); // terminate program

        }
    }
}
