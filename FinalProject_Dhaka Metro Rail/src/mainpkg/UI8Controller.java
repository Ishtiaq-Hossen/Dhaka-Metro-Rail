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
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Ishti
 */
public class UI8Controller implements Initializable {

    @FXML
    private Label showHowManyMrtCardNeedTOIsuue;
    @FXML
    private TextField noOfMrtCartToIsuue;
    @FXML
    private ComboBox<String> MrtCombo;
    @FXML
    private TableView<String> tableview;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        MrtCombo.getItems().addAll("Premium","Silver","Standard");
        // TODO
    }    

    @FXML
    private void generateMrtCard(MouseEvent event) {
    }
    
}
