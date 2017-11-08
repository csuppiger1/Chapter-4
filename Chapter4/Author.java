
/**
 * Write a description of class Author here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Author
{
    private String name;
    private int age;
    
    public Author(int ag, String nm) {
        this.name = nm;
        this.age = ag;
    }
    public String toString() {
        return "Author's name is " + name + " and the author is " + age + "years old.";
    }
}
