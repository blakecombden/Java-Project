// play background music during gameplay
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class PlayBackgroundMusic {

    // initialize clip variable
    Clip musicClip;
    // initialize audio input stream variable
    AudioInputStream backgroundInputStream;

    // constructor to initialize stream and clip
    public PlayBackgroundMusic() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        // code AudioInputStream object
        backgroundInputStream = AudioSystem.getAudioInputStream(new File("src/background.wav"));

        // code clip reference
        musicClip = AudioSystem.getClip();

        // open audioInputStream to clip
        musicClip.open(backgroundInputStream);

        // loop music continuously while playing game
        musicClip.loop(Clip.LOOP_CONTINUOUSLY);
    }

    // handles starting and stopping the background music
    public static void handleAudio(boolean playingMusic) {

        try {

            // instantiate new audioPlayer object
            PlayBackgroundMusic audioPlayer = new PlayBackgroundMusic();

            // use boolean to start or stop music
            if (playingMusic)  {
                audioPlayer.start();
            } else {
                audioPlayer.stop();
            }
        }

        catch (Exception ex)
        {
            System.out.println("There was an error playing the background music.");
            ex.printStackTrace();
        }
    }

    // play audio
    public void start() {
        musicClip.start();
    }

    // stop audio
    public void stop() {
        musicClip.stop();
        musicClip.close();
    }
}