public class DisplayWord {

    public static void displayWord(int wordLength) {



        String spaces = "";
        for (int i = 0; i < wordLength; i++) {
            spaces += " _";
        }
        System.out.print("\n");
        System.out.println(spaces);
    }

}
