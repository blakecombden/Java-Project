import java.util.List;

public class DisplayWord {

    public static boolean displayWord(String word, List<Character> guesses, int errors) {

        int correctGuesses = 0;

        if (errors != 7) {
            System.out.print("\n");
            for (int i = 0; i < word.length(); i++) {
                if (guesses.contains(word.charAt(i))) {
                    System.out.print(word.charAt(i));
                    correctGuesses ++;
                } else {
                    System.out.print("-");
                }
            }
        } else {
            System.out.println("\nThe word was: " + word);
        }
        return (word.length() == correctGuesses);
    }
}
