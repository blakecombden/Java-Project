# Java-Project
CP2561 Java Programming II Project - Hangman

Run Program:

Open the folder called "Java-Project" in an IDE. In the src folder, there are 9 java files, 5 wav files, and 1 txt file:

- HangmanGame.java
- PlayGame.java
- Gallows.java
- SelectedWord.java
- PlayBackgroundMusic.java
- PlayCorrectSoundEffect.java
- PlayIncorrectSoundEffect.java
- PlayVictorySoundEffect.java
- PlayFailureSoundEffect.java

- background.wav
- correct.wav
- incorrect.wav
- victory.wav
- failure.wav

- words.txt

Run HangmanGame.main() to start the game.

Game Description:

Hangman asks the player to guess the letter of a random word based on its length. If the player guesses a letter that is in the word, the letter is written where it would be in the word. Reveal all the letters to win. If the player guesses a letter that is not in the word, part of a hanged man is drawn. If the drawing is made complete, like the ASCII art below, the player loses.

 +---+
 
 |
 0
/|\
/ \

At the beginning of each game, the player is asked to choose a difficulty setting, with Easy Mode giving the player a word that is 9 or more letters long, Normal Mode giving the player a word that is between 5 and 8 letters long, and Hard Mode giving the player a word that is 4 or fewer letters long. This is done by reading the entire list of words from the words.txt file and placing each in a list based on the word's length.

Letters are revealed as the player guesses correctly and parts of the hanged man are drawn as the player guesses incorrectly, all in ASCII art. A list of letters the player has already guessed is also shown to the player after each guess. If a player guesses a letter they have already guessed, the program will tell them this and award no penalty. The program will keep asking the player to guess until they win or guess wrong 6 times, at which point they lose. Either way, the word is removed from its list so it can not be randomly selected again and the player is asked if they want to play again. If they do, they are brought back to the difficulty selection menu. If not, the program ends.

Sources:

List of words from Xethron on GitHub:
(https://github.com/Xethron/Hangman)

Background Music and sound effects from users on Freesound:
Sub-d (background music)
FoolBoyMedia (correct sfx)
RICHERlandTV (incorrect sfx)
chripei (victory sfx)
kirbydx (failure sfx)
