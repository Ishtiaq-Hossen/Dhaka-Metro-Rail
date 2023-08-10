package mainpkg;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Ishti
 */
public class LoginPageController implements Initializable {

    //=======All declaration==============/
    
    @FXML private Text errorMessage;
    public String id,pass;
    public ArrayList<User>list;
    @FXML private TextField signupIdTextField;
    @FXML private PasswordField signUpPasswordTextField;
    @FXML private ComboBox<String> userTypeComboBox;
    @FXML private TextField loginIdTextField;
    @FXML private PasswordField logInPasswordTextField;
    private User s;
    
    
    
    
    //===============initialize method started ===============/
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        userTypeComboBox.getItems().addAll("Passenger","Admin","Head Of Security","Accountant","StationMaster",
        "Project Director","Driver","ControllRO");        
        list=new ArrayList<User>();
        
        /*
        list=new ArrayList<User>();
        list.add(new Admin(1,"13a1"));
        list.add(new HeadOfSecurity(2,"13a2"));
        list.add(new HeadOfSecurity(3,"13a3"));
        errorMessage.setText("");
        */
        
        
        ///==========file reading============/
        ObjectInputStream ois=null;
        try {
             
             ois = new ObjectInputStream(new FileInputStream("userObjects.bin"));
             while(true){
                s = (User) ois.readObject();
                list.add(s);
            }                                   
        }catch (Exception ex) {
            try {
                if(ois!=null)
                    ois.close();
            } 
            catch (IOException ex1) {  }           
        }
        errorMessage.setText("");
    }    
    //===============initialize method ended ===============/
    
    //===============button on click method started here===============/
    @FXML
    private void signUpButtonOnClick(MouseEvent event) {
        
        
        //=====file writing=============
        int id;
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

            id=Integer.parseInt(signupIdTextField.getText());
            
            
            if(userTypeComboBox.getValue().toString().equals("Admin"))
            {
                s=new Admin(id,signUpPasswordTextField.getText());
            }
            else if(userTypeComboBox.getValue().toString().equals("Head Of Security"))
            {
                s=new HeadOfSecurity(id,signUpPasswordTextField.getText());
            }
            else if(userTypeComboBox.getValue().toString().equals("Passenger"))
            {
                s=new Passenger(id,signUpPasswordTextField.getText());
            }
            else if(userTypeComboBox.getValue().toString().equals("StationMaster"))
            {
                s=new StationMaster(id,signUpPasswordTextField.getText());
            }
            else if(userTypeComboBox.getValue().toString().equals("Driver"))
            {
                s=new Driver(id,signUpPasswordTextField.getText());
            }
            else if(userTypeComboBox.getValue().toString().equals("ControllRO"))
            {
                s=new ControllRoomOperator(id,signUpPasswordTextField.getText());
            }
            else if(userTypeComboBox.getValue().toString().equals("Accountant"))
            {
                s=new Accountant(id,signUpPasswordTextField.getText());
            }
            else if(userTypeComboBox.getValue().toString().equals("Project Director"))
            {
                s=new ProjectDirector(id,signUpPasswordTextField.getText());
            }
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
        
        signupIdTextField.setText("");
        signUpPasswordTextField.setText("");
    }
    

    @FXML
    private void LogInButtonOnClick(MouseEvent event) throws IOException {
        
        
        int i=Integer.parseInt(loginIdTextField.getText());
        
        
        //======Alert if no entity in object file=========/
        
        if(list.size()==0)
        {
                //=====Alert==========//
                Alert a = new Alert(Alert.AlertType.INFORMATION);
                a.setTitle("Information Alert");
                a.setHeaderText("No entity found!");
                a.setContentText("Note");
                TextArea exceptionTextArea = new TextArea(
                "There is no instances\nSign Up with user ID,Password and Type\nThank you!"
                );
                a.getDialogPane().setExpandableContent(exceptionTextArea);
                a.showAndWait(); 
        }
        
        //==========Alert code ended===============//
        boolean check =true;
        for (int k = 0; k < list.size();k++)
        {
            if(list.get(k).getId()==i && logInPasswordTextField.getText().equals(list.get(k).getPassword()))
            {
                if(list.get(k).getUserType().equals("Admin"))
                {
                    Parent scene2Parent = FXMLLoader.load(getClass().getResource("AdminFxml.fxml"));
                    Scene scene2 = new Scene(scene2Parent);
                    Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
                    stg2.setScene(scene2);
                    check=false;
                    
                }
                else if(list.get(k).getUserType().equals("Head"))
                {
                    Parent scene2Parent = FXMLLoader.load(getClass().getResource("HeadOfSecurity.fxml"));
                    Scene scene2 = new Scene(scene2Parent);
                    Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
                    stg2.setScene(scene2);
                    check=false;
                }
                else if(list.get(k).getUserType().equals("Passenger"))
                {
                    Parent scene2Parent = FXMLLoader.load(getClass().getResource("passenger.fxml"));
                    Scene scene2 = new Scene(scene2Parent);
                    Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
                    stg2.setScene(scene2);
                    check=false;
                }
                else if(list.get(k).getUserType().equals("StationMaster"))
                {
                    Parent scene2Parent = FXMLLoader.load(getClass().getResource("StationMaster.fxml"));
                    Scene scene2 = new Scene(scene2Parent);
                    Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
                    stg2.setScene(scene2);
                    check=false;
                }
                else if(list.get(k).getUserType().equals("Accountant"))
                {
                    Parent scene2Parent = FXMLLoader.load(getClass().getResource("User3_Goal_4.fxml"));
                    Scene scene2 = new Scene(scene2Parent);
                    Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
                    stg2.setScene(scene2);
                    check=false;
                }
                else if(list.get(k).getUserType().equals("ProjectDirector"))
                {
                    Parent scene2Parent = FXMLLoader.load(getClass().getResource("User4_Goal_1.fxml"));
                    Scene scene2 = new Scene(scene2Parent);
                    Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
                    stg2.setScene(scene2);
                    check=false;
                }
                else if(list.get(k).getUserType().equals("Driver"))
                {
                    Parent scene2Parent = FXMLLoader.load(getClass().getResource("User7_Goal3.fxml"));
                    Scene scene2 = new Scene(scene2Parent);
                    Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
                    stg2.setScene(scene2);
                    check=false;
                }
                else if(list.get(k).getUserType().equals("ControllRO"))
                {
                    Parent scene2Parent = FXMLLoader.load(getClass().getResource("User8_Goal1.fxml"));
                    Scene scene2 = new Scene(scene2Parent);
                    Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
                    stg2.setScene(scene2);
                    check=false;
                }
            }
            
            else{
                
                errorMessage.setText("Unauthorized User");
            }
            
        }
        
        //====Information alert for new user=====/
        if(check==true)
        {
            Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setTitle("Information Alert");
            a.setHeaderText("Instant Signup User Notice");
            a.setContentText("If user recently signup in this application\nPlease restart the application\nNote: Authority need some time to verify new User");
            a.showAndWait();
        }
       
        
    }

    @FXML
    private void signupIdOnClick(MouseEvent event) {
        signupIdTextField.setText("");
    }

    @FXML private void signUpPassOnClick(MouseEvent event) {
        signUpPasswordTextField.setText("");
    }

    @FXML private void loginIdOnClick(MouseEvent event) {
        loginIdTextField.setText("");
    }

    @FXML private void loginPassOnClick(MouseEvent event) {
        logInPasswordTextField.setText("");
    }

    @FXML
    private void closeApplication(MouseEvent event) {
        final Node source = (Node) event.getSource();
        final Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void link(MouseEvent event) throws URISyntaxException, IOException {
        Desktop.getDesktop().browse(new URI("https://ishtiaq-hossen.github.io/Port/"));
    }
        
    //==============button onclick method ended here=============//
    
}




/*
    
    |-------necessary code for halp---------------|
    ===============================================
    
    // for closing a application--> stage
    
    @FXML private void close(MouseEvent event) {
        final Node source = (Node) event.getSource();
        final Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }
    ===================================================
    //new scene code.
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("AdminFxml.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stg2.setScene(scene2);
    
    =====================================================
    
    //code for borderpane center->achcorpane
    
    private void loadUI(String ui) {
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource(ui+".fxml"));
            borderPane.setCenter(root);
        }
        catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
    private void passenger(MouseEvent event) {       
        loadUI("UI1");
    }
    
    =============================================================
    
    //code for going previous scene
    
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("LoginPage.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    
    ===============================================================
    
    
    
    */
    

