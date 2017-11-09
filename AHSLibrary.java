
/**
 * Write a description of class AHSLibrary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AHSLibrary
{
    public static void main(String[] args) {
        Library ahs = new Library(10, "Acalanes");
        Author ike = new Author("Ike", 17);
        Book b = new Book(ike, "Java Book");
        ahs.addBook(0, b);
        System.out.println(ahs);
    }
}
