
/**
 * Write a description of class TestNames here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestNames
{
    public static void main() {
        Name person1 = new Name("Drew", "Lamarcus", "Campillo");
        System.out.println(person1.firstMiddleLast());
        System.out.println(person1.LastMiddleFirst());
        System.out.println(person1.initials());
        System.out.println(person1.length());
        Name person2 = new Name("Colby", "Tate", "Suppiger");
        System.out.println(person1.equals(person2));
        
    }
}
