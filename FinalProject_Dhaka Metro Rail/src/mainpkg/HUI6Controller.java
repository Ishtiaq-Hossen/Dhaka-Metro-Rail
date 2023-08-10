/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Ishti
 */
public class HUI6Controller implements Initializable {

    @FXML private ComboBox<String> noticeSourceComboBox;
    @FXML private TextArea noticeTextArea;
    @FXML private ComboBox<String> nearestPoliceStaionComboBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        noticeSourceComboBox.getItems().addAll("Control Room","Driver","Station Master");
        nearestPoliceStaionComboBox.getItems().addAll("Mirpur Thana","Uttara Thana","Vatara Thana");
        // TODO
    }    

    @FXML
    private void informPoliceStationOnClick(MouseEvent event) {
    }

    @FXML
    private void informAllTheSecurityOnClick(MouseEvent event) {
    }
    
}
