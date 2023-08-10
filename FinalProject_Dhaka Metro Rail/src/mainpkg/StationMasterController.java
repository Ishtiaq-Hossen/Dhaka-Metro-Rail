
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
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Acer
 */
public class StationMasterController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void checkTimeShedualsButtonOnClick(MouseEvent event) throws IOException {
        
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("DicisionMaker.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }

    @FXML
    private void signalButtonOnClick(MouseEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("Signals.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }
    

    @FXML
    private void ContactHealthCareCenterButtonOnClick(MouseEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("HealthCareCenter.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }

    @FXML
    private void handleUnexpectedSituationsButtonOnClick(MouseEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("HandleUnexpectedSituation.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }

    @FXML
    private void employeeButtonOnClick(MouseEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("Employee.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }

    @FXML
    private void parcelRecevingButtonOnClick(MouseEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("Parcels.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }

    @FXML
    private void checkAllReportsButtonOnClick(MouseEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("ReceivingReport.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }

    @FXML
    private void announcementsToPassengerButtonOnClick(MouseEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("NesessaryAnnouncement.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }

    @FXML
    private void logOutOnCliCk(MouseEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("LoginPage.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }
    
}
