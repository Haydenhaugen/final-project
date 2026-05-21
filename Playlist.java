public class Playlist {
    SongNode head;
    int size;

    public Playlist(){
        this.head = null;
        this.size = 0;

    }
    public void addToFront(Song song){
        SongNode newSong = new SongNode(song);
        newSong.nextSong = head;
        head = newSong; //store the first item in the LL as head
        size++;
    }
    public void addToBack(Song song){
        SongNode newSong = new SongNode(song);
        if(head == null){
            head = newSong;
            size++;
            return;
        }
        SongNode current = head;
        while(current.nextSong != null){
            current = current.nextSong;
        }
        current.nextSong = newSong;
        size++;
    }

    public Song removeFirst(){
        Song remove = head.song;
        head = head.nextSong;
        size--;
        return remove;
    }
    public void playAll(){
        System.out.print("[");
        SongNode node = head;
        while(node != null){
            System.out.print(node.song + ", ");
            node = node.nextSong;
        }
        System.out.println("]");
        
        }
        public int size(){
            return size;
    }
     public void print(){
        System.out.print("[");
        SongNode current = head;
        while(current != null){
            System.out.print(current.song.title);
            if(current.nextSong != null){
                System.out.print(" -> ");
            }
            current = current.nextSong;
            
        }
        System.out.print("]");
    }
        
}
