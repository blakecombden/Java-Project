import java.util.List;

public class SelectedWord {

    public static boolean displayWord(String word, List<Character> guesses, int errors) {

        // initialize number of letters revealed to compare with length of word
        int lettersRevealed = 0;

        // if user has guesses left, print progress of word
        if (errors != 6) {
            System.out.println("\n");
            for (int i = 0; i < word.length(); i++) {
                // if user has guessed the letter within the word, reveal it
                if (guesses.contains(word.charAt(i))) {
                    System.out.print(word.charAt(i));
                    lettersRevealed ++;
                }

                // otherwise, print a dash
                else {
                    System.out.print("-");
                }
            }
        }

        // if user has lost, reveal word
        else {
            System.out.println("\nThe word was: " + word);
        }

        // return if word has been guessed or not
        return (word.length() == lettersRevealed);
    }
}
