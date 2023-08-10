
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
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Ishti
 */
public class PassengerController implements Initializable {

    @FXML
    private TextField fromStationTextField;
    @FXML
    private TextField toStationTextField;
    @FXML
    private DatePicker dateOfJourney;
    @FXML
    private ComboBox<String> chooseComboBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        fromStationTextField.getText();
        toStationTextField.getText();
         chooseComboBox.getItems().addAll(
         "Uttora Express" ,"Surdanban", "Ekota", "Drutaja", "Motijhil Express"
         );
        
    }    



    @FXML
    private void preferredTrainButtonOnClicl(MouseEvent event) throws IOException {
        
              
    }


    @FXML
    private void ticketPurchaseOnClick(MouseEvent event) throws IOException {
       
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("TicketPurchase.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
}

    @FXML
    private void routeDetailsButtonOnClick(MouseEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("ShowRoute.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }

    @FXML
    private void liveTrainTrackingButtonOnClick(MouseEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("LiveTrainTracking.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }

    @FXML
    private void rechargeCardButtonOnClick(MouseEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("RechargeMonthlyRapidCard.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }

    @FXML
    private void ticketVerifyButtonOnClick(MouseEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("TicketVerify.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }

    @FXML
    private void foreigerServicesButtonOnClick(MouseEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("ForeignerServices.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }

    @FXML
    private void mRCardCheckButtonOnClick(MouseEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("MRCardVerify.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }

    @FXML
    private void complaintAndQuerirsButtonOnClick(MouseEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("CustomerQueries.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }

    @FXML
    private void logOutOnClick(MouseEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("LoginPage.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }
    

   

   
    
    
}
