import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class PlayGame {

    public static String guessWord(List<String> words) {

        // get random word using size of list as upper bound
        Random rand = new Random();
        String word = words.get(rand.nextInt(words.size()));

        // initialize list of guessed words, number of errors, and boolean ofr game continuation
        List<Character> guesses = new ArrayList<>();
        int errors = 0;
        boolean playing = true;

        // print initial ASCII art and length of word
        System.out.println("\n");
        Gallows.displayGallows(0);
        SelectedWord.displayWord(word, guesses, errors);
        System.out.print("\n");

        do {

            System.out.println("\nPlease enter a single letter:");
            Scanner input = new Scanner(System.in);
            String letterGuessed = input.next();

            // ensure guess is a letter
            if (letterGuessed.matches("[A-Za-z]")) {

                // if letter is already guessed, retry with no penalty
                if (guesses.contains(letterGuessed.charAt(0))) {
                    System.out.print("\nYou already guessed that letter. No penalty.");
                }

                // if letter is correct, tell user and add to guesses list
                else if (word.contains(letterGuessed)) {
                    System.out.print("Good guess!");
                    guesses.add(letterGuessed.charAt(0)); // only take first char
                }

                // if letter is incorrect, tell user, display gallows with added body part, and add to guesses list
                else {
                    errors ++;
                    System.out.println("\nBad guess...");
                    Gallows.displayGallows(errors);
                    guesses.add(letterGuessed.charAt(0)); // only take first char

                }

                // display word and if all letters are guessed correctly, let user know and end game
                if (SelectedWord.displayWord(word, guesses, errors)) {
                    System.out.println("\n\nYou win!");
                    playing = false;
                }

                // if all body parts are added, let user know and end game
                if (errors == 6) {
                    System.out.println("\nYou lose!");
                    playing = false;
                }

                // if game continues, display letters guessed
                if (playing) {
                    System.out.print("\nLetters guessed so far: ");
                    for (Character letter : guesses) {
                        System.out.print(letter + " ");
                    }
                    System.out.print("\n");
                }
            }
            else {
                System.out.println("Invalid entry. Please try again.");
            }

        } while (playing);

        return word;
    }
}
