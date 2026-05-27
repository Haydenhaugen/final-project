public class Main1{
    public static void main(String[] args){
        Playlist myPL = new Playlist();
        myPL.print();
        Song song1 = new Song("What did I miss?","Drake","Iceman");
        myPL.addToFront(song1);
        Song song2 = new Song("Billie Jean", "Michael Jackson", "Thiller");
        myPL.addToFront(song2);
        myPL.print();
        Song song3 = new Song("Forever Young","67 boi", "yurr" );
        myPL.addToBack(song3);
        myPL.print();
        myPL.playAll();
        myPL.removeSong("Forever Young");
        myPL.playAll();
        
    }
}