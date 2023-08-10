/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpkg;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Ishti
 */
public class UI5Controller implements Initializable {

    @FXML private Label statusLabel;
    @FXML private PieChart pieChart;

    /**
     * Initializes the controller class.
     */
    ObservableList <PieChart.Data> list;
    @FXML
    private TextArea inquiryTextArea;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        list = FXCollections.observableArrayList(
            new PieChart.Data("Ticket Selling",50),
            new PieChart.Data("Accounting Service",30),
            new PieChart.Data("Control Room",20)
            
            
        );
        pieChart.setData(list);
        
        
        for(PieChart.Data data: pieChart.getData()){
            data.getNode().addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){
                @Override
                public void handle(MouseEvent event) {
                    statusLabel.setText(String.valueOf(data.getPieValue())+"%");
                    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }
            }
            );
        }
    }    
    

    @FXML private void labelMouseEnterOnClick(MouseEvent event) {
    }

    @FXML
    private void setTraining(MouseEvent event) throws IOException {
        Parent fileChooserViewParent = FXMLLoader.load(getClass().getResource("workshop.fxml"));
        Scene fileChooserViewScene = new Scene(fileChooserViewParent);
        //Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Stage newWindow  = new Stage();
        newWindow.setResizable(false);
        newWindow.setTitle("Workshop Stage");
        newWindow.setScene(fileChooserViewScene);
        newWindow.show();
    }

    @FXML
    private void sendMailButton(MouseEvent event) {
    }
    
}
