package com.example.fx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class FX_03a extends Application {
    Button button01;
    Button button02;
    public void start(Stage primaryStage)throws Exception{
        button01=new Button("CLick");
        button02=new Button("Exit");


        button01.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("I am a Anonymous");
            }
        });
        button02.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.exit(0);
            }
        });//this can also be written in small code

        //Sequence setting
        StackPane stackPane=new StackPane();
        stackPane.getChildren().add(button01);
        stackPane.getChildren().add(button02);

        //scene setting
        Scene scene=new Scene(stackPane,400,400);

        //to stage a scene and setting the stage to show
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
