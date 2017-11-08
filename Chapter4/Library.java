
/**
 * Write a description of class Library here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Library
{
    private String name;
    private Book inventory[];
    public Library (String nme, int number) {
        this.name = nme;
        this.inventory = new Book[number];
    }
    public String toString() {
        String output = "This " + name + " library has \n";
        for(Book b: inventory) {
            output += b + "\n";
        }
        return output;
    }
    public void addBook(Book b, int index) {
        inventory[index] = b;
    }
}
