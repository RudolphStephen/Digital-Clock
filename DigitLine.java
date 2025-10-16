
import javafx.scene.shape.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
/*************************************************************************************************************
* @authorname - Rudolph Stephen
* @version - 1st February 2025
* Description - This class represents a line object which in reality is a rectangle which looks like a 
* very thick line. This line object cant be manipulated to visually represnt anything such as a digit.
* It has turnOn and turnOff methods which simply change the color of the line to RED (if on) or GRAY (if off).
*************************************************************************************************************/
public class DigitLine extends Rectangle
{ 
    /********************************************
    * @author - Rudolph Stephen
    * @version - 1st February 2025
    * This is a constructor which takes in the 
    * coordinate values and dimensions in place 
    * of the parameters and uses them to create
    * a line (represented by a rectangle) which 
    * can be resized and replaced at different 
    * coordinates. 
    ********************************************/            
   public DigitLine(double startX, double startY, double width, double height)
   {   super(startX, startY, width, height);
       setStroke(Color.DARKSLATEGRAY);
       setFill(Color.DARKSLATEGRAY);
   }
   
   /********************************************
    * @author - Rudolph Stephen
    * @version - 1st February 2025
    * This method turns the line on (changes 
    * color to red).
    ********************************************/  
   public void turnOn()
   {
       setStroke(Color.RED);
       setFill(Color.RED);
   }
   
   /********************************************
    * @author - Rudolph Stephen
    * @version - 1st February 2025
    * This method turns the line off (changes 
    * color to gray).
    ********************************************/ 
   public void turnOff()
   {
       setStroke(Color.DARKSLATEGRAY);
       setFill(Color.DARKSLATEGRAY);
   }
   
   
}