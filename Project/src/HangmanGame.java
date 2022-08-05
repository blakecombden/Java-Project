import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HangmanGame {

    public static void main(String[] args) {

        try {

            Scanner scanner = new Scanner(new File("src/words.txt"));

            

        } catch (FileNotFoundException e) {

            e.printStackTrace();
            System.exit(1); // terminate program

        }
    }
}
