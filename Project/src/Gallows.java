public class Gallows {

    public static void displayGallows(int errors) {

        // display gallows based on number of incorrect guesses
        System.out.println(" +---+\n |\t |");

        if (errors >= 1) {
            System.out.println(" 0");
        }

        if (errors == 2) {
            System.out.println(" |");
        }

        if (errors == 3) {
            System.out.println("/|");
        }
        if (errors >= 4) {
            System.out.println("/|\\");
        }

        if (errors == 5) {
            System.out.println("/");
        }

        if (errors == 6) {
            System.out.println("/ \\");
        }
    }
}
