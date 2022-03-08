import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class songplay
{
    Clip clip;
    Long currentFrame;
    AudioInputStream audioInputStream;
    String fp;
	public void play(String filepath) throws UnsupportedAudioFileException, IOException, LineUnavailableException
    {
		try
		{
			this.fp=filepath;
			audioInputStream = AudioSystem.getAudioInputStream(new File(fp).getAbsoluteFile());
			clip = AudioSystem.getClip();
			clip.open(audioInputStream);
        	clip.start();
		}
		catch (Exception ex) 
		{
			System.out.println("Error with playing sound.");
			System.out.println(ex);
		}
	}
    public void stop() throws UnsupportedAudioFileException,IOException, LineUnavailableException 
    {
        currentFrame = 0L;
        clip.stop();
        clip.close();
	}
}
      
