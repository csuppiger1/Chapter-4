
/**
 * Write a description of class CarDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CarDriver
{
    public static void main(String[] args) {
        Car theBatMobile = new Car(10, "Lambo");
        Car yourCar = new Car(2010, "Ford");
        System.out.print(theBatMobile);
        System.out.println(theBatMobile.equals(yourCar));
    }
}
