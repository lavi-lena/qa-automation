package otherTasksClasses;

import java.util.ArrayList;
import java.util.List;

public class Team {
    String teamName;
    List<Player> roster = new ArrayList<>();
    List<Trophy> cabinet = new ArrayList<>();

    Team(String teamName){
        this.teamName = teamName;
    }
    void signUpPlayer(Player p){
        roster.add(p);
    }
    void winTrophy(Trophy t){
        cabinet.add(t);
    }
    void showTeamDetails(){
        System.out.println(teamName);
        for (Player player:roster){
            System.out.println(player.name);
        }
        for (Trophy trophy:cabinet){
            System.out.println(trophy.type);
        }
    }
}
