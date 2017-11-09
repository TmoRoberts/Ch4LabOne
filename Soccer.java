
/**
 * Write a description of class Soccer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Soccer
{
    public static void main(String[] args)
    {
        Team soccer = new Team(10, "Soccer");
        Athlete bryan = new Athlete(17, "Bryan");
        Athlete noah = new Athlete(17, "Noah");
        System.out.println(bryan.equals(noah));
        soccer.addAthlete(0, bryan);
        soccer.addAthlete(1, noah);
        System.out.println(soccer);
    }
}
