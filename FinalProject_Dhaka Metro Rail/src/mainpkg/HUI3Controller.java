
package mainpkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Ishti
 */
public class HUI3Controller implements Initializable {
    
    @FXML private Label showStationPolice;
    @FXML private ComboBox<String> stationNameComboBoxForShow;
    @FXML private ComboBox<String> stationNameComboBoxForAssign;
    @FXML private TextField policeNoTextfield;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        stationNameComboBoxForShow.getItems().addAll("Uttara","Mirpur","Shahbag","Kazipara");
        stationNameComboBoxForAssign.getItems().addAll("Uttara","Mirpur","Shahbag","Kazipara");
    }    

    //==========button onclick method starts here=====/
    
    @FXML private void showStationPoliceOnCLick(MouseEvent event) {
        
    }

    @FXML private void AssignPoliceNoOnClick(MouseEvent event) {
        
    }
    //==========button onclick method ends here=====/
    
}
