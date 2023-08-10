
package mainpkg;

import java.io.Serializable;

/**
 *
 *@author Ishti
 * 
 */
public class User implements Serializable{
    
    protected String password;
    protected int id;
    protected String userType;
    
    public User(int id,String password)
    {
        this.password=password;
        this.id=id;
        
        
    }
    protected boolean verify()
    {
        return true;
    }
    public boolean verifyLogin()
    {
        
        return true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
    
    

    
    
}
