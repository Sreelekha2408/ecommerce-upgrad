public class MusicPlayer {
    String songName;
    String artist;
    boolean isPlaying;

    void playSong() {
        if(isPlaying) {
            System.out.println("Now playing: " + songName + " by " + artist);
        }
    }
    void pauseSong() {
        if(!isPlaying) System.out.println("Song paused.");
    }
    void stopSong(){
        if(!isPlaying) System.out.println("Song stopped.");
    }

    public static void main(String[] args) {
        MusicPlayer music = new MusicPlayer();
        music.songName = "Shape of You";
        music.artist = "Ed Sheeran";
        music.isPlaying = true;
        music.playSong();
        music.isPlaying = false;
        music.pauseSong();
        music.isPlaying = true;
        music.playSong();
        music.isPlaying = false;
        music.stopSong();
    }
}
