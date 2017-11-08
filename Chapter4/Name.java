
/**
 * Write a description of class Name here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Name
{
    String firstName;
    String middleName;
    String lastName;
    
    
    public Name(String fN, String mN, String lN) {
        this.firstName = fN;
        this.middleName = mN;
        this.lastName = lN;
    }
    
    public String getFirst() {
        return this.firstName;
    }
    
    public String getMiddle() {
        return this.middleName;
    }
    
    public String getLast() {
        return this.lastName;
    }
    
    public String firstMiddleLast() {
        return this.firstName + " " + this.middleName + " " + this.lastName;
    }
    
    public String LastMiddleFirst() {
        return this.lastName + " " + this.middleName + " " + this.firstName;
    }
    
    public boolean equals(Name otherName) {
        if(this.firstName.equalsIgnoreCase(otherName.firstName)) {
            return true;
        } else {
            return false;
        }
    }
    
    public String initials() {
        return "" + this.firstName.charAt(0) + this.middleName.charAt(0) + this.lastName.charAt(0);  
    }
    
    public int length() {
        String fullname = "" + this.firstName + this.middleName + this.lastName;
        return fullname.length();
    }    
}
