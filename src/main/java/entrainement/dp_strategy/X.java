package entrainement.dp_strategy;

public class X implements MediaPlayer {
    private MP4Player player;
    public X(String audioType) {
        this.player = new MP4Player();
    }
    @Override
    public void play(String fileName, String audioType) {
        player.playMP4(fileName);
    }
}

