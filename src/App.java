public class App {

    public static void main(String[] args) {
        //-- BETELGEUSE NOTES BELOW:
        Desktop myApp = new Desktop("2.4.2");
        
        for(Song song : myApp.library){
            System.out.println("song.getName() = " + song.getName());
        }

        String display = myApp.play(myApp.library.get(myApp.library.size()-1));// will always play the last song.

        System.out.println("display = " + display);// shows: Playing: I'm like a bird by [Ljava.lang.String;@1324409e due to artists being in an array

        for (Song song : myApp.library){
            System.out.println("myApp.play(song) = " + myApp.play(song));
        }

        myApp.printLog();
    }
}
    
//-- PREVIOUS CLASS NOTES BELOW:
//        DesktopMusicApp desktopMusicApp = new DesktopMusicApp(2.3, "Windows");
//
//        for (Song song: MusicApp.library) {
//            System.out.println(desktopMusicApp.play(song));
//            if(song.getId() == 2)
//                desktopMusicApp.pause(song);
//        }
//
//        desktopMusicApp.stop();
//
//    }

//}
