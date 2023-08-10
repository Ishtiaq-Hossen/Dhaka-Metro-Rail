
package mainpkg;

/**
 *
 * @author Ishti

*/
public class Route {
    protected String routeName;
    protected boolean routeActive;

    public Route(String routeName, boolean routeActive) {
        this.routeName = routeName;
        this.routeActive = routeActive;
    }
    
    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    public boolean isRouteActive() {
        return routeActive;
    }

    public void setRouteActive(boolean routeActive) {
        this.routeActive = routeActive;
    }
    
    
}
