import java.util.ArrayList;
import java.util.List;

public class SpotifyPlayer implements AudioPlayer{
    private List<String> favoriteTracks = new ArrayList<>();

    public List<String> getFavoriteTracks() {
        return favoriteTracks;
    }
    void addTrack(String t){
        favoriteTracks.add(t);
    }

    @Override
    public void start() {
        System.out.println("музыка играет из Spotify");
    }

    @Override
    public void stop() {
        System.out.println("музыка на паузе");


    }
}
