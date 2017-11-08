
/**
 * Write a description of class SoccerTeam here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SoccerTeam
{
    public static void main(){
        Team soccerTeam = new Team("Thunder", 5);
        Athlete player1 = new Athlete("Drew Campillo", 16);
        soccerTeam.addAthlete(player1, 0);
        System.out.print(soccerTeam);
    }
}
