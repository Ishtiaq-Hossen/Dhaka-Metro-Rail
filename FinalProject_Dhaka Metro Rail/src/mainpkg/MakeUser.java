package mainpkg;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Ishti
 */
public class MakeUser {
    /*
    public static void main(String[] args){
        
       ArrayList<User>list=new ArrayList<User>();
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int id;
       String pass;
       String userType;
       for(int i=0;i<n;i++)
       {
            id=s.nextInt();
            pass=s.nextLine();
            userType=s.nextLine();
            if(userType=="Admin")
            {
                list.add(new Admin(id,pass));
            }
            if(userType=="Head")
            {
                list.add(new HeadOfSecurity(id,pass));
            }
       }
       try{
            FileOutputStream fos = new FileOutputStream("userObjects.bin",true);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for(User temp: list)
                oos.writeObject(temp);
            oos.close();
        }
        catch(Exception e){
                //SHOW e.toString() IN AN ALERT
        }
       
       
       
        
    }
*/    

}
