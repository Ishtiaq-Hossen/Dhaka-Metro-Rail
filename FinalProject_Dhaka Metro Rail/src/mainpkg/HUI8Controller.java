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
public class HUI8Controller implements Initializable {

    @FXML
    private Label complainLabel;
    @FXML
    private ComboBox<String> departMentNameComboBox;
    @FXML
    private TextField suggesionTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        departMentNameComboBox.getItems().addAll("Driver","Passenger","Station Master","Control Room Operator");
    }    

    @FXML
    private void sendButtonOnClick(MouseEvent event) {
    }
    
}
