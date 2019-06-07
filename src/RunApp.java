public class RunApp {

    public static void main(String[] args) {

        DesktopMusicApp desktopMusicApp = new DesktopMusicApp(2.3, "Windows");

        for (Song song: MusicApp.library) {
            System.out.println(desktopMusicApp.play(song));
            if(song.getId() == 2)
                desktopMusicApp.pause(song);
        }

        desktopMusicApp.stop();

    }

}
