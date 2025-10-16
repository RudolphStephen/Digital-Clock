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
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

/*********************************************************************************************************
* @authorname - Rudolph Stephen
* @version - 1st February 2025
* Description - This class uses all of my clock objects and its components makes makes the clock run 
* Without error. 
*********************************************************************************************************/
public class ClockDriver extends Application
{   @Override
    public void start(Stage clock)
    {   
        Clock myClock = new Clock(0,5,0,6,3,5, false);
        boolean isOn;
        Button button1 = new Button("Start");
        Button button2 = new Button("Stop");
        
        //extra functionality in the form of buttons to start/stop the clock effectively.
        button1.setOnAction(event -> 
        {
            myClock.startClock();
            button1.setDisable(true);
            
        });
        
        button2.setOnAction(event -> 
        {
            myClock.stopClock();
            button1.setDisable(false);
        });
        
        //Clock face design. 
        //begins by adding the buttons in a VBox,setting the spacing, alignment, etc.
        HBox hbox = new HBox();
        VBox vbox = new VBox();
        vbox.getChildren().addAll(button1, button2);
        vbox.setSpacing(5);
        vbox.setAlignment(Pos.CENTER);
        vbox.setBackground(new Background(new BackgroundFill(Color.BLACK, null, null)));
        
        //adding the clock alongside the buttons in a Hbox then setting the aligntment 
        //to center so all looks uniform. 
        hbox.getChildren().addAll(myClock, vbox);
        hbox.setBackground(new Background(new BackgroundFill(Color.BLACK, null, null)));
        hbox.setSpacing(20);
        hbox.setAlignment(Pos.CENTER);
        
        
        Scene myScene = new Scene(hbox, 1200, 300);
        
        //show clock
        clock.setScene(myScene);
        clock.setMaximized(true);
        clock.show();
        
    }
    
    
}
