import java.util.*;

public class RunApp {

    public static void main(String[] args) {
        DesktopMusicApp desktopMusicApp = new DesktopMusicApp(2.3, "Windows");

        for (Song song: Seeder.seedSongs()) {
            System.out.println(desktopMusicApp.play(song));
            desktopMusicApp.pause(song);
        }

        desktopMusicApp.stop();

    }

}
