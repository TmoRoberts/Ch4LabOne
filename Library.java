
/**
 * Write a description of class Library here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Library
{
    // instance variables - replace the example below with your own
    private Book[] books;
    private String name;
    
    public Library(int size, String nm) 
    {
        this.books = new Book[size];
        this.name = nm;
    }
    public String toString() 
    {
        String output = "The library " + name + " has the following: \n";
        for(Book b : books) {
            output += b + "\n";
        }
        return output;

    }
    public void addBook(int location, Book b)
    {
        books[location] = b;
    }
}
