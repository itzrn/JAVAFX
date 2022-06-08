package com.example.fx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FX_09FlowPane extends Application {
    Stage window;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    TextField textField1;
    public void start(Stage primaryStage){
        window=primaryStage;
        b1=new Button("b1");
        b1.setMinWidth(250);
        b2=new Button("b2");
        b3=new Button("b3");
        b4=new Button("b4");
        b5=new Button("b5");
        b6=new Button("b6");
        b7=new Button("b7");
        b8=new Button("b8");
        b9=new Button("b9");

        textField1=new TextField("Aryan");
        textField1.setMinWidth(300);


        FlowPane flowPane=new FlowPane();
        flowPane.setPadding(new Insets(20));
        flowPane.setHgap(10);
        flowPane.setVgap(10);
        flowPane.setOrientation(Orientation.VERTICAL);
        flowPane.getChildren().addAll(b1,b2,b3,b4,b5,b6,b7,b8,b9,textField1);

        Scene scene=new Scene(flowPane,1000,500);//width n length
        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
