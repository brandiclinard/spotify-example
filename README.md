# Spotify Java App Spec

Classes 

- MusicApp
	- Decimal version
	- ArrayList<Song> playlist

- Desktop implements Player() interface
	- HashMap<Date, Integer> log
	
- WebApp implements Player() interface
    - HashMap<Song, User> likes
    
- Song
	- Long id
	- String name
	- Duration length
	- String lyrics
	- String[] artists

- User
	- Long id
	- String username
	- String email
	- String password

- Interface Playable
	- String play(Song song); // starts the streaming service, with a song
	- void stop(); // stops the streaming service
	- void pause(Song song); 
