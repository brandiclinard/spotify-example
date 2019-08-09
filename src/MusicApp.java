import java.time.Duration;
import java.util.*;

public class MusicApp {
    //-- BETELGEUSE NOTES BELOW:
    double version;
    ArrayList<Song> library;


    public MusicApp(double version) {
        this.version = version;
        this.library = LibraryService.updateLibrary();
    }





    //-- PREVIOUS CLASS NOTES BELOW:
//    protected double version;
//    protected static List<Song> library = Seeder.seedSongs();
//
//    public MusicApp(double version) {
//        this.version = version;
//    }
//
//    public static String normalizeName(String name){
//        return name.replace(" ", "_");
//    }
//
//    public static String formatOutput(Duration d) {
//        int minutes = d.toMinutesPart();
//        int seconds = d.toSecondsPart();
//        return String.format("%02d:%02d", minutes, seconds);
//    }
}
