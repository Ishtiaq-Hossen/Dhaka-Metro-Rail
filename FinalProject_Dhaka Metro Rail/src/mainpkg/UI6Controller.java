/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpkg;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Ishti
 */
public class UI6Controller implements Initializable {

    @FXML
    private Label controlCenterPreviousTaskLevel;
    @FXML
    private Label controlCenterTaskCompleteLevel;
    @FXML
    private DatePicker controlCenterDate;
    @FXML
    private TextField controlCenterRating;
    @FXML
    private TextField controlCenterNewTaskTextField;
    @FXML
    private Label ticketSellingPreviousTaskLevel;
    @FXML
    private Label ticketSellingTaskCompleteLevel;
    @FXML
    private DatePicker ticketSellingDate;
    @FXML
    private TextField ticketSellerRating;
    @FXML
    private TextField ticketSellingNewTaskTextField;
    @FXML
    private Label accountingPreviousTaskLevel;
    @FXML
    private Label accountingTaskCompleteLevel;
    @FXML
    private DatePicker accoutingDate;
    @FXML
    private TextField accountingRating;
    @FXML
    private TextField accountingcNewTaskTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void sendMailToAllStaff(MouseEvent event) {
    }

    @FXML
    private void save(MouseEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("AdminFxml.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }
    
}
