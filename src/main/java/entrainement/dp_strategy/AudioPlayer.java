package entrainement.dp_strategy;

public class AudioPlayer implements MediaPlayer {
    @Override
    public void play(String fileName, String audioType) {
        if (audioType.equals("mp3"))
            System.out.println("Je lis le mp3 "+fileName);
        else {
            MediaPlayer player = new X(audioType);
            player.play(fileName, audioType);
        }
    }
}

