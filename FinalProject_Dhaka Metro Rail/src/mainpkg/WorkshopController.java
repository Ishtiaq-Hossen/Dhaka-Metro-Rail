package mainpkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Ishti
 */
public class WorkshopController implements Initializable {

    @FXML private TextField accountingWorkshopTrainingName;
    @FXML private TextField controlCenterTrainingName;
    @FXML private TextField TicketSellingTrainingName;
    @FXML private DatePicker accountingStartDate;
    @FXML private DatePicker accountingEndDate;
    @FXML private DatePicker ControlCenterStartDate;
    @FXML private DatePicker ControlCenterEndDate;
    @FXML private DatePicker ticketSellerStartDate;
    @FXML private DatePicker ticketSellerEndDate;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void assignWorkshopButtonOnClick(MouseEvent event) {
        final Node source = (Node) event.getSource();
        final Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }
    
}
