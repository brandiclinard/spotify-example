import java.time.Duration;
import java.util.*;

public class RunApp {

    public static String formatOutput(Duration d) {
        int minutes = d.toMinutesPart();
        int seconds = d.toSecondsPart();
        return String.format("%02d:%02d", minutes, seconds);
    }

    public static List<User> seedUsers() {
        int initialId = 1;
        return new ArrayList<>(Arrays.asList(
                new User((long) initialId++, "bill5", "bill@email.com", "strongpass"),
                new User((long) initialId++, "karen5", "karen@email.com", "strongpass"),
                new User((long) initialId++, "linda5", "linda@email.com", "strongpass"),
                new User((long) initialId++, "steve5", "steve@email.com", "strongpass")
        ));
    }

    public static List<Song> seedSongs() {
        int initialId = 1;
        return new ArrayList<>(Arrays.asList(
                new Song((long) initialId++, "Song 1", Duration.ofSeconds(300), "Yadda yadda", new String[]{"Artist 1", "Artist 2"}),
                new Song((long) initialId++, "Song 1", Duration.ofSeconds(124), "Yadda yadda", new String[]{"Artist 1", "Artist 2"}),
                new Song((long) initialId++, "Song 1", Duration.ofSeconds(64), "Yadda yadda", new String[]{"Artist 1", "Artist 2"}),
                new Song((long) initialId++, "Song 1", Duration.ofSeconds(344), "Yadda yadda", new String[]{"Artist 1", "Artist 2"})
        ));
    }

    public static void viewSongs() {
        List<Song> songs = seedSongs();
        for (Song song : songs) {
            System.out.println(song);
        }
    }

    public static void viewUsers() {
        List<User> users = seedUsers();
        for (User user : users) {
            System.out.println(user);
        }
    }

    public static HashMap<Date, Integer> seedLog() {
        HashMap<Date, Integer> logs = new HashMap<>();
        logs.put(new Date(), 1);
        logs.put(new Date(System.currentTimeMillis()-24*60*60*1000), 4);
        logs.put(new Date(System.currentTimeMillis()-24*60*60*1000*2), 8);
        logs.put(new Date(System.currentTimeMillis()-24*60*60*1000*3), 22);
        logs.put(new Date(System.currentTimeMillis()-24*60*60*1000*4), 12);
        logs.put(new Date(System.currentTimeMillis()-24*60*60*1000*7), 2);
        return logs;
    }

    public static void main(String[] args) {

    }

}
