package mainpkg;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Ishti
 */
public class AdminFxmlController implements Initializable {

    @FXML private BorderPane borderPane;
    @FXML private Button ui1Button;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        // TODO
        loadUI("welcome");
    }    
    
    //=====implemented method starts here=====/
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
    
    //=====implemented method ends here=====/
    
    //===========button on click method start here===/
    @FXML
    private void passenger(MouseEvent event) {
        
        loadUI("UI1");
    }

    @FXML
    private void trainSelection(MouseEvent event) {
        loadUI("UI2");
    }

    @FXML
    private void staffInfo(MouseEvent event) {
        loadUI("UI3");
    }

    @FXML
    private void routeSelection(MouseEvent event) {
        loadUI("UI4");
    }


    @FXML
    private void training(MouseEvent event) {
        loadUI("UI5");
    }

    @FXML
    private void direction(MouseEvent event) {
        loadUI("UI6");
    }

    @FXML
    private void maintainingDatabase(MouseEvent event) {
        loadUI("UI7");
    }

    @FXML
    private void cardManagement(MouseEvent event) {
        loadUI("UI8");
    }

    @FXML
    private void exit(MouseEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("LoginPage.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }
    //===========button on click method ended here===/
    
}
