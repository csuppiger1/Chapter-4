
public class Hat
{
    // instance variables - replace the example below with your own
    private boolean coolHat;
    private String colorOfHat;
    public static int numHats;
    
    public Hat(boolean cool, String color)
    {
        this.coolHat = cool;
        this.colorOfHat = color; 
        numHats++;
    }
    
    public static void example() {
        System.out.println("This is static");
    }
    
    public boolean getCoolHat() {
        return this.coolHat;
    }
    
    public String toString() {
        return "The hat's color is " + this.colorOfHat;
    }
}

    

