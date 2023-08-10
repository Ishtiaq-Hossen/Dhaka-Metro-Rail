
package mainpkg;


public class StationMaster extends User {
    public StationMaster(int id, String password){
    super(id, password);
    userType="StationMaster";
    
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
