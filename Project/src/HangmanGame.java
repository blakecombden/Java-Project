import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class HangmanGame {

    public static void main(String[] args) {

        try {

            Scanner scanner = new Scanner(new File("src/words.txt"));

            List<String> easyWords = new ArrayList<>();
            List<String> normalWords = new ArrayList<>();
            List<String> hardWords = new ArrayList<>();

            while (scanner.hasNext()) {

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
            System.out.println("Welcome to Hangman! Try and guess a word...if you dare....");
            System.out.println("**********************************************************");


            boolean playing = true;

            do {

                System.out.println("\nPlease select a difficulty. Type x to exit.\n1. Easy\n2. Normal\n3. Hard");
                Scanner input = new Scanner(System.in);
                String difficultySelection = input.next();

                if (difficultySelection.equals("1")) {
                    System.out.println("Easy Mode selected.");
                    PlayGame.guessWord(easyWords);

                    System.out.println("\nPlay again?\nY or y = Yes\nAny key = No");
                    Scanner playAgain = new Scanner(System.in);
                    String cont = playAgain.next();
                    if (!cont.equals("y") && !cont.equals("Y")) {
                        playing = false;
                    }

                } else if (difficultySelection.equals("2")) {
                    System.out.println("Normal Mode selected.");
                    PlayGame.guessWord(normalWords);

                    System.out.println("\nPlay again?\nY or y = Yes\nAny key = No");
                    Scanner playAgain = new Scanner(System.in);
                    String cont = playAgain.next();
                    if (!cont.equals("y") && !cont.equals("Y")) {
                        playing = false;
                    }

                } else if (difficultySelection.equals("3")) {
                    System.out.println("Hard Mode selected.");
                    PlayGame.guessWord(hardWords);

                    System.out.println("\nPlay again?\nY or y = Yes\nAny key = No");
                    Scanner playAgain = new Scanner(System.in);
                    String cont = playAgain.next();
                    if (!cont.equals("y") && !cont.equals("Y")) {
                        playing = false;
                    }

                } else if (difficultySelection.equals("x")) {
                    playing = false;

                } else {
                    System.out.println("Invalid selection. Please try again.");
                }

            } while (playing);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(1); // terminate program
        }
        System.out.println("Thanks for playing.");
    }
}
