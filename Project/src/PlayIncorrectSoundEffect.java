// play when player incorrectly guesses letter
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class PlayIncorrectSoundEffect {

    // initialize clip variable
    Clip incorrectClip;
    // initialize audio input stream variable
    AudioInputStream incorrectInputStream;

    // constructor to initialize stream and clip
    public PlayIncorrectSoundEffect() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        // code AudioInputStream object
        incorrectInputStream = AudioSystem.getAudioInputStream(new File("src/incorrect.wav"));

        // code clip reference
        incorrectClip = AudioSystem.getClip();

        // open audioInputStream to clip
        incorrectClip.open(incorrectInputStream);

    }

    // handles starting the sound effect
    public static void playSoundEffect() {

        try {

            // instantiate new audioPlayer object
            PlayIncorrectSoundEffect audioPlayer = new PlayIncorrectSoundEffect();

            // start clip
            audioPlayer.start();
        }

        catch (Exception ex)
        {
            System.out.println("There was an error playing the sound effect.");
            ex.printStackTrace();
        }
    }

    // play audio
    public void start() {
        incorrectClip.start();
    }
}
