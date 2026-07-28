
public class PlayingCard{
    int num;
    Masti mast;

    public void DisplayNumAndMastText(){
        String text = getNumAndMastText();
        System.out.println(text);
    }

    private String getNumAndMastText(){
        return num + " " + mast;
    }
}