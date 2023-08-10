
package mainpkg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Ishti
 */


/*
    This file willn't execute problem in file handling 
    there have some issue
*/

public class AddStuffController implements Initializable {

    @FXML private TextField endterIdTextField;
    @FXML private TextField enterNameTextField;
    @FXML private ComboBox<String> designationComboBox;
    private Staff s;
    /**
     * Initializes the controller class.
     */
    @Override public void initialize(URL url, ResourceBundle rb) {
       
        designationComboBox.getItems().addAll("Station Master","Driver","Accountant","Head of security");
        
    }    
    
    //=====button on click method starts here=====/

    @FXML private void addStaffOnClick(MouseEvent event) {
        int id;
        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            
            f = new File("staffObjects.bin");
            if(f.exists())
            {
                fos = new FileOutputStream(f,true);
                oos = new Appendable(fos);
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);               
            }

            id=Integer.parseInt(endterIdTextField.getText());
            String a=enterNameTextField.getText();
            String b=designationComboBox.getValue();
            s=new Staff(id,a,b);
         
            oos.writeObject(s);
            

        } 
        catch (IOException ex) {
            Logger.getLogger(SignupController.class.getName()).log(Level.SEVERE, null, ex);
        } 
        finally {
            try {
                if(oos != null) oos.close();
            } 
            catch (IOException ex) {
                Logger.getLogger(SignupController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    
    }
    //=====button on click method end here=====/
}

