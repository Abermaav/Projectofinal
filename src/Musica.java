// src/Musica.java
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Musica {
    private static Clip audioClip;

    public static void playWAV(String wavFile, Runnable onCompletion) {
        try {
            File audioFile = new File(wavFile);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
            AudioFormat format = audioStream.getFormat();
            DataLine.Info info = new DataLine.Info(Clip.class, format);
            audioClip = (Clip) AudioSystem.getLine(info);
            audioClip.open(audioStream);
            audioClip.start();

            audioClip.addLineListener(event -> {
                if (event.getType() == LineEvent.Type.STOP) {
                    audioClip.close();
                    onCompletion.run();
                }
            });

        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }
}