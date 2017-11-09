
/**
 * Write a description of class Team here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Team
{
    // instance variables - replace the example below with your own
    private String teamName;
    private Athlete[] athletes;
    
    public Team(int size, String nm)
    {
        this.athletes = new Athlete[size];
        this.teamName = nm;
    }
    public String toString()
    {
        String output = "The team " + this.teamName + " has these players; \n";
        for (Athlete a :athletes)
        {
            output += a + "\n";
        }
        return output;
    }
    public void addAthlete(int index, Athlete a) {
        athletes[index] = a;
    }
}
