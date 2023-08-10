
package mainpkg;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Ishti
 */
public class UI3Controller implements Initializable {

    @FXML private ComboBox<String> staffType;
    @FXML private ComboBox<String> staffTypedetails;
    private ArrayList<Staff>stafflist; 
    @FXML private TextField staffIdverificationTextField;
    @FXML private Label verifyShow;
    @FXML private TextField staffDetailsTextfield;
    @FXML private Label showStaffDetalsLabel;
    private Staff s;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        stafflist=new ArrayList<Staff>();
        staffType.getItems().addAll("Station Master","Driver","Accountant","Head of security");
        staffTypedetails.getItems().addAll("Station Master","Driver","Accountant","Head of security");
        
       // staffTypedetails.getItems().addAll("Station Master","Driver","Accountant","Head of security");
        
        stafflist=new ArrayList<Staff>();
        
        stafflist.add(new Staff(101,"Karim","Driver"));
        stafflist.add(new Staff(102,"Jashim","Accountant"));
        stafflist.add(new Staff(101,"Karim","Head of security"));
        stafflist.add(new Staff(101,"Karim","Station master"));
        
        /*
        
        //all the code below won't execute //-->related file AddStuffController,AddStuff.fxml,
            ObjectInputStream ois=null;
            try {

                 ois = new ObjectInputStream(new FileInputStream("staffObjects.bin"));
                 while(true){

                    s = (Staff) ois.readObject();
                    stafflist.add(s);
                 }
            }

            catch (Exception ex) {
                try {
                    if(ois!=null)
                        ois.close();
                } 
                catch (IOException ex1) {  }           
            }
        */
    }  
    
    //===button on click method starts here========/

    @FXML private void verifyButtonOnClick(MouseEvent event) {
        boolean check=true;
        for(int i=0;i<stafflist.size();i++)
        {
            int id=Integer.parseInt(staffIdverificationTextField.getText());
            String temp=staffType.getValue().toString();
            if((stafflist.get(i).getID()==id) && (temp==stafflist.get(i).getDesigNation()))
            {
                verifyShow.setText("Verified");
                check=false;
                break;
            }
        }
        if(check==true)
        {
            verifyShow.setText("Unauthorized");
        }
    }

    @FXML
    private void detailsButtonOnClick(MouseEvent event) {
        boolean check =true;
        for(int i=0;i<stafflist.size();i++)
        {
            int id=Integer.parseInt(staffDetailsTextfield.getText());
            String temp=staffTypedetails.getValue().toString();
            if((stafflist.get(i).getID()==id) && (temp==stafflist.get(i).getDesigNation()))
            {
                String s=stafflist.get(i).toString();
                showStaffDetalsLabel.setText(s);
                check=false;
                break;
            }
        }
        if(check==true)
        {
            showStaffDetalsLabel.setText("Not Found");
        }
    }

    @FXML private void staffIdVerificationOnClick(MouseEvent event) {
        verifyShow.setText("");
        
    }

    @FXML
    private void staffIdTextFieldForDetailsOnClick(MouseEvent event) {
        showStaffDetalsLabel.setText("");
    }

    @FXML
    private void addStaffButtonOnClick(MouseEvent event) throws IOException {
        Parent fileChooserViewParent = FXMLLoader.load(getClass().getResource("addStuff.fxml"));
        Scene fileChooserViewScene = new Scene(fileChooserViewParent);
        Stage newWindow  = new Stage();
        newWindow.setResizable(false);
        newWindow.setTitle("Add Staff Stage");
        newWindow.setScene(fileChooserViewScene);
        newWindow.show();
    }
    
     //===button on click method ends here========/
    
}
