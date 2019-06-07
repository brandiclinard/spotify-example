import java.util.List;

public class MusicApp {

    protected double version;
    protected List<Song> library;

    public MusicApp(double version, List<Song> library) {
        this.version = version;
        this.library = library;
    }

    protected String normalize(String name){
        return name.replace(" ", "_");
    }
}
