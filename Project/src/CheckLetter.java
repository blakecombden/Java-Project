import java.util.Scanner;

public class CheckLetter {

    public static void checkLetter(String word, int errors) {

        Scanner input = new Scanner(System.in);
        String letter = input.next();
        if (word.contains(letter)) {

            DisplayGallows.displayGallows(errors);
            DisplayWord.displayWord(word.length());

        } else {
            errors += 1;
        }

    }
}
