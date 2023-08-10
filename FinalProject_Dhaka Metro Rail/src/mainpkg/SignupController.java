
package mainpkg;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Ishti
 */
public class SignupController implements Initializable {

    @FXML
    private TextField userId;
    @FXML
    private TextField password;
    @FXML
    private TextField userType;
    public int id;
    public String pass,type;
    public ArrayList<User>list;
    public User s;
    
    /*
    This file won't execute for unused purpuse
    
    */
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        list=new ArrayList<User>();
        
    }    

    @FXML
    private void addArraylistonClick(MouseEvent event) {
    
            File f = null;
            FileOutputStream fos = null;      
            ObjectOutputStream oos = null;
        
            try {
                f = new File("userObjects.bin");
                if(f.exists()){
                    fos = new FileOutputStream(f,true);
                    oos = new Appendable(fos);                
                }
                else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);               
                }

                id=Integer.parseInt(userId.getText());


                if(userType.getText().equals("Admin"))
                {
                    s=new Admin(id,password.getText());
                }
                else if(userType.getText().equals("Head"))
                {
                    s=new HeadOfSecurity(id,password.getText());
                }
                oos.writeObject(s);

            } catch (IOException ex) {
                
                Logger.getLogger(SignupController.class.getName()).log(Level.SEVERE, null, ex);
                
            } finally {
                try {
                    if(oos != null) oos.close();
                } catch (IOException ex) {
                    Logger.getLogger(SignupController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }        
        
    }
    
}
