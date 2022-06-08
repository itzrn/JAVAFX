package com.example.fx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/*
There is five section of a window
1.Top
2.Left
3.Center
4.Right
5.Bottom
 */
public class FX_08 extends Application {
    Stage window;
    Button buttonA;
    Button buttonB;
    Button buttonC;
    Button buttonD;
    Button buttonE;
    Button buttonF;
    public void start(Stage primaryStage){
        window=primaryStage;
        window.setTitle("Code With Aryan");

        HBox topMenu=new HBox();//its a layout
        buttonA=new Button("File");
        buttonB=new Button("Edit");
        buttonC=new Button("View");
        topMenu.getChildren().addAll(buttonA,buttonB,buttonC);

        VBox leftMenu=new VBox();
        buttonD=new Button("D");
        buttonE=new Button("A");
        buttonF=new Button("F");
        leftMenu.getChildren().addAll(buttonD,buttonE,buttonF);

        BorderPane borderPane=new BorderPane();
        borderPane.setTop(topMenu);
        borderPane.setLeft(leftMenu);

        Scene scene=new Scene(borderPane,500,500);
        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
