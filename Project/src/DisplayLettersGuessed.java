import java.util.ArrayList;
import java.util.List;

public class DisplayLettersGuessed {

    public static void displayLettersGuessed(List<Character> guesses, int errors) {

        if (errors != 7) {
            System.out.print("\nLetters guessed so far: ");
            for (Character letter : guesses) {
                System.out.print(letter + " ");
            }
        }
        System.out.print("\n");
    }
}
