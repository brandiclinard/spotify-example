import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;

public class LibraryService {

    static ArrayList<Song> songs;

    static ArrayList<Song> updateLibrary (){//ACTION

        int initialId = 1;

        return new ArrayList<>(Arrays.asList(
                new Song((long) initialId++, "Song 1", Duration.ofSeconds(300), "Yaddi yadda", new String[]{"Artist 1", "Artist 2"}),
                new Song((long) initialId++, "Song 2", Duration.ofSeconds(124), "Yadda yadda", new String[]{"Blur", "Artist 2"}),
                new Song((long) initialId++, "Song 23234", Duration.ofSeconds(64), "Yadda yadda", new String[]{"Artist 1", "Artist 2"}),
                new Song((long) initialId++, "I'm like a bird", Duration.ofSeconds(344), "You\'re beautiful and that\'s for sure\n" + "You\'ll never ever fade\n" + "Your lovely, but it\'s not for sure\n" + "And I won\'t ever change", new String[]{"Nelly Furtado"})
        ));
    }
}
