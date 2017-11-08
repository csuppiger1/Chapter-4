
/**
 * Write a description of class Driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AHSLibrary
{
    public static void main() {
        Library ahs = new Library("Acalanes High School", 10);
        Author author1 = new Author(60,"Harriet Tubman");
        Book book1 = new Book(author1 ,"To Kill a Mockingbird");
        System.out.println(ahs);
    }
}
