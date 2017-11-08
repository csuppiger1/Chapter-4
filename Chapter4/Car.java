
/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car
{
    private int year;
    private String model;
    public Car(int yr, String mdl) {
        this.year = yr;
        this.model = mdl;
    }
    
    public String toString() {
        return "Car model: " + model + " Car year: " + year;
    }
    
    public int getYear() {
        return this.year;
    }
    
    public boolean equals(Car otherCar) {
        if(this.model.equals(otherCar.model) && this.year == otherCar.year) {
            return true;
        } else {
            return false;
        }
    }
}
