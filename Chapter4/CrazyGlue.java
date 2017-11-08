
public class CrazyGlue
{
    // instance variables - replace the example below with your own
    
    private String name;
    private int idNumber;
    private CrazyGlue bestFriend;
    /**
     * Constructor for objects of class Student
     */
    public CrazyGlue()
    {
        // initialise instance variables
    }
    
    public CrazyGlue(int num, String nm) {
        this.idNumber = num;
        this.name = nm;
    }
    
    public int combineIDNumber() {
        return this.idNumber + bestFriend.idNumber;
    }
    
    public CrazyGlue newStudent(CrazyGlue other) {
        CrazyGlue temp = new CrazyGlue(other.idNumber, this.name);
        return temp;
    }
    
    public int getID() {
        return this.idNumber;
    }
    
    public String toString() {
       return "The student's name is: " +this.name; 
    }
}
