package mainpkg;
/**
 *
 * @author Ishti
 */
public class Accountant extends User{
    
    public Accountant(int id, String password) {
        super(id, password);
        userType="Accountant";
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
    
    
}
