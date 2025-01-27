/**
 * The Song class identifies a song by its title, artist, duration, and status of
 * whether the song is "liked" associated with it.
 * @author Bella Duncan and Megan Wang
 * @version 2025-01-24
 * 
 */
public class Song 
{
    //instance variables
    private String title;
    private String artist;
    private int durationInSeconds;
    private boolean liked;
    
    /**
     * Constructor for objects of class Song. 
     * @param title The title of the song
     * @param artist The name of the artist
     * @param duration The duration of the song, given in minutes: seconds
     */
    public Song(String title, String artist, int durationInSeconds)
    {
        //initialize instance variables
        this.title = title;
        this.artist = artist;
        this.durationInSeconds = durationInSeconds;
        liked = false;
        
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public String getArtist()
    {
        return artist;
    }
    
    public int getDuration()
    {
        return durationInSeconds;
    }
    
    public boolean isLiked()
    {
        return liked;
    }
    
    public void setLiked(boolean state)
    {
        liked = state;
    }
    
    public String toString()
    {
        return "Song[title=" + title + "artist=" + artist + ",durationInSeconds="
            + durationInSeconds + ",liked=" + liked + "]";
    }
    
}