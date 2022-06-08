package com.example.fx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/*
Every javafx program is needed to extend Application class
 */
public class FX_01 extends Application {
    Button button;
    Button button01;
    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("This is the Title of the Window");// ---> this will set the title

        button=new Button();// we can also directly set text here as --->(button=new Button("Click");)
        button.setText("Click Here");
        button.setOnAction(e->{
            System.out.println("This is a button");
        });
        button01=new Button("Exit");
        button01.setOnAction(e->{
            System.exit(0);
        });

        // there are different kind of layout like ---> StackPane, horizontal line , vertical line
        StackPane stackPane=new StackPane();// which organize everything in a position
        stackPane.getChildren().add(button);
        stackPane.getChildren().add(button01);

        Scene scene=new Scene(stackPane,400,400);
        primaryStage.setScene(scene);

        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
