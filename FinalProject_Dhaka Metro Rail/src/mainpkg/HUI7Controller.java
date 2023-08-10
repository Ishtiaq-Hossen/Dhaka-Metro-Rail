/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpkg;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Ishti
 */
public class HUI7Controller implements Initializable {

    @FXML private ComboBox<String> departmentNameComboBox;
    @FXML private TableView<Strategy> StrategyTableView;
    @FXML private TextField newPlanTextField;
    @FXML private TableColumn<Strategy,Integer> noColumn;
    @FXML private TableColumn<Strategy,String> planTableColumn;
    public ArrayList<Strategy>stList;
    private ObservableList<Strategy> newSt=FXCollections.observableArrayList();
    private String temp;
   
    //======Implementing method starts here==========/
    
    public ObservableList<Strategy> getSt1(){
        ObservableList<Strategy> stOversable= FXCollections.observableArrayList();        
        //rulesOversable=new ObservableList<Rules>();
        stOversable.add(new Strategy(1,"Passenger Need to be arrive in time"));
        stOversable.add(new Strategy(2,"Controll room disaster will be handled by Engineer immidietly"));
        stOversable.add(new Strategy(3,"Mrt Card will be checked by station master"));
        return stOversable;
        
    }
    public ObservableList<Strategy> getSt2(){
        ObservableList<Strategy> stOversable= FXCollections.observableArrayList();        
        //rulesOversable=new ObservableList<Rules>();
        stOversable.add(new Strategy(1,"Accounting dept"));
        stOversable.add(new Strategy(2,"Personal hand Bag not allowed"));
        stOversable.add(new Strategy(2,"Cash should be handed over with the Metro security help"));
        return stOversable;
        
    }
    public ObservableList<Strategy> getSt3(){
        ObservableList<Strategy> stOversable= FXCollections.observableArrayList();        
        //rulesOversable=new ObservableList<Rules>();
        
        stOversable.add(new Strategy(1,"Controll room disaster will be handled by Engineer immidietly"));
        stOversable.add(new Strategy(2,"Mrt Card will be checked by station master"));
        return stOversable;
        
    }
    
    /**
     * Initializes the controller class.
    */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        departmentNameComboBox.getItems().addAll("Ticket Selling","Accounting","Control Room Operator");
        departmentNameComboBox.setValue("Accounting");
                
    }    
    //=============button onclick method starts here======/
    
    @FXML
    private void addNewPlanButtonOnClick(MouseEvent event) {
    }

    @FXML
    private void loadTableButtonOnClick(MouseEvent event) {
        temp=departmentNameComboBox.getValue().toString();
        if(temp=="Ticket Selling")
        {
            newSt=getSt1();
            noColumn.setCellValueFactory(new PropertyValueFactory<Strategy,Integer>("no"));
            planTableColumn.setCellValueFactory(new PropertyValueFactory<Strategy,String>("stName"));
            StrategyTableView.setItems(newSt);
        }
        else if(temp=="Accounting")
        {
            newSt=getSt2();
            noColumn.setCellValueFactory(new PropertyValueFactory<Strategy,Integer>("no"));
            planTableColumn.setCellValueFactory(new PropertyValueFactory<Strategy,String>("stName"));
            StrategyTableView.setItems(newSt);
        }
        else if(temp=="Control Room Operator")
        {
            newSt=getSt3();
            noColumn.setCellValueFactory(new PropertyValueFactory<Strategy,Integer>("no"));
            planTableColumn.setCellValueFactory(new PropertyValueFactory<Strategy,String>("stName"));
            StrategyTableView.setItems(newSt);
        }
        
    }
    
}
