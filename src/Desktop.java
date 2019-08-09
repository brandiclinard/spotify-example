import java.util.Date;
import java.util.HashMap;

public class Desktop extends MusicApp  implements MusicPlayer{
    //--BETELGEUSE CLASS NOTES BELOW:

    HashMap<String, Integer> log;

    public Desktop(String version){
        super(version); // this is how we pull from the extended class to get the methods set by the parent and utilize by this child.
        this.log = new HashMap<>();
    }

    @Override
    public String play(Song song) {
//        return "Playing: " + song.getName() + " by " + Arrays.toString(song.getArtists());// using the getting because the properties of song are private. had to add arrays.tostring to artists in order to get the artist name out of the array
        //--below is the fix to show it nicely to the user without the array brackets
        this.log.put(String.valueOf(new Date().getTime())  + song.getId(), song.getId());
        return "Playing: " + song.getName() + " by " + song.displayArtistsAsText();
    }

    public void printLog(){
        for(String key: this.log.keySet()){
            Song song = super.library.get(this.log.get(key) -1);
            System.out.println("LOG: " + key + " " + song.getId() + " " + song.getName() + " " + song.displayArtistsAsText());

        }
    }


//-- PREVIOUS CLASS NOTES BELOW:
//    private HashMap<Date, Integer> log;
//    private String OS;
//    private Date today = new Date(System.currentTimeMillis());
//
//    public DesktopMusicApp(double version, String OS) {
//        super(version);
//        this.OS = OS;
//        // Initializes the HashMap
//        this.log = new HashMap<>();
//        this.log.put(today, 0);
//        Seeder.seedLog();
//    }
//
//    // OOP implemented
//    @Override
//    public String play(Song song) {
//        // 1. display the song info
//        this.log.put(today, this.log.get(today)+1);
//
//        // 2. it sings if mac is used
//        if(OS.equals("MacOS")){
//            this.sing(song);
//        }
//
//        // 3. Updating the song info UI
//        System.out.println("Title = " + song.getName());
//
//        // 4. return url to stream
//        return "//streamer/songs/" + MusicApp.normalizeName(song.getName()) + ".mp3";
//    }
//
//    // Exposure to Duration class and time handling
//    @Override
//    public void pause(Song song) {
//        // pauses the song
//        System.out.println(song.getName() +" was paused at = " + MusicApp.formatOutput(song.getLength()));
//    }
//
//
//    @Override
//    public void stop() {
//        // stops the song
//        System.out.println("stops the song");
//        this.printLog();
//    }
//
//    // Just for fun, it sings the lyrics
//    public void sing(Song song){
//        try {
//            Runtime.getRuntime().exec(
//                    "say -r 150  "+ song.getLyrics());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    // How to loop through a HashMap
//    public void printLog(){
//        for (Date entry: this.log.keySet()) {
//            System.out.println(entry + " " + this.log.get(entry));
//        }
//    }
}
