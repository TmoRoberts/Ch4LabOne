
/**
 * Write a description of class Author here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Author
{
    public String name;
    public int age;
    public Author(String nm, int yr) {
        this.name = nm;
        this.age = yr;
    }
    public String toString() {
        return "The name of the author is " + this.name;
    }
}
