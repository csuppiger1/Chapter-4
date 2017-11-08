
/**
 * Write a description of class Athlete here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Athlete
{
    private String name;
    private int age;
    
    public Athlete(String nme, int ag) {
        this.name = nme;
        this.age = ag;
    }
    public String toString() {
        return "this athletes age is " + this.age + " and their name is " + this.name;
    }
}
