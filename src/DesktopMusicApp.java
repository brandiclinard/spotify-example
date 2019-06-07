
import java.io.IOException;
import java.sql.Date;
import java.util.HashMap;
import java.util.List;

public class DesktopMusicApp extends MusicApp implements Playable {

    private HashMap<Date, Integer> log;
    private Date now = new Date(System.currentTimeMillis());

    public DesktopMusicApp(double version, List<Song> playlist) {
        super(version, playlist);
//        this.log = log;
        System.out.println(" constructor now = " + now);
        this.log = new HashMap<>();
        this.log.put(now, 0);
    }

    public HashMap<Date, Integer> getLog() {
        return log;
    }




    @Override
    public String play(Song song) {
//        1 display the song info

        System.out.println("now = " + now);
        this.log.put(now, this.log.get(now)+1);

        // 2 Updating the song info UI
        System.out.println("Title = " + song.getName());

        try {
            Process process = Runtime.getRuntime().exec(
                    "say -r 150  "+ song.getLyrics(), null, null);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "//streamer/songs/" + super.normalize(song.getName()) + ".mp3";
    }

    @Override
    public void pause(Song song) {
        // pauses the song
        System.out.println(song.getName() +" was paused at = " + song.getLength().toMinutesPart()+":"+ song.getLength().toSecondsPart());
    }

    @Override
    public void stop() {
        // stops the song
        System.out.println("stops the song");
    }
}
