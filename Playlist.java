import java.util.ArrayList;

/**
 * The Playlist class, which will keep track of a playlist of Song objects
 * Refer to the project description to make sure you have access to all available methods
 */
public class Playlist 
{
    /**
     * Fields-- This will likely just need to be the ArrayList of Songs. Reference our previous problems
     * (CarDealership, Zoo) for structure on how this will look
     */
    private ArrayList<Song> Playlist;
    private ArrayList<Song> songs;
    private String title;
    private String artist;
    private int durationInSeconds;
    private boolean liked;


    /**
     * Constructor-- this doesn't need any parameters. You should just initialize the ArrayList and
     * then use additional methods to add Songs in one-by-one
     */

    public Playlist()
    {
        Playlist = new ArrayList<>();
        songs = new ArrayList<>();
        
    }


    /**
     * Methods-- Remember that you need to be able to complete all of the following:
     * Adding a song
     * 'liking' a song
     * Removing a specific song
     * Examining all Songs (a String return or void print makes sense here)
     * Examining a sublist of all liked songs
     * Determining the total duration of all songs
     * Removing all unliked songs from the playlist (careful with this one!)
     */
    public void add(Song newSong)
    {
        songs.add(newSong);

    }
    
    public void add(String title, String author, int durationInSeconds)
    {
        songs.add(new Song(title, author, durationInSeconds));
    }

    public void likeSong(int song)
    {
        if (song >= 0 && song < songs.size())
        {
            songs.get(song).setLiked(true);
        }
    }

    public void removeSong()
    {
        if (song >= 0 && song < songs.size())
        {
            songs.remove(song);
        }
    }

    public void examineAllSongs()
    {
        //go through arraylist using i and print them all out
        for (int i = 0; i < Playlist.size(); i++)
        for (Song s : songs)
        {
            System.out.println("Song title = " + title + ", artist = " + artist + ",durationInSeconds = " + durationInSeconds + ",liked=" + liked + "]");
        }


    }

    public void examineAllLikedSongs()
    {
         for (Song s : Playlist)
        {
            if (s.isLiked == true)
            {
                System.out.println("Song title = " + title + ", artist = " + artist + ",durationInSeconds = " + durationInSeconds + ",liked=" + liked + "]");
            }
        }
    }

    public void removeAllUnliked()
    {
        for (Song s : Playlist)
        {
            if (s.isLiked == false)
            {
                Playlist.remove(i);
            }
        }
    }
}
