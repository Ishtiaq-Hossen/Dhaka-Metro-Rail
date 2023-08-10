
package mainpkg;
/**
 *
 * @author Ishti
 */
public class Strategy {
    private String stName;
    private int no;

    public Strategy(int no,String stName) {
        this.stName = stName;
        this.no = no;
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }
    
}
