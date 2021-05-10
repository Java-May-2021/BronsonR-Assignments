import java.util.HashMap;
import java.util.Set;

public class MapOfHashmatique {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Song #1", "Lyrics for this song");
        trackList.put("Song #2", "Lyrics for the second song");
        trackList.put("Song #3", "The 3rd songs lyrics");
        trackList.put("Song #4", "The final lyrics");

        System.out.println("----");
        System.out.println("----");
        System.out.println("----");

        System.out.println("lets pull the second songs lyrics");
        System.out.println(trackList.get("Song #2"));

        System.out.println("----");

        Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.println("Track: " + key + "  Lyrics: " + trackList.get(key));    
        }
    }
}