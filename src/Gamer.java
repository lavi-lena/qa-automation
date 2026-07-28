import java.util.ArrayList;
import java.util.List;

public class Gamer {
    String nickname;
    List<Game> casualGames = new ArrayList<>();
    List<Game> hardcoreGames = new ArrayList<>();

    Gamer(String nickname) {
        this.nickname = nickname;
    }


    void buyGame(Game g) {
        if (g.difficulty == Difficulty.HARD) {
            hardcoreGames.add(g);
        } else if (g.difficulty == Difficulty.EASY) {
            casualGames.add(g);
        } else {
            System.out.println("Игрок размышляет над покупкой...");
        }
    }

    void showCollection() {
        for (Game legko : casualGames) {
            System.out.println(legko.title);
        }
        for (Game hard : hardcoreGames) {
            System.out.println(hard.title);
        }
    }
}
