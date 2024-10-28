class Song {
    String title;
    Song next;

    // Konstruktor untuk menginisialisasi objek Song
    public Song(String title) {
        this.title = title;
        this.next = null;
    }
}

class Playlist {
    private Song head; // Menunjuk ke lagu pertama dalam playlist
    private Song tail; // Menunjuk ke lagu terakhir dalam playlist

    // Konstruktor untuk menginisialisasi objek Playlist
    public Playlist() {
        this.head = null;
        this.tail = null;
    }

    // Metode untuk menambah lagu di akhir playlist
    public void addSong(String title) {
        Song newSong = new Song(title);
        if (head == null) {
            // Jika playlist kosong, set lagu baru sebagai head dan tail
            head = newSong;
            tail = newSong;
        } else {
            // Jika tidak kosong, tambahkan lagu baru di akhir
            tail.next = newSong;
            tail = newSong;
        }
    }

    // Metode untuk menampilkan semua lagu dalam playlist
    public void displayPlaylist() {
        Song current = head;
        if (current == null) {
            System.out.println("Playlist kosong.");
            return;
        }
        System.out.println("Daftar Lagu dalam Playlist:");
        while (current != null) {
            System.out.println("- " + current.title);
            current = current.next;
        }
    }
}

// Contoh penggunaan kelas Playlist dan Song
public class PlaylistLagu {

    public static void main(String[] args) {
        Playlist myPlaylist = new Playlist();

        myPlaylist.addSong("Tunggu Apa Lagi");
        myPlaylist.addSong("Mundur Perlahan");
        myPlaylist.addSong("Mengapa");

        myPlaylist.displayPlaylist();
    }
}


