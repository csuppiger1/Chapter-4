

public class HatDriver
{
    public static void main(String[] args) {
        Hat baseballhat = new Hat(true, "Yellow");
        System.out.println(baseballhat);
        
        Hat.example();
        System.out.println("Number of hats: " + Hat.numHats);
        }
    }

