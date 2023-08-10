package mainpkg;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Ishti
 */
public class UI4Controller implements Initializable {

    @FXML private Label route1;
    @FXML private Label route2;
    @FXML private Label route3;
    @FXML private Label route1active;
    @FXML private Label route2active;
    @FXML private Label route3active;
    @FXML private Label showNotice;
    ArrayList<Route>routeList;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        routeList=new ArrayList<Route>();
        routeList.add(new Route("Uttara North-Uttara South",true));
        routeList.add(new Route("Pallabi-Mirpur10",false));
        routeList.add(new Route("Kazipara-Agargaon",true));
        route1.setText(routeList.get(0).getRouteName());
        route2.setText(routeList.get(1).getRouteName());
        route3.setText(routeList.get(2).getRouteName());
    }    

    @FXML private void enableRoute1(MouseEvent event) {
        if(routeList.get(0).isRouteActive()==true)
        {
            routeList.get(0).setRouteActive(false);
            route1active.setText("Inactive");
        }
        else{
            routeList.get(0).setRouteActive(true);
            route1active.setText("Active");
        }
    }

    @FXML
    private void enableRoute2(MouseEvent event) {
        if(routeList.get(1).isRouteActive()==true)
        {
            routeList.get(1).setRouteActive(false);
            route2active.setText("Inactive");
        }
        else{
            routeList.get(1).setRouteActive(true);
            route2active.setText("Active");
        }
    }

    @FXML private void enableRoute3(MouseEvent event) {
        if(routeList.get(2).isRouteActive()==true)
        {
            routeList.get(2).setRouteActive(false);
            route3active.setText("Inactive");
        }
        else{
            routeList.get(2).setRouteActive(true);
            route3active.setText("Active");
        }
    }

    @FXML private void saveOperation(MouseEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("AdminFxml.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }
    
}
