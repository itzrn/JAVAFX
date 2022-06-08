package com.example.fx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class FX_02 extends Application implements EventHandler<ActionEvent> {
    Button button;
    Button button01;
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("This is Title of Window");

        button=new Button();
        button01=new Button();
        button.setText("Click");
        button01.setText("Exit");

        button.setOnAction(this);//this is used here
        //it tells that whatever operation is there available in handle method
        // will get implement automatically
        button01.setOnAction(this);//this tell that ---> Whenever the action occur to this
        // button, look for handle method in the particular class

        StackPane stackPane=new StackPane();
//        stackPane.getChildren().add(button);
//        stackPane.getChildren().add(button01);
        StackPane.setAlignment(button, Pos.CENTER_LEFT);
        StackPane.setAlignment(button01,Pos.TOP_CENTER);
        stackPane.getChildren().addAll(button,button01);

        Scene scene=new Scene(stackPane,400,400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        if (actionEvent.getSource()==button)
            System.out.println("That i love it when you touch me there....");
        else if(actionEvent.getSource()==button01)
            System.exit(0);
    }
}