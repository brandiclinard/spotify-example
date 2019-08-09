import java.time.Duration;

public class Song {
    //-- BETELGEUSE CLASS NOTES BELOW:
    private long id;
    private String name;
    private Duration length;
    private String lyrics;
    private String [] artists;

    public Song(long id, String name, Duration length, String lyrics, String[] artists) {
        this.id = id;
        this.name = name;
        this.length = length;
        this.lyrics = lyrics;
        this.artists = artists;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Duration getLength() {
        return length;
    }

    public void setLength(Duration length) {
        this.length = length;
    }

    public String getLyrics() {
        return lyrics;
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }

    public String[] getArtists() {
        return artists;
    }

    public void setArtists(String[] artists) {
        this.artists = artists;
    }

    //-- PREVIOUS CLASS NOTES BELOW:
//    private long id;
//    private String name;
//    private Duration length;
//    private String lyrics;
//    private String[] artists;
//
//    public Song(long id, String name, Duration length, String lyrics, String[] artists) {
//        this.id = id;
//        this.name = name;
//        this.length = length;
//        this.lyrics = lyrics;
//        this.artists = artists;
//    }
//
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Duration getLength() {
//        return length;
//    }
//
//    public void setLength(Duration length) {
//        this.length = length;
//    }
//
//    public String getLyrics() {
//        return lyrics;
//    }
//
//    public void setLyrics(String lyrics) {
//        this.lyrics = lyrics;
//    }
//
//    public String[] getArtists() {
//        return artists;
//    }
//
//    public void setArtists(String[] artists) {
//        this.artists = artists;
//    }
}
