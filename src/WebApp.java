//-- BETELGEUSE NOTES BELOW:
public class WebApp extends MusicApp implements MusicPlayer{
    public WebApp(String version){
        super(version);
    }

    @Override
    public String play(Song song) {
        return "Streaming: " + song.getName() + " by " + song.displayArtistsAsText();
    }
}
//--PREVIOUS CLASS NOTES BELOW:
//import java.util.HashMap;
//
//public class WebMusicApp extends MusicApp implements MusicPlayer {
//
//    private HashMap<Song, User> likes;
//
//    public WebMusicApp(String version, HashMap<Song, User> likes) {
//        super(version);
//        this.likes = likes;
//    }
//
//    public HashMap<Song, User> getLikes() {
//        return likes;
//    }
//
//    public void setLikes(HashMap<Song, User> likes) {
//        this.likes = likes;
//    }
//
//    @Override
//    public String play(Song song) {
//        return null;
//    }
//
//    @Override
//    public void pause(Song song) {
//
//    }
//
//    @Override
//    public void stop() {
//
//    }
//}
