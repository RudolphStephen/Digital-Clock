import javafx.scene.text.*;
import javafx.scene.Group;
import javafx.scene.paint.*;
import javafx.scene.layout.VBox;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

/*********************************************************************************************************
* @authorname - Rudolph Stephen
* @version - 1st February 2025
* Description - This class represents an object which represents AmorPm indicator. Making an AmPm object 
* gives the author the freedom to customize it however they want,just as I have done. This object can be 
* initialized in other classes to indicate whether it is am or pm.
*********************************************************************************************************/
public class AmPmIndicator extends VBox
{   //instance data
    private Text am;
    private Text pm;
    
    /********************************************
     * @author - Rudolph Stephen
     * @Version - 1st February 2025
     * default constructor (not overloaded) - 
     * sets the value of am or pm to say AM and PM
     ********************************************/
    public AmPmIndicator()
    {
        //setting the value of am to display 'AM'
        am = new Text("  AM");
        am.setFill(Color.DARKSLATEGRAY);
        am.setFont(Font.font(30));
                 
        //setting the value of pm to display 'PM'
        pm = new Text("  PM");
        pm.setFill(Color.DARKSLATEGRAY);
        pm.setFont(Font.font(30));
        
        
        setSpacing(1);
        setAlignment(Pos.CENTER);
        setBackground(new Background(new BackgroundFill(Color.BLACK, null, null)));
        getChildren().addAll(am, pm);
        
         
    }
    /********************************************
     * @author - Rudolph Stephen
     * @version - 1st February 2025
     * this methor changes color of am text to red
     * and pm text to gray so it is clear that 
     * the time shown is morning time
     ********************************************/
    public void setAm()
    {
        am.setFill(Color.RED);
        pm.setFill(Color.DARKSLATEGRAY);
    
    }
    /********************************************
     * @author - Rudolph Stephen
     * @version - 1st February 2025
     * this methor changes color of pm text to red
     * and am text to gray so it is clear that 
     * the time shown is afternoon time
     ********************************************/
    public void setPm()
    {
        pm.setFill(Color.RED);
        am.setFill(Color.DARKSLATEGRAY);
    }

   
}
