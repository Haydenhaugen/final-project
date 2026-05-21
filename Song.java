public class Song {
<<<<<<< HEAD
    String title;
    Strimg artist;
    String album
    public Son(String title,String artist,String album){
=======
        String title;
    String artist;
    String album;

    public Song(String title, String artist, String album){
>>>>>>> 4c536c2 (Implement Playlist, Song, and SongNode classes with methods for adding, removing, and printing songs)
        this.title = title;
        this.artist = artist;
        this.album = album;
    }
<<<<<<< HEAD
    @Override
    public String toString(){
        return ("Title: " + n/this.title + "Artist: " + n/this.artist + "Album: " + n/this.album) 
    }
    
=======

    public String toString(){
        return title + " by " + artist;
    }

>>>>>>> 4c536c2 (Implement Playlist, Song, and SongNode classes with methods for adding, removing, and printing songs)
}
