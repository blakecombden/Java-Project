import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class PlayGame {

    public static void guessWord(List<String> words) {

        Random rand = new Random();
        String word = words.get(rand.nextInt(words.size()));

        System.out.print(word); // for testing

        List<Character> guesses = new ArrayList<>();
        int errors = 0;
        boolean playing = true;

        System.out.println("\n");
        DisplayGallows.displayGallows(0);
        DisplayWord.displayWord(word, guesses, errors);
        System.out.print("\n");

        do {

            System.out.println("\nPlease enter a letter:");
            Scanner input = new Scanner(System.in);
            String letterGuessed = input.next();

            if (guesses.contains(letterGuessed.charAt(0))) {
                System.out.println("\nYou already guessed that letter. No penalty.");

            } else if (word.contains(letterGuessed)) {
                System.out.println("Good guess!");
                guesses.add(letterGuessed.charAt(0)); // only take first char

            } else if (!guesses.contains(letterGuessed.charAt(0))) {
                errors ++;
                DisplayGallows.displayGallows(errors);
                System.out.println("Bad guess...");
                guesses.add(letterGuessed.charAt(0)); // only take first char

            } else {
                System.out.println("Invalid entry. Please try again.");
                continue;
            }

            if (DisplayWord.displayWord(word, guesses, errors)) {
                System.out.println("\n\nYou win!");
                playing = false;
            }

            if (errors == 7) {
                System.out.println("\nYou lose!");
                playing = false;
            }

            if (playing) {
                DisplayLettersGuessed.displayLettersGuessed(guesses, errors);
            }

        } while (playing);
    }
}
