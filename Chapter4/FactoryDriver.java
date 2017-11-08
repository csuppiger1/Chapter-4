
/**
 * Write a description of class FactoryDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FactoryDriver
{
    public static void main() {
        Factory tesla = new Factory(2000.0, 5);
        
        
        Car c = new Car(2017, "Model 3");
        tesla.setCar(c, 0);
        System.out.println(tesla);
        
    }
}
