package com.example.fx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FX_09GridPaneB extends Application {
    Stage window;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    public void start(Stage primaryStage){
        window=primaryStage;
        Text text1=new Text("XYZ");
        button1=new Button("A");
        button1.setMinSize(40,40);
        button2=new Button("B");
        button2.setMinSize(40,40);
        button3=new Button("B");
        button3.setMinSize(40,40);
        button4=new Button("C");
        button4.setMinSize(40,40);
        GridPane gridPane=new GridPane();
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.setAlignment(Pos.CENTER); //---> U can make the gridPane at center

        gridPane.setPadding(new Insets(0,500,500,0));//(distance from top, distance from right end(not matters more), distance from down(not matters more), distance from left End)
        /*
        Insets(double topRightBottomLeft)
        Constructs a new Insets instance with same value for all four offsets.


        Insets(double top, double right, double bottom, double left)
        Constructs a new Insets instance with four different offsets
         */

        //to put the elements in a particular grid use the following function given below
        gridPane.add(text1,0,0);
        gridPane.add(button1,1,0);
        gridPane.add(button2,2,0);
        gridPane.add(button3,1,1);
        gridPane.add(button4,2,1);
        /*
        GridPane.setConstraints(button1,5,1);//use to set the position of button in grid
        GridPane.setConstraints(button2,5,2);
        GridPane.setConstraints(button3,6,1);
        GridPane.setConstraints(button4,6,2);
        gridPane.getChildren().addAll(button1,button2,button3,button4);
         */

        window.setTitle("Grid Pane");
        Scene scene=new Scene(gridPane,500,500);
        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
