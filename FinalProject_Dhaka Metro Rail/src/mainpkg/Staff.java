package mainpkg;
import java.io.Serializable;
/**
 *
 * @author Ishti
 */
public class Staff implements Serializable{
    protected int ID;
    protected String name;
    protected String desigNation;
    public static String email;
    public Staff()
    {
        
    }
    public Staff(int ID, String name, String desigNation) {
        this.ID = ID;
        this.name = name;
        this.desigNation = desigNation;
    }
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesigNation() {
        return desigNation;
    }

    public void setDesigNation(String desigNation) {
        this.desigNation = desigNation;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        Staff.email = email;
    }

    @Override
    public String toString() {
        return "Staff{" + "ID=" + ID + ",\nname=" + name+ '}';
    }
    
    
    
    
    
}
