/**
 * Sample of a tester file for the Playlist class. This file should demonstrate all the capability of your
 * playlist in the main method. You don't need to follow the testing specifications of this exactly
 * if you want to write your own separate tester instead.
 * Note that there's no need for a Scanner in this project-- all of the playlist can be 'hardcoded' into main.
 * @author
 * @version
 */
public class PlaylistTester {
    public static void main(String[] args) 
    {
        System.out.println("Initializing a Playlist...\n");
        //Make your playlist here
        Playlist playlist = new Playlist();

        System.out.println("Adding songs to the Playlist...\n");
        /**
         * Add some songs here. Note that the format for adding a Song to a Playlist p
         * is something like...
         * p.addSong(new Song(..., ..., ...))
         */
        playlist.add(new Song("That's So True", "Gracie Abrams", 246));
        playlist.add(new Song("Close To You", "Gracie Abrams", 345));
        playlist.add(new Song("BMF", "SZA", 301));
        playlist.add(new Song("Unwritten", "Natasha Bedingfield", 419));
        
        

        System.out.println("Printing the songs...\n");
        //Print out all the songs in the playlist to verify it's working correctly
        playlist.examineAllSongs();

        System.out.println("\nLiking the songs in position X, Y, Z, etc....\n");
        //Once your songs are 'liked', this should be reflected in the next printout
        playlist.likeSong(X); //thats so true
        playlist.likeSong(Z); // bmf

        System.out.println("Printing the songs...\n");
        playlist.examineAllSongs();

        System.out.println("\nRemoving the song in position A, B, C, etc...\n");
        playlist.removeSong(X);

        System.out.println("Printing the songs...\n");
        playlist.examineAllSongs();

        System.out.println("\nPrinting only the liked songs...\n");
        //Your Playlist should be able to do this without looping while in main!
        playlist.examineAllLikedSongs();

        System.out.println("\nPrinting the total duration of all songs...\n");
        //Note that the format should look something like minutes:seconds
        int totalDuration = playlist.getDuration();
        int minutes = totalDuration / 60;
        int seconds = totalDuration % 60;

        System.out.println("\nRemoving all unliked songs from the playlist...\n");
        //This should be doable with a single method call
        playlist.removeAllUnliked();

        System.out.println("Printing all songs...\n");
        //This should now look like only the liked songs list from before
        playlist.examineAllSongs();
    }
}
