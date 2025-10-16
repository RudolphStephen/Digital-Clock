
import javafx.scene.layout.Pane;

/*********************************************************************************************************
* @authorname - Rudolph Stephen
* @version - 1st February 2025
* Description - This class represents an object which represents a clock digit. It uses DigitLine object
* to build itself up into a digit using lines. This class contains different methods to change or 
* increment the value of each digit fur future use in other classes. 
*********************************************************************************************************/
public class Clockdigit extends Pane
    {   //instance data
        private double width;
        private double gap = 8;
        public double startPointX;
        public double startPointY;
        private double height;
        public int digitValue = 0;
        
        private DigitLine DigitLine1; 
        private DigitLine DigitLine2;
        private DigitLine DigitLine3; 
        private DigitLine DigitLine4; 
        private DigitLine DigitLine5; 
        private DigitLine DigitLine6; 
        private DigitLine DigitLine7; 
            
         /********************************************
         * @author - Rudolph Stephen
         * @version - 1st February 2025
         * This is a constructor which takes in the 
         * coordinate values and dimensions in place 
         * of the parameters and uses them to create
         * a digit which can be manipulated. 
         ********************************************/  
        public Clockdigit(double X, double Y, double width, double length)
        {   
            this.startPointX = X;
            this.startPointY = Y;
            this.height = length;
            this.width = width;
            
            //Graph coordinates of the constructed digits 
            DigitLine1 = new DigitLine(startPointX, startPointY, width , height);
            DigitLine2 = new DigitLine(startPointX, startPointY + 2*gap + height, width , height);
            DigitLine3 = new DigitLine(startPointX + gap, startPointY + 2*height + 2*gap, height , width);
            DigitLine4 = new DigitLine(startPointX + 2*gap + height, startPointY + 2*gap + height, width , height);
            DigitLine5 = new DigitLine(startPointX + gap, startPointY + height + gap/2, height , width);
            DigitLine6 = new DigitLine(startPointX + 2*gap + height, startPointY, width , height);
            DigitLine7 = new DigitLine(startPointX + gap, startPointY - gap, height, width );
            
            //adding them into the pane
            getChildren().addAll(DigitLine1, DigitLine2, DigitLine3, DigitLine4, DigitLine5, DigitLine6, DigitLine7);
            
        }
        
         /********************************************
         * @author - Rudolph Stephen
         * @version - 1st February 2025
         * This method accepts **INITIAL** integer values 
         * in place of the parameters and sets the value
         * of the digit to the passed integer value.
         ********************************************/
        public void insertDigit(int digit)
        {   switch(digit)
            {   case 0:
                    
                    setValue(0);
                    break;
                case 1:
                    
                    setValue(1);
                    break;  
                case 2:
                    
                    setValue(2);
                    break;
                case 3:
                    
                    setValue(3);
                    break; 
                case 4:
                    
                    setValue(4);
                    break;
                case 5:
                    
                    setValue(5);
                    break;
                case 6: 
                    
                    setValue(6);
                    break;
                case 7:
                    
                    setValue(7);
                    break;
                case 8:
                    
                    setValue(8);
                    break;
                case 9: 
                    
                    setValue(9);
                    break;
                   
                
            }
            
            
            
        }
        
        /********************************************
         * @author - Rudolph Stephen
         * @version - 1st February 2025
         * This method accepts integer values to
         * set the value of the digit and changes
         * combination of DigitLine objects to on/off 
         * to make the arrangement look like the number
         * that was passed in the parameter list.
         ********************************************/
        public int setValue(int value)
        {
            this.digitValue = value;
             switch(value)
                    {   case 0:
                            DigitLine1.turnOn();
                            DigitLine2.turnOn();
                            DigitLine3.turnOn();
                            DigitLine4.turnOn();
                            DigitLine5.turnOff();
                            DigitLine6.turnOn();
                            DigitLine7.turnOn();
                            
                            break;
                        case 1:
                            DigitLine1.turnOff();
                            DigitLine2.turnOff();
                            DigitLine3.turnOff();
                            DigitLine5.turnOff();
                            DigitLine4.turnOn();
                            DigitLine6.turnOn();
                            DigitLine7.turnOff();
                            
                            break;  
                        case 2:
                            DigitLine1.turnOff();
                            DigitLine2.turnOn();
                            DigitLine3.turnOn();
                            DigitLine4.turnOff();
                            DigitLine5.turnOn();
                            DigitLine6.turnOn();
                            DigitLine7.turnOn();
                            
                            break;
                        case 3:
                            DigitLine1.turnOff();
                            DigitLine2.turnOff();
                            DigitLine3.turnOn();
                            DigitLine4.turnOn();
                            DigitLine5.turnOn();
                            DigitLine6.turnOn();
                            DigitLine7.turnOn();
                            
                            break; 
                        case 4:
                            DigitLine1.turnOn();
                            DigitLine2.turnOff();
                            DigitLine3.turnOff();
                            DigitLine4.turnOn();
                            DigitLine5.turnOn();
                            DigitLine6.turnOn();
                            DigitLine7.turnOff();
                            
                            break;
                        case 5:
                            DigitLine1.turnOn();
                            DigitLine2.turnOff();
                            DigitLine3.turnOn();
                            DigitLine4.turnOn();
                            DigitLine6.turnOff();
                            DigitLine5.turnOn();
                            DigitLine7.turnOn();
                            
                            break;
                        case 6: 
                            DigitLine1.turnOn();
                            DigitLine2.turnOn();
                            DigitLine3.turnOn();
                            DigitLine4.turnOn();
                            DigitLine5.turnOn();
                            DigitLine6.turnOff();
                            DigitLine7.turnOn();
                           
                            break;
                        case 7:
                            DigitLine1.turnOff();
                            DigitLine2.turnOff();
                            DigitLine3.turnOff();
                            DigitLine5.turnOff();
                            DigitLine4.turnOn();
                            DigitLine6.turnOn();
                            DigitLine7.turnOn();
                            
                            break;
                        case 8:
                            DigitLine1.turnOn();
                            DigitLine2.turnOn();
                            DigitLine3.turnOn();
                            DigitLine4.turnOn();
                            DigitLine5.turnOn();
                            DigitLine6.turnOn();
                            DigitLine7.turnOn();
                            
                            break;
                        case 9: 
                            DigitLine1.turnOn();
                            DigitLine2.turnOff();
                            DigitLine3.turnOn();
                            DigitLine4.turnOn();
                            DigitLine5.turnOn();
                            DigitLine6.turnOn();
                            DigitLine7.turnOn();
                            
                            break;
            
            
                    }        
        
          
        
            return digitValue;
        }
        
        /********************************************
         * @author - Rudolph Stephen
         * @version - 1st February 2025
         * Returns the current value of the Digit 
         ********************************************/
        public int getValue()
        {
            return this.digitValue;
        }
}