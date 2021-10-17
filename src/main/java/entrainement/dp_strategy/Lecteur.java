package entrainement.dp_strategy;

public class Lecteur {
    public static void main(String[] args) {
        AudioPlayer lecteur = new AudioPlayer();
        lecteur.play("Âme fifties", "mp3");
        lecteur.play("C’est tout ce qu’il me reste","mp4");
    }
}
