/**
 * Class for the data object
 */
package thequeue;

/**
 *
 * @author milto_000
 */
public class Person {
    //person info
    private String fname;
    private String lname;
    private String id;

//==============================================================================
    /**
     * Class constructors
     *
     */
    public Person() {

    }//end Person()

    public Person(String fname, String lname, String id) {
        this.fname = fname;
        this.lname = lname;
        this.id = id;
    }//end Person(String,String,String)
//==============================================================================

    /**
     * Mutators and accessors
     *
     * @param fname
     */
    public void setFname(String fname) {
        this.fname = fname;
    }//end setFname

    public void setLname(String lname) {
        this.lname = lname;
    }//end setLname()

    public void setID(String id) {
        this.id = id;
    }//end setID()

    public String getFname() {
        return fname;
    }//end getFname()

    public String getLname() {
        return lname;
    }//end getLname()

    public String getID() {
        return id;
    }//end getID()
//==============================================================================

    /**
     * String representation of the data object
     *
     * @return
     */
    public String toString() {
        return fname + "";
    }// end toString()

}//end class Person
