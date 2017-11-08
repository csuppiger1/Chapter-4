
/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
    private Author author;
    private String title;
    public Book(Author aut, String ttl) {
        this.author = aut;
        this.title = ttl;
    }
    public String toString() {
        return  this.title;
    }
    public String getTitle() {
        return this.title;
    }
}
