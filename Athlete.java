
/**
 * Write a description of class Athlete here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Athlete
{
    // instance variables - replace the example below with your own
    private int age;
    private String name;
    
    public Athlete(int num, String nm) 
    {
        this.age = num;
        this.name = nm;
    }
    public boolean equals(Athlete other)
    {
        if(this.name.equals(other.name) && this.age == other.age)
        {
            return true;
        }
        else {
            return false;
        }
    }
    public String toString() 
    {
        return "The player " + this.name + " is " + this.age + " years old";
    }
}
