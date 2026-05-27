public class Song {

    String title;
    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getAlbum() {
        return album;
    }

    String artist;
    String album;


    public Song(String title, String artist, String album){

        this.title = title;
        this.artist = artist;
        this.album = album;
    }

    public String toString(){
        return ("Title: " + this.title + "Artist: " + this.artist + "Album: " + this.album); 
    }

}
    