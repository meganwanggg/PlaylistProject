import java.util.ArrayList;

/**
 * The Playlist class, which will keep track of a playlist of Song objects
 * Refer to the project description to make sure you have access to all available methods
 * @author Megan Wang & Bella Duncan
 * @version 2025-01-24
 */
public class Playlist 
{
    /**
     * Fields-- This will likely just need to be the ArrayList of Songs. Reference our previous problems
     * (CarDealership, Zoo) for structure on how this will look
     */
    private ArrayList<Song> playlist;
    //private ArrayList<Song> songs;
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
        playlist = new ArrayList<>();
        //songs = new ArrayList<>();
        
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
        playlist.add(newSong);

    }
    
    /**
     * The overloaded method add adds a song
     * 
     * @param String title the title of the song
     * @param author the author of the song
     * @param int durationInSeconds the length of the song
     */
    public void add(String title, String author, int durationInSeconds)
    {
        playlist.add(new Song(title, author, durationInSeconds));
    }

    /**
     * The method likeSong likes a song in the playlist.
     * 
     * @param Song s a specific song in the playlist
     */
    public void likeSong(Song s)
    {
        //if (playlist.get(song) >= 0 && song < songs.size())
        
            s.setLiked(true);
        
    }

    /**
     * The method removeSong removes a song from a playlist.
     * 
     * @param Song s a specific song in the playlist
     */
    public void removeSong(Song s)
    {
        //if (playlist >= 0 && song < songs.size())
        
            playlist.remove(s);
        
    }

    /**
     * The method examineAllSongs lists all the songs in the playlist
     * 
     */
    public void examineAllSongs()
    {
        //go through arraylist using i and print them all out
        for (int i = 0; i < playlist.size(); i++)
        for (Song s : playlist)
        {
            System.out.println("Song title = " + title + ", artist = " + artist + ",durationInSeconds = " + durationInSeconds + ",liked=" + liked + "]");
        }


    }

    /**
     * The method examineAllLikedSongs lists all the liked songs in the playlist.
     * 
     * 
     */
    public void examineAllLikedSongs()
    {
         for (Song s : playlist)
        {
            if (s.isLiked() == true)
            {
                System.out.println("Song title = " + title + ", artist = " + artist + ",durationInSeconds = " + durationInSeconds + ",liked=" + liked + "]");
            }
        }
    }
    
    /**
     * The method getTotalDuration finds the total length of all the songs in the playlist.
     * 
     * @return int the total time in seconds of the playlist
     */
    public int getTotalDuration()
    {
        int totalSeconds = 0;
        for (Song s : playlist)
        {
            totalSeconds += s.getDuration();
        }
        return totalSeconds;
    }

    /**
     * The method removeAllUnliked removes all unliked songs from the playlist.
     * 
     */
    public void removeAllUnliked()
    {
        for (Song s : playlist)
        {
            if (s.isLiked() == false)
            {
                playlist.remove(s);
            }
        }
    }
    
    /**
     * The method get song accesses a specific song in the playlist.
     * 
     * @param Song s a specific song in the playlist
     * @return song the specific song
     */
    public Song get(int index)
    {
        if (index >= 0 && index < playlist.size())
        {
            return playlist.get(index);
        }
        else
        {
            return null;
        }
    }
}
