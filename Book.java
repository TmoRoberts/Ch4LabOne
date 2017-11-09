
/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book 
{
    // instance variables - replace the example below with your own
    private String title;
    private Author authorInfo;
    public Book(Author a, String tl) {
        this.authorInfo = a;
        this.title = tl;
    }
    public String toString() {
        return "The book title is " + this.title + authorInfo;
    }
 
}
