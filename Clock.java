
import java.util.Scanner;
import java.util.Random;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.*;
import javafx.scene.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.scene.text.*;
import javafx.scene.layout.HBox;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.animation.AnimationTimer;
import java.time.LocalTime;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Background;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;
import javafx.scene.Node;

/*********************************************************************************************************
* @authorname - Rudolph Stephen
* @version - 1st February 2025
* Description - This class represents an object which represents a Clock. Thic clock object uses digits, 
* indicators(am or pm), keyframe to represent all the functionalities of a clock using the corresponding
* methods.
*********************************************************************************************************/
public class Clock extends HBox
    {   //instance data
        private Clockdigit myDigit1;
        private Clockdigit myDigit2;
        private Clockdigit myDigit3;
        private Clockdigit myDigit4;
        private Clockdigit myDigit5;
        private Clockdigit myDigit6;
        
        private boolean isAm = true;
        private Timeline time;
        
        private AmPmIndicator ampm;
        
         /********************************************
         * @author - Rudolph Stephen
         * @version - 1st February 2025
         * This is a default constructor which sets 
         * the time to 12:00:00 Am by default by
         * using Clockdigit objects 
         ********************************************/
        public Clock()
        {   
            //The colons between the digits 
            Text colon1 = new Text(":");
            colon1.setFont(Font.font(100));
            colon1.setFill(Color.RED);
            Text colon2 = new Text(":");
            colon2.setFont(Font.font(100));
            colon2.setFill(Color.RED);
            
            ampm = new AmPmIndicator();
            
            //uses isAm instance data to make changes to the 
            //AmPmIndicator object named ampm. 
            if(isAm == true)
            {
                ampm.setAm();
                isAm = true;
            }
            else
            {
                ampm.setPm();
                isAm = false;
            }
            
              
            
            
            
            //first 2 digits
            myDigit1 = new Clockdigit(50, 350, 10,50 );
            myDigit2 = new Clockdigit(50, 350, 10,50 );
            
            //next 2 digits
            myDigit3 = new Clockdigit(50, 350, 10,50 );
            myDigit4 = new Clockdigit(50, 350, 10,50 );
            
            //last 2 digits
            myDigit5 = new Clockdigit(50, 350, 10,50 );
            myDigit6 = new Clockdigit(50, 350, 10,50 );
            
            //sets the value of digits so that they 
            //display those values
            myDigit1.insertDigit(1);
            myDigit2.insertDigit(2);
            myDigit3.insertDigit(0);
            myDigit4.insertDigit(0);
            myDigit5.insertDigit(0);
            myDigit6.insertDigit(0);
            
            //cosmetic changes - alignment
            //since this class extends a HBox, the code below adds the digits, colons, and ampm into the 
            //HBox to ease things a bit.
            setSpacing(5);
            setAlignment(Pos.CENTER);
            setBackground(new Background(new BackgroundFill(Color.BLACK, null, null)));
            getChildren().addAll(myDigit1, myDigit2, colon1, myDigit3, myDigit4, colon2, myDigit5, myDigit6, ampm);
            
        }
        
        /**************************************************
         * @author - Rudolph Stephen
         * @version - 1st February 2025
         * Parametered constructor. takes the values 
         * of the digits and true or false, if the time 
         * is morning (am) or afternoon(pm), as parameters
         *************************************************/
        public Clock(int d1, int d2, int d3, int d4, int d5, int d6, boolean isAm)
        {   
            //colons
            Text colon1 = new Text(":");
            colon1.setFont(Font.font(100));
            colon1.setFill(Color.RED);
            Text colon2 = new Text(":");
            colon2.setFont(Font.font(100));
            colon2.setFill(Color.RED);
            this.isAm = isAm;
            
            ampm = new AmPmIndicator();
        
            
            if(isAm == true)
            {
                ampm.setAm();
                isAm = true;
            }
            else 
            {
                ampm.setPm();
                isAm = false;
            }
            
            
            
            myDigit1 = new Clockdigit(50, 350, 10,50 );
            myDigit2 = new Clockdigit(50, 350, 10,50 );
            
            
            myDigit3 = new Clockdigit(50, 350, 10,50 );
            myDigit4 = new Clockdigit(50, 350, 10,50 );
            
            myDigit5 = new Clockdigit(50, 350, 10,50 );
            myDigit6 = new Clockdigit(50, 350, 10,50 );
            
            myDigit1.insertDigit(d1);
            myDigit2.insertDigit(d2);
            myDigit3.insertDigit(d3);
            myDigit4.insertDigit(d4);
            myDigit5.insertDigit(d5);
            myDigit6.insertDigit(d6);
            
            setSpacing(5);
            setAlignment(Pos.CENTER);
            setBackground(new Background(new BackgroundFill(Color.BLACK, null, null)));
            getChildren().addAll(myDigit1, myDigit2, colon1, myDigit3, myDigit4, colon2, myDigit5, myDigit6, ampm);
            
        
        }
    
        /********************************************
         * @author - Rudolph Stephen
         * @version - 1st February 2025
         * This method uses LocalTime and KeyFrame to 
         * start the clock.
         ********************************************/
        public void startClock()
        {   //keyframe created
            KeyFrame myKeyFrame = new KeyFrame(Duration.seconds(1), event -> 
            {
                
                LocalTime timeNow = LocalTime.now();
                
                int sec = myDigit6.getValue();
                
                //increment the last digit/sec which represents time in seconds
                myDigit6.setValue( sec + 1);
                
                //overflow logic of the digits, which imitates that of a clock
                if(myDigit6.getValue()==10)
                {   
                    myDigit5.setValue(myDigit5.getValue() + 1);
                    myDigit6.setValue(0);
                
                }
                
                
                if(myDigit5.getValue()==6)
                {
                    myDigit4.setValue(myDigit4.getValue() + 1);
                    myDigit5.setValue(0);
                }
                
                
                if(myDigit4.getValue()==10)
                {   
                    myDigit3.setValue(myDigit3.getValue() + 1);
                    myDigit4.setValue(0);
                
                }
                
                
                if(myDigit3.getValue()==6)
                {   
                    myDigit2.setValue(myDigit2.getValue() + 1);
                    myDigit3.setValue(0);
                
                }
                
                
                if(myDigit2.getValue() == 10)
                {
                    myDigit1.setValue(myDigit1.getValue() + 1);
                    myDigit2.setValue(0);
                }
                
                if(myDigit1.getValue() == 1 && myDigit2.getValue() == 2 && myDigit6.getValue() == 0 && myDigit5.getValue() == 0 && myDigit4.getValue() == 0 && myDigit3.getValue() == 0)
                {   
                    if(isAm == true)
                    {
                        ampm.setPm();
                        isAm = false;
                    }
                    else
                    {
                        ampm.setAm();
                        isAm = true;
                    }
                
                } 
                
                
                
                
            }
            );
            time = new Timeline(myKeyFrame);
            time.setCycleCount(Timeline.INDEFINITE);
            time.play();
            
            
            
        }
        
        /********************************************
         * @author - Rudolph Stephen
         * @version - 1st February 2025
         * This method stops the clock
         ********************************************/
        public void stopClock()
        {
            time.stop();
        }
    
    
    
    
    
    
    
}